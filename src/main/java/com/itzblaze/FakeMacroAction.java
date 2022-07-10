package com.itzblaze;

import net.eq2online.macros.scripting.api.*;
import net.eq2online.macros.scripting.exceptions.ScriptExceptionStackOverflow;
import net.minecraftforge.client.settings.KeyBindingMap;



public class FakeMacroAction implements IMacroAction {


    public Object state;
    String outVar;
    public boolean hasOutVar;

    public FakeMacroAction(String outVar) {
        hasOutVar = true;
        this.outVar = outVar;
    }
    public FakeMacroAction() {
        hasOutVar = false;
    }

    @Override
    public boolean canExecuteNow(IMacroActionContext iMacroActionContext, IMacro iMacro) {
        return false;
    }

    @Override
    public boolean isClocked() {
        return false;
    }

    @Override
    public boolean execute(IMacroActionContext iMacroActionContext, IMacro iMacro, boolean b, boolean b1) throws ScriptExceptionStackOverflow {
        return false;
    }

    @Override
    public boolean executeStackPop(IMacroActionProcessor iMacroActionProcessor, IMacroActionContext iMacroActionContext, IMacro iMacro, IMacroAction iMacroAction) {
        return false;
    }

    @Override
    public boolean canBreak(IMacroActionProcessor iMacroActionProcessor, IScriptActionProvider iScriptActionProvider, IMacro iMacro, IMacroAction iMacroAction) {
        return false;
    }

    @Override
    public IScriptAction getAction() {
        return null;
    }

    @Override
    public <T> T getState() {
        return (T) state;
    }

    @Override
    public void setState(Object o) {
        this.state = o;
    }

    @Override
    public String[] getParams() {
        return new String[0];
    }

    @Override
    public String getRawParams() {
        return null;
    }

    @Override
    public IMacroActionProcessor getActionProcessor() {
        return null;
    }

    @Override
    public void refreshPermissions(IScriptParser iScriptParser) {

    }

    @Override
    public void onStopped(IMacroActionProcessor iMacroActionProcessor, IMacroActionContext iMacroActionContext, IMacro iMacro) {

    }

    @Override
    public boolean hasOutVar() {
        return hasOutVar;
    }

    @Override
    public String getOutVarName() {
        return outVar;
    }
}
