package com.itzblaze;

import com.google.gson.Gson;
import net.eq2online.macros.core.MacroExecVariableProvider;
import net.eq2online.macros.core.MacroTemplate;
import net.eq2online.macros.core.Macros;
import net.eq2online.macros.core.executive.MacroActionProcessor;
import net.eq2online.macros.scripting.api.*;
import net.eq2online.macros.scripting.parser.ScriptAction;
import net.eq2online.macros.scripting.parser.ScriptContext;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;




class Line {
    public String code;

    public Line(String code) {
        this.code = code;
    }

    public void semicolon() {
        code = code + ";";
    }
}



class Action {
    public String actionName;
    public String rawParams;
    public String outVar;
    public String[] params;

    public Action(String actionName, String rawParams, String outVar, String[] params) {
        this.actionName = actionName;
        this.rawParams = rawParams;
        this.outVar = outVar;
        this.params = params;
    }
}

class S {
    public ArrayList<Action> script;

    public S() {
        this.script = new ArrayList<>();
    }


}




@APIVersion(26)
public class ScriptActionExportScripts extends ScriptAction {
    public ScriptActionExportScripts() {
        super(ScriptContext.MAIN,"exportscripts");
    }

    @Override
    public boolean isThreadSafe() {
        return false;
    }

    public static String strAfter(String source, String afterFind) {
        int index = source.indexOf(afterFind);
        int length = source.length();
        StringBuilder b = new StringBuilder();
        for(int i = index; i < length; i++) {
            b.append(source.charAt(i));
        }
        return b.toString();
    }

    public static String strBefore(String source, String beforeFind) {
        int index = source.indexOf(beforeFind);
        int length = source.length();
        StringBuilder b = new StringBuilder();
        for(int i = index; i > 0; i--) {
            if(source.charAt(i) == ' ') {
                // we're done here.
                break;
            }
            b.append(source.charAt(i));
        }
        return b.reverse().toString();
    }

    @Override
    public IReturnValue execute(IScriptActionProvider provider, IMacro macro, IMacroAction instance, String rawParams, String[] params) {
        try {
            File file = new File(Macros.getInstance().getMacrosDirectory() + "\\scripts");
            for (File entry : file.listFiles()) {
                entry.createNewFile();
                StringBuilder b = new StringBuilder();
                BufferedReader reader = new BufferedReader(new FileReader(entry));
                String l = null;
                while ((l = reader.readLine()) != null) {
                    b.append(l);
                }
                reader.close();
                List<IMacroAction> actions = context.getCore().getParser().parseScript(MacroActionProcessor.compile(context.getParser(), "MACRO", (this.macros.getSettings()).maxInstructionsPerTick, (this.macros.getSettings()).maxExecutionTime, macros), b.toString());
                Gson gson = new Gson();
                S script = new S();
                for(IMacroAction action : actions) {
                    Action a = new Action(action.getAction().getName(),action.getRawParams(),action.getOutVarName() == null ? "" : action.getOutVarName(),action.getParams());
                    script.script.add(a);
                }
                File f = new File(provider.expand(macro,params[0],false) + entry.getName());
                BufferedWriter w = new BufferedWriter(new FileWriter(f));
                w.write(gson.toJson(script));
                w.close();
            }

        } catch (Exception e ) {
            e.printStackTrace();
        }
            return null;
    }

    public static String random() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        return salt.toString();
    }

//    public static String data() {
//        ArrayList<Line> lines = new ArrayList<>();
//        int i = 0;
//        for(String action : actions) {
//            String actionSemiColon = action + ";";
//            action = action.replace("\"","\\\"");
//            Matcher scriptActionPatternMatcher = PATTERN_SCRIPTACTION.matcher(action);
//            String rawParams = "";
//            lines.add(new Line("tick();"));
//            if (scriptActionPatternMatcher.matches()) {
//                rawParams = scriptActionPatternMatcher.group(2);
//            }
//            String[] params = rawParams.split(",");
//            String actionName = (("" + action.toCharArray()[0]).toUpperCase() + action.substring(1)).split("\\(")[0];
//            actionName = actionName.toLowerCase();
//            if (actionName.equals("if")) {
//                lines.add(new Line("if(provider.getExpressionEvaluator(macro,provider.expand(macro,\"" + rawParams + "\",true)).evaluate() != 0) {"));
//                continue;
//            }
//            if (actionName.equals("elseif")) {
//                lines.add(new Line("} else if(provider.getExpressionEvaluator(macro,provider.expand(macro,\"" + rawParams + "\",false)).evaluate() != 0) {"));
//                continue;
//            }
//            if (actionName.equals("else")) {
//                lines.add(new Line("} else {"));
//                continue;
//            }
//            if(actionName.equals("gettablists")) {
//                lines.add(new Line("\n" +
//                        "            try { " +
//                        "            " +
//                        "            StringBuilder builder = new StringBuilder();\n" +
//                        "            Collection<NetworkPlayerInfo> infos = Minecraft.getMinecraft().getConnection().getPlayerInfoMap();\n" +
//                        "            for (NetworkPlayerInfo info : infos) {\n" +
//                        "                if (info != null) {\n" +
//                        "                    String name = (info.getDisplayName() != null) ? info.getDisplayName().getUnformattedText() : \"\";\n" +
//                        "                    builder.append(name);\n" +
//                        "                }\n" +
//                        "            }\n" +
//                        "            returnValue.putStrings(tablist);\n" +
//                        "            provider.setVariable(macro,\"" + rawParams.replace("[]","") + "\",builder.toString());\n" +
//                        "            } catch (Exception e) {}"));
//                continue;
//            }
//            if (actionName.equals("break")) {
//                lines.add(new Line("break;"));
//                continue;
//            }
//            if (actionName.equals("ifcontains")) {
//                String rand = random();
//                lines.add(new Line("String rawParams" + "ifcontains" + rand + " = \"" + rawParams + "\";"));
//                lines.add(new Line("String[] params" + "ifcontains" + rand + "= rawParams" + actionName + rand + ".split(\",\");"));
//                lines.add(new Line("IScriptAction" + " " + "ifcontains" + rand + " = newInstance(\"" + "ifcontains" + "\");"));
//                lines.add(new Line("if(ifcontains" + rand + ".executeConditional(provider,macro,instance,rawParamsifcontains" + rand + ",rawParamsifcontains" + rand + ".split(\",\"))) {"));
//                continue;
//            }
//            if (actionName.equals("endif")) {
//                lines.add(new Line("}"));
//                continue;
//            }
//            if (actionName.equals("do")) {
//                lines.add(new Line("do {"));
//                continue;
//            }
//            if (action.startsWith("&") || action.startsWith("#") || action.startsWith("@")) {
//                System.out.println(action);
//                if (action.contains("(") && actionSemiColon.contains(");")) {
//                    // return value :(( fuck this
//                    String rand = random();
//                    String var = action.split("=")[0];
//                    String functionName = new StringBuilder().append(autoCorrect("ScriptAction" + new StringBuilder(strBefore(action, "(")).reverse().toString().replace("(", "")).replace("ScriptAction", "").split("=")[0]).reverse().toString();
//                    String rawParamsScript = "null";
//                    try {
//                        rawParamsScript = action.split("\\(")[1].split("\\)")[0];
//                    } catch (ArrayIndexOutOfBoundsException e) {
//
//                    }
//                    String[] paramsScript = rawParamsScript.split(",");
//                    lines.add(new Line("IScriptAction" + " " + functionName + rand + " = newInstance(\"" + functionName.toLowerCase() + "\");"));
//                    if(paramsScript.length > 0) {
//                        lines.add(new Line("IReturnValue ret" + functionName + rand +" = " + functionName + rand + ".execute(provider,macro,instance,\"" + rawParamsScript + "\",\"" + rawParamsScript + "\".split(\",\"));"));
//                    } else {
//                        lines.add(new Line("IReturnValue ret" + functionName + rand + "= " + functionName + rand + ".execute(provider,macro,instance,null,null);"));
//                    }
//                    lines.add(new Line("provider.setVariable(macro,\"" + var + "\",ret" + functionName + rand + ");"));
//                    continue;
//                }
//                // set
//                String rand = random();
//                String var = action.split("=")[0];
//                lines.add(new Line("if(provider.getExpressionEvaluator(macro,provider.expand(macro,\"" + strAfter(action, "=").replace("=", "") + "\",false)).evaluate() != 0) {"));
//                lines.add(new Line("String rawParams" + "Set" + rand + " = "  + "\"" + var + ",\" + provider.getExpressionEvaluator(macro,provider.expand(macro,\"" + strAfter(action, "=").replace("=", "") + "\",true)).evaluate();"));
//                lines.add(new Line("String[] params" + "Set" + rand + "= rawParams" + "Set" + rand + ".split(\",\");"));
//                lines.add(new Line("" + "IScriptAction" + " " + "Set" + rand + " = new ScriptAction" + "Set" + "(ScriptContext.MAIN);"));
//                lines.add(new Line("Set" + rand + ".execute(provider,macro,instance,rawParamsSet" + rand + ",paramsSet" + rand + ");"));
//                lines.add(new Line("} else {"));
//                lines.add(new Line("String rawParams" + "Set" + rand + " = "  + "\"" + var + "\" + \"," + strAfter(action, "=").replace("=", "") + "\";"));
//                lines.add(new Line("String[] params" + "Set" + rand + "= rawParams" + "Set" + rand + ".split(\",\");"));
//                lines.add(new Line("" + "IScriptAction" + " " + "Set" + rand + " = new ScriptAction" + "Set" + "(ScriptContext.MAIN);"));
//                lines.add(new Line("Set" + rand + ".execute(provider,macro,instance,rawParamsSet" + rand + ",paramsSet" + rand + ");"));
//                lines.add(new Line("}"));
//
//                continue;
//            }
//            if(actionName.equals("loop")) {
//                lines.add(new Line("} while(true);"));
//                continue;
//            }
//            if (actionName.equals("while")) {
//                boolean add = lines.add(new Line("} while(" + "provider.getExpressionEvaluator(macro,provider.expand(macro,\"" + rawParams + "\",true)).evaluate() != 0);"));
//                continue;
//            }
//            if (actionName.equals("for")) {
//                String rand = random();
//                lines.add(new Line("IMacroAction " + actionName + rand + "instance = new FakeMacroAction();"));
//                lines.add(new Line("String rawParams" + actionName + rand + " = \"" + rawParams + "\";"));
//                lines.add(new Line("String[] params" + actionName + rand + "= rawParams" + actionName + rand + ".split(\",\");"));
//                lines.add(new Line("IScriptAction" + " " + actionName + rand + " = newInstance(\"" + actionName.toLowerCase() + "\");"));
//                lines.add(new Line("while(" + actionName + rand + ".executeStackPush(provider,macro," + actionName + rand + "instance,rawParams" + actionName + rand+ ",params" + actionName + rand + ")) {"));
//                continue;
//            }
//            if (actionName.equals("next")) {
//                lines.add(new Line("}"));
//                continue;
//            }
//            if (actionName.equals("until")) {
//                lines.add(new Line("} while(" + "provider.getExpressionEvaluator(macro,provider.expand(macro,\"" + rawParams + "\",true)).evaluate() == 0);"));
//                continue;
//            }
//            if(actionName.equals("isrunning")) {
//                if(params.length == 2) {
//                    lines.add(new Line("macro.setVariable(\"" + params[1] + "\"," + "Script.scripts.containsKey(" + params[0] + "));"));
//                }
//                continue;
//            }
//            if(actionName.equals("isinvfull")) {
//                String rand = random();
//                lines.add(new Line("IMacroAction " + actionName + rand + "instance = new FakeMacroAction();"));
//                lines.add(new Line("String rawParams" + actionName + rand + " = \"" + rawParams + "\";"));
//                lines.add(new Line("String[] params" + actionName + rand + "= rawParams" + actionName + rand + ".split(\",\");"));
//                lines.add(new Line("IScriptAction" + " " + actionName + rand + " = newInstance(\"" + actionName.toLowerCase() + "\");"));
//                lines.add(new Line("if(" + actionName + rand + ".executeConditional(provider,macro," + actionName + rand + "instance,rawParams" + actionName + rand + ",params" + actionName + rand + ")) {"));
//                continue;
//            }
//            if(actionName.equals("stop")) {
//                if(rawParams.length() >= 1) {
//                    if(rawParams.split(",")[0].equals("all")) {
//                        lines.add(new Line("Script.scripts.entrySet().forEach(script -> {script.getValue().stop();});"));
//                        continue;
//                    }
//                }
//                if(rawParams.length() == 0) {
//                    lines.add(new Line("Thread.currentThread().stop();"));
//                } else {
//                    lines.add(new Line("Script.get(\"" + rawParams.split(",")[0] + "\").stop();"));
//                }
//                continue;
//            }
//
//            // EXEC
//            if(actionName.equals("exec")) {
//                if(params.length > 0) {
//                    params[0] = params[0].replace(".txt","");
//                    String random = random();
//                    lines.add(new Line("            String script" + random + " = \"" + params[0] + "\";\n" +
//                            "            Thread t" + random + " = new Thread(new Runnable() {\n" +
//                            "                @Override\n" +
//                            "                public void run() {\n" +
//                            "                    try {\n" +
//                            "                        Class scriptClass = (Class) Class.forName(\"natives.\" + \"" + params[0] + "\");\n" +
//                            "                        Script s = (Script) scriptClass.newInstance();\n" +
//                            "                        s.run(provider,macro,instance);\n" +
//                            "                        // check to see if constructor is real\n" +
//                            "                    } catch (ClassNotFoundException e) {\n" +
//                            "                        provider.actionAddChatMessage(Util.convertAmpCodes(\"&cClass: natives.\" + script" + random + "+\" NOT FOUND! \" + e.getMessage()));\n" +
//                            "                    } catch (IllegalAccessException | InstantiationException | InterruptedException e) {\n" +
//                            "                        e.printStackTrace();\n" +
//                            "                    }" +
//                            "                   \n" +
//                            "                }\n" +
//                            "            });\n" +
//                            "            t" + random + ".start();\n" +
//                            "            Script.scripts.put(script" + random + ",t" + random + ");"));
//                }
//                continue;
//            }
//
//
//            actionName = autoCorrect("ScriptAction" + actionName);
//            String rand = random();
//            lines.add(new Line("IMacroAction " + actionName + rand + "instance = new FakeMacroAction();"));
//            lines.add(new Line("String rawParams" + actionName + rand + " = \"" + rawParams + "\";"));
//            lines.add(new Line("String[] params" + actionName + rand + "= rawParams" + actionName + rand + ".split(\",\");"));
//            lines.add(new Line("IScriptAction" + " " + actionName + rand + " = newInstance(\"" + actionName.toLowerCase() + "\");"));
//            lines.add(new Line(actionName + rand + ".execute(provider,macro," + actionName + rand + "instance,rawParams" + actionName + rand + ",params" + actionName + rand + ");"));
//            lines.add(new Line("while(!" + actionName + rand + ".canExecuteNow(provider,macro," + actionName + rand + "instance,rawParams" + actionName + rand + ",params" + actionName + rand + ")){}"));
//
//            i++;
//            // get registered variables from actual code
//        }
//        System.out.println("Java translated code, not indented may have type bugs, fix manually until further notice.");
//        StringBuilder ba = new StringBuilder();
//        ba.append("package natives;\nimport com.itzblaze.Script;\nimport net.eq2online.macros.scripting.api.IMacro;\n" + "import net.eq2online.macros.scripting.api.IMacroAction;\nimport net.eq2online.macros.scripting.api.IScriptAction;\n" + "import net.eq2online.macros.scripting.api.IScriptActionProvider;\nimport net.eq2online.macros.scripting.actions.lang.ScriptActionSet;\n" + "import net.eq2online.macros.core.Macro;\n" +
//                "import net.eq2online.macros.core.MacroPlaybackType;\nimport com.itzblaze.FakeMacroAction;\nimport net.eq2online.macros.scripting.api.*;\n" +
//                "import net.eq2online.macros.core.MacroTemplate;\n" +
//                "import net.eq2online.macros.core.Macros;\n" +
//                "import net.eq2online.macros.core.executive.MacroActionContext;\nimport net.eq2online.util.Util;\nimport net.minecraft.client.Minecraft;\nimport net.eq2online.macros.core.*;\nimport net.eq2online.macros.scripting.parser.ScriptContext;\n" + "public class ").append(name).append(" extends Script {\n@Override\npublic void run(IScriptActionProvider provider,IMacro m,IMacroAction instance) throws InterruptedException {\n").append("    Macro macro = new Macro(Macros.getInstance(), Minecraft.getMinecraft(),new MacroTemplate(Macros.getInstance(),Minecraft.getMinecraft(),9999),9999, MacroPlaybackType.ONESHOT, MacroTriggerType.NONE,\n" +
//                "new MacroActionContext(ScriptContext.MAIN,provider,null));");
//        for (Line l : lines) {
//            ba.append(l.code.replaceAll("\u00b1","")).append("\n");
//        }
//        ba.append("}\n}");
//        return ba.toString();
//    }



    @Override
    public void onInit() {
        context.getCore().registerScriptAction(this);
    }
}
