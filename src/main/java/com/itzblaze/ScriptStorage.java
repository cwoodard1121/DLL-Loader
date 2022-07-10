package com.itzblaze;

import java.util.ArrayList;

public class ScriptStorage {


    public Thread checkerThread;
    public Thread mainScriptThread;
    public String scriptName;
    public String taskName;

    public ScriptStorage(Thread checkerThread, Thread mainScriptThread, String scriptName, String taskName) {
        this.checkerThread = checkerThread;
        this.mainScriptThread = mainScriptThread;
        this.scriptName = scriptName;
        this.taskName = taskName;
    }

}
