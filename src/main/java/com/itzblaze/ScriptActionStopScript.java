package com.itzblaze;

import net.eq2online.macros.scripting.api.*;
import net.eq2online.macros.scripting.parser.ScriptAction;
import net.eq2online.macros.scripting.parser.ScriptContext;

import java.io.File;
import java.lang.reflect.Field;

@APIVersion(26)
public class ScriptActionStopScript extends ScriptAction {
    public ScriptActionStopScript() {
        super(ScriptContext.MAIN,"stopscript");
    }

    @Override
    public boolean isThreadSafe() {
        return false;
    }

    @Override
    public IReturnValue execute(IScriptActionProvider provider, IMacro macro, IMacroAction instance, String rawParams, String[] params) {
        Script.remove(provider.expand(macro,params[0],false));
        return null;
    }

    @Override
    public void onInit() {
        context.getCore().registerScriptAction(this);
    }
}
