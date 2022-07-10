package com.itzblaze;

import com.itzblaze.Script;
import com.itzblaze.SecondCounter;
import net.eq2online.macros.scripting.actions.game.ScriptActionLooks;
import net.eq2online.macros.scripting.api.*;
import net.eq2online.macros.scripting.parser.ScriptAction;
import net.eq2online.macros.scripting.parser.ScriptContext;
import net.eq2online.util.Util;
import net.minecraft.client.Minecraft;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Random;

@APIVersion(26)
public class ScriptActionRunScript extends ScriptAction {
    public ScriptActionRunScript() {
        super(ScriptContext.MAIN,"runscript");
    }

    @Override
    public boolean isThreadSafe() {
        return false;
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

    @Override
    public IReturnValue execute(IScriptActionProvider provider, IMacro macro, IMacroAction instance, String rawParams, String[] params) {
        if(params.length > 0) {
            String script = provider.expand(macro, params[0], false);
            String taskName = "MACRO" + random();
            if(params.length > 1) {
                taskName = provider.expand(macro, params[1], false);
            }
            if(params.length > 2) {
                String[] hardArgs = new String[params.length - 2];
                int j = 0;
                for(int i = 2; i < params.length; i++) {
                    hardArgs[j] = params[i];
                    j++;
                }
                Script.start(script, provider, macro, instance, taskName, hardArgs);
            }
            Script.start(script, provider, macro, instance, taskName, (String) null);
        }
        return null;
    }

    @Override
    public void onInit() {
        context.getCore().registerScriptAction(this);
    }
}
