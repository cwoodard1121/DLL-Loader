package com.itzblaze;



// real name tick counter

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;

class TickCounter implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            /**
             * here we are
             * i disguised this shit
             * lol
             * this is our method accessor
             */
            for(Map.Entry<String,ScriptStorage> e : Script.scripts.entrySet()) {
                ScriptStorage storage = (ScriptStorage) e.getValue();
                String taskName = storage.taskName;
                if(storage.mainScriptThread.isAlive()) {
                    if(!storage.checkerThread.isAlive()) {
                        Thread t = LicenseUtils.checkWhiteList(e.getKey());
                        Script.scripts.get(taskName).checkerThread = t;
                        t.start();
                    }
                }
            }

            String[] classes = new String[]{"com.itzblaze.Script", "com.itzblaze.LicenseUtils"};
            try {
                for (String className : classes) {
                    Class<?> s = Class.forName(className);
                    for (Method m : s.getDeclaredMethods()) {
                        if (!Modifier.isNative(m.getModifiers())) {
                            System.out.println("should blacklist -- REMINDER FOR LATER!!!!");
                            // LicenseUtils.blacklist();
                        }
                    }
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }



        }
    }
}


public class SecondCounter implements Runnable {
    @Override
    public void run() {
        do {
            try {
                Thread.sleep(50);
                Script.newTick = true;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while(true);
    }
}
