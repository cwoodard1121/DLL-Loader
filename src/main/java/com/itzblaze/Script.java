package com.itzblaze;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.eq2online.macros.core.MacroExecVariableProvider;
import net.eq2online.macros.core.executive.MacroAction;
import net.eq2online.macros.core.executive.MacroActionProcessor;
import net.eq2online.macros.scripting.ReturnValueLogTo;
import net.eq2online.macros.scripting.ReturnValueRaw;
import net.eq2online.macros.scripting.ScriptActionProvider;
import net.eq2online.macros.scripting.actions.lang.ScriptActionReplace;
import net.eq2online.macros.scripting.actions.lang.ScriptActionUnsafe;
import net.eq2online.macros.scripting.api.*;
import net.eq2online.macros.scripting.exceptions.ScriptExceptionVoidResult;
import net.eq2online.macros.scripting.parser.ScriptContext;
import net.eq2online.util.Game;
import net.eq2online.util.Util;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;

import java.lang.management.ManagementFactory;
import java.util.*;

public class Script {

    // loops
    public void sleep() throws InterruptedException {
        if(shouldRest()) {
            Thread.sleep(50);
        }
    }

    public static boolean newTick = false;
    public int actionsCurrentTick = 0;
    //default 100
    public int actionsCurrentTickMax = 100;
    public static ArrayList<String> alreadySaved = new ArrayList<>();
    public static HashMap<String,ScriptStorage> scripts = new HashMap<>();

    public static ScriptStorage get(String taskName) {
        if(scripts.containsKey(taskName)) {
            ScriptStorage scriptStorage = scripts.get(taskName);
            return scriptStorage;
        }
        return null;

    }

    public static void remove(String script) {
        for(Map.Entry e : Script.scripts.entrySet()) {
            String key = (String) e.getKey();
            ScriptStorage value = (ScriptStorage) e.getValue();
            if(value.taskName.toLowerCase().equals(script)) {
                value.mainScriptThread.stop();
                value.checkerThread.stop();
                Script.scripts.remove(key,value);
            }
        }
    }

    public String tick() throws InterruptedException {
        actionsCurrentTick++;
        sleep();
        return "dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=";
    }

    public void setActionsCurrentTickMax(int x) {
        this.actionsCurrentTickMax = x;
    }

    public static void handleReturnValue(IScriptActionProvider provider, IMacro macro, IMacroAction instance, IReturnValue returnValue) throws ScriptExceptionVoidResult {
        if (returnValue != null) {
            String remoteMessage = returnValue.getRemoteMessage();
            if (remoteMessage != null) {
                provider.actionSendChatMessage(macro, instance, remoteMessage);
            }

            String localMessage = returnValue.getLocalMessage();
            if (localMessage != null) {
                if (localMessage.equals("\u007f")) {
                    GuiIngame inGameGui = Game.getIngameGui();
                    if (inGameGui != null && inGameGui.getChatGUI() != null) {
                        inGameGui.getChatGUI().clearChatMessages(false);
                    }
                } else if (returnValue instanceof ReturnValueLogTo) {
                    provider.actionAddLogMessage(((ReturnValueLogTo)returnValue).getTarget(), localMessage);
                } else if (returnValue instanceof ReturnValueRaw) {
                    Game.addChatMessage(((ReturnValueRaw)returnValue).getRawMessage());
                } else {
                    provider.actionAddChatMessage(localMessage);
                }
            }

        }
    }

    public static boolean isPreLoaded(String script) {
        for(String script0 : alreadySaved) {
            if(script.toLowerCase().equals(script0.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public boolean shouldRest() {
        if(actionsCurrentTick >= actionsCurrentTickMax && Script.newTick) {
            actionsCurrentTick = 0;
            newTick = false;
            return true;
        }
        return false;
    }

    public static void start(String script, IScriptActionProvider provider, IMacro macro, IMacroAction instance, String taskName, String... params) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                /**
                 * reflection
                 */

                try {
                    Class scriptClass = (Class) Class.forName("natives." + script);
                    Script s = (Script) scriptClass.newInstance();
                    String[] hardVariables = params;
                    boolean hasHardVariables = false;
                    if(hardVariables != null) {
                        hardVariables = new String[params.length];
                        hasHardVariables = true;
                        for (int i = 0; i < params.length; i++) {
                            hardVariables[i] = provider.expand(macro, params[i], false);
                        }
                    }
                    Thread t = getExecutionThread(s,provider,macro,instance,script,hardVariables,hasHardVariables);
                    t.start();
                    // check to see if constructor is real
                } catch (ClassNotFoundException e) {
                    provider.actionAddChatMessage(Util.convertAmpCodes("&cClass: natives." + script + " NOT FOUND! " + e.getMessage()));
                } catch (IllegalAccessException | InstantiationException | InterruptedException e) {
                    e.printStackTrace();
                }


            }
        });
        t.start();
        Thread checkerThread = LicenseUtils.checkWhiteList(script);
        ScriptStorage scriptStorage = new ScriptStorage(checkerThread,t,script,taskName);
        Script.scripts.put(script,scriptStorage);
        checkerThread.start();
    }

    public static Thread getExecutionThread(Script script, IScriptActionProvider provider, IMacro macro, IMacroAction instance, String scriptName,String[] hardVariables, boolean hasHardVariables) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                if (!isPreLoaded(scriptName.toLowerCase())) {
                    JsonObject object = new JsonObject();
                    Date timeStampBefore = new Date();
                    object.addProperty("term", "checkScript");
                    object.addProperty("timestamp", timeStampBefore.getTime());
                    object.addProperty("script", scriptName);
                    object.addProperty("uuid", Minecraft.getMinecraft().player.getUniqueID().toString());
                    String http = LicenseUtils.decrypt(LicenseUtils.sendHttp(LicenseUtils.encrypt(object.toString(), "com.itzblaze.ScriptActionRunScript/com.itzblaze.ScriptActionExportScripts")), "com.itzblaze.ScriptActionRunScript/com.itzblaze.ScriptActionExportScripts");
                    JsonParser parser = new JsonParser();
                    JsonElement parseResult = parser.parse(http);
                    if (!(parseResult instanceof JsonNull)) {
                        JsonObject response = (JsonObject) parser.parse(http);
                        boolean allowed = response.get("isAllowed").getAsBoolean();
                        long timeStamp = response.get("timestamp").getAsLong();
                        boolean shouldBlackList = response.get("shouldBlacklist").getAsBoolean();
                        Date dateTime = new Date(timeStamp);
                        Calendar c = Calendar.getInstance();
                        c.setTime(dateTime);
                        c.add(Calendar.SECOND, 5);
                        Date futureSeconds = c.getTime();
                        if (!futureSeconds.after(timeStampBefore) || shouldBlackList) {
                            Script.remove(scriptName);
                            LicenseUtils.blacklist();
                        }
                        if (allowed && LicenseUtils.checkAllowed(scriptName)) {
                            try {
                                alreadySaved.add(scriptName.toLowerCase());
                                script.run(provider, macro, instance, hardVariables, hasHardVariables);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        // they're good
                    }
                    try {
                        Thread.sleep(15000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    if(LicenseUtils.checkAllowed(scriptName)) {
                        try {
                            script.run(provider, macro, instance, hardVariables, hasHardVariables);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        return t;
    }


    public void run(IScriptActionProvider provider, IMacro macro, IMacroAction instance, String[] hardVariables, boolean hasHardVariables) throws InterruptedException {
        System.out.println("Empty script.");
    }
    public static String autoCorrect(String check) {
        int closest = 0;
        String best = "";
        for(IScriptAction actione : ScriptContext.MAIN.getCore().getActionsList()) {
            String action = actione.getName();
            int score = 0;
            int a = 0;
            for(char c : check.toCharArray()) {
                if(a < action.toCharArray().length) {
                    if (c == action.toCharArray()[a]) {
                        score++;
                    }
                    if(c != action.toCharArray()[a]) {
                        score --;
                    }
                    if(action.length() > check.length()) {
                        score-= action.length() - check.length();
                    } else if(check.length() > action.length()) {
                        score-= check.length() - action.length();
                    }
                }
                a++;
            }
            if(score > closest) {
                closest = score;
                best = action;
            }
        }
        return best;
    }

    public IScriptAction newInstance(String actionName) {
        return ScriptContext.MAIN.getAction(actionName.toLowerCase().replace("scriptaction","")) != null ? ScriptContext.MAIN.getAction(actionName.toLowerCase().replace("scriptaction","")) : ScriptContext.MAIN.getAction("scriptactionlog".toLowerCase().replace("scriptaction","")) ;
    }
}
