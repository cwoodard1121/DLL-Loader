package com.itzblaze;

import com.google.gson.Gson;


import java.io.*;
import java.lang.annotation.Native;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.jar.JarInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Main {


    static class Function {
        public String functionName;
        public String outVar;
        public boolean doesReturn;
        public ArrayList<Line> instructions;

        public Function(String n, String o, boolean r, ArrayList<Line> instructions) {
            this.functionName = n;
            this.outVar = o;
            this.doesReturn = r;
            this.instructions = instructions;
        }

    }

    static class Line {
        public String code;

        public Line(String code) {
            this.code = code;
        }

        public void semicolon() {
            code = code + ";";
        }
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

    public static void deleteAllRecurison(File folder) {
        if(folder.isDirectory()) {
            for (File file : folder.listFiles()) {
                if (file.isDirectory()) {
                    deleteAllRecurison(file);
                    continue;
                }
                file.delete();
            }
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        if(args.length < 2) {
            System.out.println("FAILED: Arguments should be java -jar jarname inputdir outputdir");
            System.exit(0);
        }
        final Gson gson = new Gson();
        String directory = args[1];
        File folder = new File(args[0]);
        if(folder.isDirectory()) {
            for (File script : folder.listFiles()) {
                StringBuilder b = new StringBuilder();
                try {
                    BufferedReader fileReader = new BufferedReader(new FileReader(script));
                    String tmp = null;
                    while((tmp = fileReader.readLine()) != null) {
                        b.append(tmp);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                // script loaded
                S s = gson.fromJson(b.toString(),S.class);
                String java = data(script.getName(),s.script);
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(new File(directory + "\\src\\main\\java\\natives\\" + script.getName().replace(".txt","") + ".java")));
                    writer.write(java);
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Supplied path is not a directory");
        }
        // delete files pre-gradle build
        File g = new File(directory + "\\build\\libs");
        for(File file : g.listFiles()) {
            file.delete();
        }


        // gradle build
        final Process p = Runtime.getRuntime().exec("cmd /c cd \"" + directory + "\" && builder.bat \"" + directory + "\"");
        // logging gradle build
        // waiting for gradle build
        new Thread(new Runnable() {
            @Override
            public void run() {
                BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line = "";
                try {
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch(IOException e) {
                    e.printStackTrace();
                }

            }
        }).start();
        p.waitFor();
        Thread.sleep(1000);
        System.err.println("Build complete! Hiding strings from memory.");
        // obfuscating string
        File input = new File(directory + "\\build\\libs\\module_files-1.0.jar");
        Transformer transformer = new Transformer(input, "watermark", null, true, false);
        transformer.load();
        transformer.transform();
        transformer.save();
        System.err.println("Strings obfuscated.");
        File obfuscatedFile = null;
        for(File fInDir : input.getParentFile().listFiles()) {
            System.out.println("Filename: " + fInDir.getName());
            if(fInDir.getName().toLowerCase().length() > 25 && !fInDir.getName().toLowerCase().contains("source")) {
                System.err.println("Found file: " + fInDir.getName());
                obfuscatedFile = fInDir;
                continue;
            }
        }
        // check if "cstuff" folder exists
        File cstuff = new File(directory + "\\cstuff");
        if(!cstuff.exists()) {
            cstuff.mkdir();
            File out = new File(cstuff.getPath() + "\\out");
            out.mkdir();
            ReadableByteChannel readableByteChannel = Channels.newChannel(new URL("https://github.com/radioegor146/native-obfuscator/releases/download/3.3.3r/obfuscator.jar").openStream());
            FileOutputStream outputStream = new FileOutputStream(cstuff.getPath() + "\\nativiser.jar");
            FileChannel channel = outputStream.getChannel();
            outputStream.getChannel().transferFrom(readableByteChannel,0,Long.MAX_VALUE);
            ReadableByteChannel readableByteChannel1 = Channels.newChannel(new URL("https://github.com/cwoodard1121/Loader/raw/main/Loader.class").openStream());
            FileOutputStream outputStream1 = new FileOutputStream(cstuff.getPath() + "\\Loader.class");
            FileChannel channel1 = outputStream1.getChannel();
            outputStream1.getChannel().transferFrom(readableByteChannel1,0,Long.MAX_VALUE);
            // obfuscator done
            BufferedWriter writer = new BufferedWriter(new FileWriter(cstuff.getPath() + "\\obfuscate.bat"));
            writer.write("color a\n" +
                    "java -jar nativiser.jar module_files.jar out --plain-lib-name=module_files --black-list=wl.txt\n" +
                    "cd out\n" +
                    "cd cpp\n" +
                    "cmake .\n" +
                    "cmake --build . --config Release\n" +
                    "echo all done obfuscation");
            writer.close();
            BufferedWriter writer1 = new BufferedWriter(new FileWriter(cstuff.getPath() + "\\wl.txt"));
            writer1.write("com/itzblaze/ScriptActionStopScript\n" +
                    "com/itzblaze/ScriptActionCompileScripts\n" +
                    "com/itzblaze/ScriptActionExportScripts\n" +
                    "com/itzblaze/SecondCounter\n" +
                    "com/itzblaze/ScriptActionRunScript\n" +
                    "com/itzblaze/ScriptActionRunScript$1\n" +
                    "com/itzblaze/ScriptActionReload\n" +
                    "com/itzblaze/S\n" +
                    "watermark\n" +
                    "com/itzblaze/Line\n" +
                    "com/itzblaze/Library\n" +
                    "com/itzblaze/Action");
            writer1.close();
        }
        // cleaning cpp folder
        File cpp = new File(directory + "\\cstuff\\out\\cpp");
        deleteAllRecurison(cpp);


        // native obfuscation now
        obfuscatedFile.renameTo(new File(directory + "\\cstuff\\module_files.jar"));
        obfuscatedFile.getParentFile().delete();
        obfuscatedFile.getParentFile().mkdir();
        Process process = Runtime.getRuntime().exec("cmd /c cd \"" + cstuff.getPath() + "\" && obfuscate.bat");
        new Thread(new Runnable() {
            public void run() {
                BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String line = null;
                try {
                    while ((line = input.readLine()) != null)
                        System.out.println(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        process.waitFor();
        File nativesFolder = new File(cstuff.getPath() + "\\nativesfolder");
        if(!nativesFolder.exists()) nativesFolder.mkdir();
        // patching loader
        ZipUtility zip = new ZipUtility(new File(cstuff.getPath() + "\\out\\module_files.jar"));
        System.out.println("all native obfuscation finished, patching Loader class to add to java.library.path");
        FileInputStream inputStream = new FileInputStream(new File(cstuff.getPath() + "\\Loader.class"));
        zip.addOrReplaceEntry("native0/Loader.class",inputStream);
        inputStream.close();
        // patched
        System.out.println("Jar patched. Moving..");
        new File(cstuff.getPath() + "\\out\\module_files.jar").renameTo(new File(nativesFolder.getPath() + "\\module_files_patched.jar"));
        new File(cstuff.getPath() + "\\out\\cpp\\build\\lib\\native_library.dll").renameTo(new File(nativesFolder.getPath() + "\\modulefiles.dll"));
        System.out.println("Moved jars to: " + nativesFolder.getPath());
        System.out.println("patched dll into jar.");
        System.out.println("Check: " + nativesFolder.getPath() + " to get your files! (You can click the path to open)");
    }


    public static String autoCorrect(String check) {
        return check;
    }

    /*     */   public static String escapeReplacement(String param) {
        /* 853 */     if (param == null) return "";

        /*     */
        /**
         * later:
         * .replaceAll("\\$", "\\\\\\$")
         */
        /* 855 */     return param.replaceAll("\\\\", "\\\\\\\\").replace("\"", "\\\"");
        /*     */   }
    /*     */

    public static String data(String name, ArrayList<Action> actions) {
        boolean isFunction = false;
        Function currentFunction = null;
        ArrayList<Function> functions = new ArrayList<>();
        ArrayList<Line> lines = new ArrayList<>();
        int i = 0;
        int functionI = 0;
        b: for(Action action : actions) {
            String actionName = action.actionName.toLowerCase();
            String[] params = action.params;
            for (int j = 0; j < params.length; j++) {
                params[j] = escapeReplacement(params[j]);
            }
            String rawParams = action.rawParams.toLowerCase();
            rawParams = escapeReplacement(rawParams);
            String outVar = action.outVar.toLowerCase();
            if (actionName.toLowerCase().equals("function"))
            {
                functionI = 0;
                isFunction = true;
                if (outVar != null && outVar.length() > 2) {
                    currentFunction = new Function(params[0].toLowerCase(), outVar, true, new ArrayList<>());
                } else {
                    currentFunction = new Function(params[0].toLowerCase(), "", false, new ArrayList<>());
                }
                continue;
            }
            if (actionName.toLowerCase().equals("endfunction")) {
                isFunction = false;
                currentFunction.instructions.add(new Line("}\n"));
                functions.add(currentFunction);
                continue;
            }
            for(Function functionF : functions) {
                if(actionName.toLowerCase().equals(functionF.functionName)) {
                    lines.add(new Line(actionName.toLowerCase() + "(provider,macro,instance);\n"));
                    continue b;
                }
            }
            if (isFunction) {
                if (actionName.equals("if")) {
                    currentFunction.instructions.add(new Line("if(provider.getExpressionEvaluator(macro,provider.expand(macro,\"" + rawParams + "\",true)).evaluate() != 0) {"));
                    continue;
                }

                if(actionName.equals("unsafe")) {
                    currentFunction.instructions.add(new Line("setActionsCurrentTickMax(Math.min(Math.max(" + params[0] + "), 0), 10000);"));
                    continue;
                }

                if(actionName.equals("endunsafe")) {
                    currentFunction.instructions.add(new Line("setActionsCurrentTickMax(" + params[0] + ");"));
                }

                if (actionName.equals("elseif")) {
                    currentFunction.instructions.add(new Line("} else if(provider.getExpressionEvaluator(macro,provider.expand(macro,\"" + rawParams + "\",false)).evaluate() != 0) {"));
                    continue;
                }

                if (actionName.equals("break")) {
                    currentFunction.instructions.add(new Line("break;"));
                    continue;
                }
                if (actionName.equals("next")) {
                    currentFunction.instructions.add(new Line("}"));
                    continue;
                }
                if (actionName.equals("while")) {
                    currentFunction.instructions.add(new Line("} while(" + "provider.getExpressionEvaluator(macro,provider.expand(macro,\"" + rawParams + "\",true)).evaluate() != 0);"));
                    continue;
                }
                if (actionName.equals("until")) {
                    currentFunction.instructions.add(new Line("} while(" + "provider.getExpressionEvaluator(macro,provider.expand(macro,\"" + rawParams + "\",true)).evaluate() == 0);"));
                    continue;
                }

                if (actionName.equals("else")) {
                    currentFunction.instructions.add(new Line("} else {"));
                    continue;
                }
                if (actionName.equals("ifcontains")) {
                    String rand = random();
                    currentFunction.instructions.add(new Line("String rawParams" + "ifcontains" + rand + " = \"" + rawParams + "\";"));
                    currentFunction.instructions.add(new Line("String[] params" + "ifcontains" + rand + "= \"" + String.join("SPLIT", params) + "\".split(\"SPLIT\");"));
                    currentFunction.instructions.add(new Line("IScriptAction" + " " + "ifcontains" + rand + " = newInstance(\"" + "ifcontains" + "\");"));
                    currentFunction.instructions.add(new Line("if(ifcontains" + rand + ".executeConditional(provider,macro,instance,rawParamsifcontains" + rand + ",paramsifcontains" + rand + ")) {"));
                    continue;
                }
                if (actionName.equals("ifmatches")) {
                    String rand = random();
                    currentFunction.instructions.add(new Line("String rawParams" + "ifmatches" + rand + " = \"" + rawParams + "\";"));
                    currentFunction.instructions.add(new Line("String[] params" + "ifmatches" + rand + "= \"" + String.join("SPLIT", params) + "\".split(\"SPLIT\");"));
                    currentFunction.instructions.add(new Line("IScriptAction" + " " + "ifmatches" + rand + " = newInstance(\"" + "ifmatches" + "\");"));
                    currentFunction.instructions.add(new Line("if(ifmatches" + rand + ".executeConditional(provider,macro,instance,rawParamsifmatches" + rand + ",paramsifmatches" + rand + ")) {"));
                    continue;
                }
                if (actionName.equals("endif")) {
                    currentFunction.instructions.add(new Line("}"));
                    continue;
                }
                if (actionName.equals("do")) {
                    currentFunction.instructions.add(new Line("do {"));
                    continue;
                }
                currentFunction.instructions.add(new Line("if(!tick().equals(\"dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=\")) Minecraft.getMinecraft().shutdown(); "));
                if(actionName.toLowerCase().equals("log")) {
                    currentFunction.instructions.add(new Line("provider.actionAddChatMessage(Util.convertAmpCodes(" + "\"" + params[0] + "\"));"));
                    continue;
                }
                if (outVar.length() > 1) {
                    // return value :(( fuck this
                    String functionName = actionName;
                    String rand = random();
                    currentFunction.instructions.add(new Line("IScriptAction" + " " + functionName + rand + " = newInstance(\"" + functionName.toLowerCase() + "\");"));
                    String rawParamsScript = rawParams;
                    if (params.length > 0) {
                        currentFunction.instructions.add(new Line("IReturnValue ret" + functionName + rand + " = " + functionName + rand + ".execute(provider,macro,instance,\"" + rawParamsScript + "\",\"" + String.join("SPLIT", params) + "\".split(\"SPLIT\"));"));
                    } else {
                        currentFunction.instructions.add(new Line("IReturnValue ret" + functionName + rand + "= " + functionName + rand + ".execute(provider,macro,instance,\"\",\"\".split(\",\"));"));
                    }
                    currentFunction.instructions.add(new Line("provider.setVariable(macro,\"" + outVar + "\",ret" + functionName + rand + ");"));
                    continue;
                }
                // set
                if (actionName.equals("loop")) {
                    currentFunction.instructions.add(new Line("} while(true);"));
                    continue;
                }
                if (actionName.equals("for")) {
                    String rand = random();
                    currentFunction.instructions.add(new Line("IMacroAction " + actionName + rand + "instance = new FakeMacroAction();"));
                    currentFunction.instructions.add(new Line("String rawParams" + actionName + rand + " = \"" + rawParams + "\";"));
                    currentFunction.instructions.add(new Line("String[] params" + actionName + rand + "= \"" + String.join("SPLIT", params) + "\".split(\"SPLIT\");"));
                    currentFunction.instructions.add(new Line("IScriptAction" + " " + actionName + rand + " = newInstance(\"" + actionName.toLowerCase() + "\");"));
                    currentFunction.instructions.add(new Line("while(" + actionName + rand + ".executeStackPush(provider,macro," + actionName + rand + "instance,rawParams" + actionName + rand + ",params" + actionName + rand + ")) {"));
                    continue;
                }
                if(actionName.equals("foreach")) {
                    String rand = random();
                    currentFunction.instructions.add(new Line("IMacroAction " + actionName + rand + "instance = new FakeMacroAction();"));
                    currentFunction.instructions.add(new Line("String rawParams" + actionName + rand + " = \"" + rawParams + "\";"));
                    currentFunction.instructions.add(new Line("String[] params" + actionName + rand + "= \"" + String.join("SPLIT", params) + "\".split(\"SPLIT\");"));
                    currentFunction.instructions.add(new Line("IScriptAction" + " " + actionName + rand + " = newInstance(\"" + actionName.toLowerCase() + "\");"));
                    currentFunction.instructions.add(new Line("while(" + actionName + rand + ".executeStackPush(provider,macro," + actionName + rand + "instance,rawParams" + actionName + rand + ",params" + actionName + rand + ")) {"));
                    continue;
                }
                if (actionName.equals("isinvfull")) {
                    String rand = random();
                    currentFunction.instructions.add(new Line("IMacroAction " + actionName + rand + "instance = new FakeMacroAction();"));
                    currentFunction.instructions.add(new Line("String rawParams" + actionName + rand + " = \"" + rawParams + "\";"));
                    currentFunction.instructions.add(new Line("String[] params" + actionName + rand + "= \"" + String.join("SPLIT", params) + "\".split(\"SPLIT\");"));
                    currentFunction.instructions.add(new Line("IScriptAction" + " " + actionName + rand + " = newInstance(\"" + actionName.toLowerCase() + "\");"));
                    currentFunction.instructions.add(new Line("if(" + actionName + rand + ".executeConditional(provider,macro," + actionName + rand + "instance,rawParams" + actionName + rand + ",params" + actionName + rand + ")) {"));
                    continue;
                }
                if (actionName.equals("stop")) {
                    if (rawParams.length() >= 1) {
                        if (rawParams.split(",")[0].equals("all")) {
                            currentFunction.instructions.add(new Line("Script.scripts.entrySet().forEach(script -> {script.getValue().stop();});"));
                            continue;
                        }
                    }
                    if (rawParams.length() == 0) {
                        currentFunction.instructions.add(new Line("Thread.currentThread().stop();"));
                    } else {
                        currentFunction.instructions.add(new Line("Script.get(\"" + rawParams.split(",")[0] + "\").stop();"));
                    }
                    continue;
                }

                // EXEC
                if (actionName.equals("exec") || actionName.equals("runscript")) {
                    if (params.length > 0) {
                        params[0] = params[0].replace(".txt", "");
                        String random = random();
                        currentFunction.instructions.add(new Line("            String script" + random + " = \"" + params[0] + "\";\n" +
                                "            Thread t" + random + " = new Thread(new Runnable() {\n" +
                                "                @Override\n" +
                                "                public void run() {\n" +
                                "                    try {\n" +
                                "                        Class scriptClass = (Class) Class.forName(\"natives.\" + \"" + params[0] + "\");\n" +
                                "                        Script s = (Script) scriptClass.newInstance();\n" +
                                "                        s.run(provider,macro,instance);\n" +
                                "                        // check to see if constructor is real\n" +
                                "                    } catch (ClassNotFoundException e) {\n" +
                                "                        provider.actionAddChatMessage(Util.convertAmpCodes(\"&cClass: natives.\" + script" + random + "+\" NOT FOUND! \" + e.getMessage()));\n" +
                                "                    } catch (IllegalAccessException | InstantiationException | InterruptedException e) {\n" +
                                "                        e.printStackTrace();\n" +
                                "                    }" +
                                "                   \n" +
                                "                }\n" +
                                "            });\n" +
                                "            t" + random + ".start();\n" +
                                "            Script.scripts.put(script" + random + ",t" + random + ");"));
                    }
                    continue;
                }


                String rand = random();
                currentFunction.instructions.add(new Line("IMacroAction " + actionName + rand + "instance = new FakeMacroAction();"));
                currentFunction.instructions.add(new Line("String rawParams" + actionName + rand + " = \"" + rawParams + "\";"));
                currentFunction.instructions.add(new Line("String[] params" + actionName + rand + "= \"" + String.join("SPLIT", params) + "\".split(\"SPLIT\");"));
                currentFunction.instructions.add(new Line("IScriptAction" + " " + actionName + rand + " = newInstance(\"" + actionName.toLowerCase() + "\");"));
                currentFunction.instructions.add(new Line(actionName + rand + ".execute(provider,macro," + actionName + rand + "instance,rawParams" + actionName + rand + ",params" + actionName + rand + ");"));
                currentFunction.instructions.add(new Line("while(!" + actionName + rand + ".canExecuteNow(provider,macro," + actionName + rand + "instance,rawParams" + actionName + rand + ",params" + actionName + rand + ")){}"));

                functionI++;
                // get registered variables from actual code
            } else {



                if (actionName.equals("if")) {
                    lines.add(new Line("if(provider.getExpressionEvaluator(macro,provider.expand(macro,\"" + rawParams + "\",true)).evaluate() != 0) {"));
                    continue;
                }
                if (actionName.equals("elseif")) {
                    lines.add(new Line("} else if(provider.getExpressionEvaluator(macro,provider.expand(macro,\"" + rawParams + "\",false)).evaluate() != 0) {"));
                    continue;
                }

                if (actionName.equals("break")) {
                    lines.add(new Line("break;"));
                    continue;
                }
                if (actionName.equals("else")) {
                    lines.add(new Line("} else {"));
                    continue;
                }
                if (actionName.equals("next")) {
                    lines.add(new Line("}"));
                    continue;
                }
                if (actionName.equals("while")) {
                    boolean add = lines.add(new Line("} while(" + "provider.getExpressionEvaluator(macro,provider.expand(macro,\"" + rawParams + "\",true)).evaluate() != 0);"));
                    continue;
                }
                if (actionName.equals("until")) {
                    lines.add(new Line("} while(" + "provider.getExpressionEvaluator(macro,provider.expand(macro,\"" + rawParams + "\",true)).evaluate() == 0);"));
                    continue;
                }
                if (actionName.equals("endif")) {
                    lines.add(new Line("}"));
                    continue;
                }


                if(actionName.equals("unsafe")) {
                    lines.add(new Line("setActionsCurrentTickMax(" + (params.length < 1 ? "100" : params[0]) + ");"));
                    continue;
                }

                if(actionName.equals("endunsafe")) {
                    lines.add(new Line("setActionsCurrentTickMax(" + 100 + ");"));
                    continue;
                }
                String randA = random();
                if(outVar.length() > 2) {
                    lines.add(new Line("IMacroAction " + actionName + randA + "instance = new FakeMacroAction(\"" + outVar + "\");"));
                } else {
                    lines.add(new Line("IMacroAction " + actionName + randA + "instance = new FakeMacroAction();"));
                }
                if (actionName.equals("ifmatches")) {
                    String rand = random();
                    lines.add(new Line("String rawParams" + "ifmatches" + rand + " = \"" + rawParams + "\";"));
                    lines.add(new Line("String[] params" + "ifmatches" + rand + "= \"" + String.join("SPLIT", params) + "\".split(\"SPLIT\");"));
                    lines.add(new Line("IScriptAction" + " " + "ifmatches" + rand + " = newInstance(\"" + "ifmatches" + "\");"));
                    lines.add(new Line("if(ifmatches" + rand + ".executeConditional(provider,macro," + actionName + randA + "instance,rawParamsifmatches" + rand + ",paramsifmatches" + rand + ")) {"));
                    continue;
                }
                if (actionName.equals("ifcontains")) {
                    String rand = random();
                    lines.add(new Line("String rawParams" + "ifcontains" + rand + " = \"" + rawParams + "\";"));
                    lines.add(new Line("String[] params" + "ifcontains" + rand + "= \"" + String.join("SPLIT", params) + "\".split(\"SPLIT\");"));
                    lines.add(new Line("IScriptAction" + " " + "ifcontains" + rand + " = newInstance(\"" + "ifcontains" + "\");"));
                    lines.add(new Line("if(ifcontains" + rand + ".executeConditional(provider,macro," + actionName + randA + "instance,rawParamsifcontains" + rand + ",paramsifcontains" + rand + ")) {"));
                    continue;
                }
                if (actionName.equals("do")) {
                    lines.add(new Line("do {"));
                    continue;
                }


                if(actionName.toLowerCase().equals("log")) {
                    System.out.println("LOG GAAGAG");
                    System.out.println("NEXTE TETET ");
                    String functionName = actionName;
                    String rand = random();
                    lines.add(new Line("IScriptAction" + " " + functionName + rand + " = newInstance(\"" + functionName.toLowerCase() + "\");"));
                    String rawParamsScript = rawParams;
                    if (params.length > 0) {
                        lines.add(new Line("IReturnValue ret" + functionName + rand + " = " + functionName + rand + ".execute(provider,macro," + actionName + randA + "instance,\"" + rawParamsScript + "\",\"" + String.join("SPLIT", params) + "\".split(\"SPLIT\"));"));
                    } else {
                        lines.add(new Line("IReturnValue ret" + functionName + rand + "= " + functionName + rand + ".execute(provider,macro," + actionName + randA + "instance,\"\",\"\".split(\",\"));"));
                    }

                    lines.add(new Line("try {\nScript.handleReturnValue(provider,macro," + functionName + randA + "instance,ret" + functionName + rand + ");\n}catch (ScriptExceptionVoidResult e) {\ne.printStackTrace();\n} " ));



                    // return value :(( fuck this

                    continue;
                }
                lines.add(new Line("if(!tick().equals(\"dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=\")) Minecraft.getMinecraft().shutdown(); "));
                if (outVar.length() > 2) {
                    String functionName = actionName;
                    String rand = random();
                    lines.add(new Line("IScriptAction" + " " + functionName + rand + " = newInstance(\"" + functionName.toLowerCase() + "\");"));
                    String rawParamsScript = rawParams;
                    if (params.length > 0) {
                        lines.add(new Line("IReturnValue ret" + functionName + rand + " = " + functionName + rand + ".execute(provider,macro," + actionName + randA + "instance,\"" + rawParamsScript + "\",\"" + String.join("SPLIT", params) + "\".split(\"SPLIT\"));"));
                    } else {
                        lines.add(new Line("IReturnValue ret" + functionName + rand + "= " + functionName + rand + ".execute(provider,macro," + actionName + randA + "instance,\"\",\"\".split(\",\"));"));
                    }
                    lines.add(new Line("                    if(true){\nif (ret" + functionName + rand + ".isVoid()) {\n" +
                            "                        throw new ScriptExceptionVoidResult(\"" + functionName.toUpperCase() + "\");\n" +
                            "                    }"));
                    lines.add(new Line(""));

                    lines.add(new Line("                    String parsedOutVar = provider.expand(macro, \"" + outVar + "\", false);\n" +
                            "                    String varName = Variable.getValidVariableOrArraySpecifier(parsedOutVar);\n" +
                            "                    if (Variable.couldBeArraySpecifier(parsedOutVar) && varName != null) {\n" +
                            "                        if (ret"  + functionName + rand  + " instanceof IReturnValueArray) {\n" +
                            "                            IReturnValueArray array = (IReturnValueArray)ret" + functionName + rand + ";\n" +
                            "                            if (!array.shouldAppend()) {\n" +
                            "                                provider.clearArray(macro, varName);\n" +
                            "                            }\n" +
                            "\n" +
                            "                            Iterator var9 = array.getStrings().iterator();\n" +
                            "\n" +
                            "                            while(var9.hasNext()) {\n" +
                            "                                String stringValue = (String)var9.next();\n" +
                            "                                provider.pushValueToArray(macro, varName, stringValue);\n" +
                            "                            }\n" +
                            "                        } else {\n" +
                            "                            provider.pushValueToArray(macro, varName, ret" + functionName + rand + ".getString());\n" +
                            "                        }\n" +
                            "                    } else {\n" +
                            "                        provider.setVariable(macro, parsedOutVar, ret" + functionName + rand + ");\n" +
                            "                    }\n}\ntry {\nScript.handleReturnValue(provider,macro," + functionName + randA + "instance,ret" + functionName + rand + ");\n}catch (ScriptExceptionVoidResult e) {\ne.printStackTrace();\n} " ));



                    // return value :(( fuck this

                    continue;
                }
                // set
                if (actionName.equals("loop")) {
                    lines.add(new Line("} while(true);"));
                    continue;
                }
                if (actionName.equals("for")) {
                    String rand = random();

                    lines.add(new Line("String rawParams" + actionName + rand + " = \"" + rawParams + "\";"));
                    lines.add(new Line("String[] params" + actionName + rand + "= \"" + String.join("SPLIT", params) + "\".split(\"SPLIT\");"));
                    lines.add(new Line("IScriptAction" + " " + actionName + rand + " = newInstance(\"" + actionName.toLowerCase() + "\");"));
                    lines.add(new Line("while(" + actionName + rand + ".executeStackPush(provider,macro," + actionName + randA + "instance,rawParams" + actionName + rand + ",params" + actionName + rand + ")) {"));
                    continue;
                }
                if (actionName.equals("foreach")) {
                    String rand = random();
                    lines.add(new Line("String rawParams" + actionName + rand + " = \"" + rawParams + "\";"));
                    lines.add(new Line("String[] params" + actionName + rand + "= \"" + String.join("SPLIT", params) + "\".split(\"SPLIT\");"));
                    lines.add(new Line("IScriptAction" + " " + actionName + rand + " = newInstance(\"" + actionName.toLowerCase() + "\");"));
                    lines.add(new Line("while(" + actionName + rand + ".executeStackPush(provider,macro," + actionName + randA + "instance,rawParams" + actionName + rand + ",params" + actionName + rand + ")) {"));
                    continue;
                }
                if (actionName.equals("isinvfull")) {
                    String rand = random();
                    lines.add(new Line("String rawParams" + actionName + rand + " = \"" + rawParams + "\";"));
                    lines.add(new Line("String[] params" + actionName + rand + "= \"" + String.join("SPLIT", params) + "\".split(\"SPLIT\");"));
                    lines.add(new Line("IScriptAction" + " " + actionName + rand + " = newInstance(\"" + actionName.toLowerCase() + "\");"));
                    lines.add(new Line("if(" + actionName + rand + ".executeConditional(provider,macro," + actionName + randA + "instance,rawParams" + actionName + rand + ",params" + actionName + rand + ")) {"));
                    continue;
                }
                if (actionName.equals("stop")) {
                    if (rawParams.length() >= 1) {
                        if (rawParams.split(",")[0].equals("all")) {
                            lines.add(new Line("Script.scripts.entrySet().forEach(script -> {script.getValue().stop();});"));
                            continue;
                        }
                    }
                    if (rawParams.length() == 0) {
                        lines.add(new Line("Thread.currentThread().stop();"));
                    } else {
                        lines.add(new Line("Script.get(\"" + rawParams.split(",")[0] + "\").stop();"));
                    }
                    continue;
                }

                // EXEC
                if (actionName.equals("exec")) {
                    if (params.length > 0) {
                        params[0] = params[0].replace(".txt", "");
                        String random = random();
                        String lineA = "Script.start(\"" + params[0] + "\",provider,macro,instance,\"" + params[1] + "\"";
                        StringBuilder builder = new StringBuilder();
                        builder.append(lineA);
                        if(params.length > 2) {
                            for(int k = 2; k < params.length; k++) {
                                builder.append("," + "\"").append(params[k]).append("\"");
                            }
                        }
                        builder.append(");");
                        lines.add(new Line(builder.toString()));
                    }
                    continue;
                }


                String rand = random();
                lines.add(new Line("String rawParams" + actionName + rand + " = \"" + rawParams + "\";"));
                lines.add(new Line("String[] params" + actionName + rand + "= \"" + String.join("SPLIT", params) + "\".split(\"SPLIT\");"));
                lines.add(new Line("IScriptAction" + " " + actionName + rand + " = newInstance(\"" + actionName.toLowerCase() + "\");"));
                lines.add(new Line(actionName + rand + ".execute(provider,macro," + actionName + randA + "instance,rawParams" + actionName + rand + ",params" + actionName + rand + ");"));
                lines.add(new Line("while(!" + actionName + rand + ".canExecuteNow(provider,macro," + actionName + randA + "instance,rawParams" + actionName + rand + ",params" + actionName + rand + ")){}"));

                i++;
            }
        }
        System.out.println("Java translated code, not indented may have type bugs, fix manualtly until further notice.");

        StringBuilder functionBuilder = new StringBuilder();
        for(Function f : functions) {
            functionBuilder.append("public void " + f.functionName + "(IScriptActionProvider provider, IMacro macro, IMacroAction instance) throws InterruptedException {\n");
            for(Line l : f.instructions) {
                functionBuilder.append(l.code + "\n");
            }
        }
        String functionsText = functionBuilder.toString();

        StringBuilder ba = new StringBuilder();
        ba.append("package natives;\nimport com.itzblaze.Script;\nimport net.eq2online.macros.scripting.api.IMacro;\n" + "import net.eq2online.macros.scripting.api.IMacroAction;\nimport net.eq2online.macros.scripting.api.IScriptAction;\n" + "import net.eq2online.macros.scripting.api.IScriptActionProvider;\nimport net.eq2online.macros.scripting.actions.lang.ScriptActionSet;\n" + "import net.eq2online.macros.core.Macro;\n" +
                "import net.eq2online.macros.core.MacroPlaybackType;\nimport net.eq2online.macros.scripting.exceptions.ScriptExceptionVoidResult;\nimport net.eq2online.macros.scripting.Variable;\nimport com.itzblaze.FakeMacroAction;\nimport net.eq2online.macros.scripting.api.*;\n" +
                "import net.eq2online.macros.core.MacroTemplate;\n" +
                "import net.eq2online.macros.core.Macros;\nimport java.util.Iterator;\n" +
                "import net.eq2online.macros.core.executive.MacroActionContext;\nimport net.eq2online.util.Util;\nimport net.minecraft.client.Minecraft;\nimport net.eq2online.macros.core.*;\nimport net.eq2online.macros.scripting.parser.ScriptContext;\n" + "public class ").append(name.replace(".txt","")).append(" extends Script {\n" +functionsText +
                "@Override\npublic void run(IScriptActionProvider provider,IMacro m,IMacroAction instance,String[] hardArgs, boolean hasHardArgs) throws InterruptedException {\n").append("    Macro macro = new Macro(Macros.getInstance(), Minecraft.getMinecraft(),new MacroTemplate(Macros.getInstance(),Minecraft.getMinecraft(),9999),9999, MacroPlaybackType.ONESHOT, MacroTriggerType.NONE,\n" +
                "new MacroActionContext(ScriptContext.MAIN,provider,null));\nString hardArg1 = null;\nString hardArg2 = null; String hardArg3 = null; String hardArg4 = null;if(hasHardArgs) {\n        for(int iPlusPlus = 0; iPlusPlus < hardArgs.length; iPlusPlus++) {\n" +
                "            if(iPlusPlus == 0) {\n" +
                "                hardArg1 = hardArgs[iPlusPlus];\n" +
                "            }\n" +
                "            if(iPlusPlus == 1) {\n" +
                "                hardArg2 = hardArgs[iPlusPlus];\n" +
                "            }\n" +
                "            if(iPlusPlus == 2) {\n" +
                "                hardArg3 = hardArgs[iPlusPlus];\n" +
                "            }\n" +
                "            if(iPlusPlus == 3) {\n" +
                "                hardArg4 = hardArgs[iPlusPlus];\n" +
                "            }\n" +
                "        }\n" +
                " }\n");
        int bracket = 0;
        int cbracket = 0;
        for (Line l : lines) {
            for(char c : l.code.toCharArray()) {
                if(c == '{') {
                    bracket++;
                }
                if(c == '}') {
                    cbracket++;
                }
            }
            ba.append(provideParameters((l.code + "\n")));
        }
        System.out.println(bracket + " openbracket");
        System.out.println(cbracket + " closedbracket");
        if(bracket != cbracket) {
            System.out.println("BRACKET NOT SAME. UNCLOSED STACK LIKE DO OR IF OR UNSUPPORTED STATEMENT: " + name);
        }
        ba.append("}\n}");
        return recurse(ba.toString());
    }
    public static String replaceLast(String text, String regex, String replacement) {
        return text.replaceFirst("(?s)"+regex+"(?!.*?"+regex+")", replacement);
    }

    public static String provideParameters(String macro) {
        List<String> parameters = new ArrayList<>();
        parameters.add("hardArg1");
        parameters.add("hardArg2");
        parameters.add("hardArg3");
        parameters.add("hardArg4");
        int variableIndex = 1;

        Object parameter = null;
        Iterator var3 = parameters.iterator();
        while(var3.hasNext()){
            if(parameter != null) {
                int quotes = 0;
                if(macro.toLowerCase().contains("rawparams") && macro.toLowerCase().contains("$$[")) {
                    macro = replaceLast(macro.replaceFirst("\"","(\"").replaceAll("\\x24\\x24\\[" + variableIndex++ + "\\]", "\" + " + parameter.toString() + " + \""),"\"","\")");
                } else if(macro.toLowerCase().contains("paramsscripta") && macro.toLowerCase().contains("$$[")){
                    macro = macro.replace(".split(\"SPLIT\");","");
                    macro = replaceLast(macro.replaceFirst("\"","(\"").replaceAll("\\x24\\x24\\[" + variableIndex++ + "\\]", ("\" + " +  parameter.toString() + "+ \"")),"\"","\")");
                    String forgor = macro + ".split(\"SPLIT\");";
                    macro = forgor;
                }
            }
            parameter = var3.next();
        }

        return macro.replaceAll("\\x24\\x24\\[[0-9]+\\]", "").replaceAll("\\$", "\\\\\\$");
    }

    static String recurse(String result) {
        String[] linesSplit = result.split("\n");
        StringBuilder builderB = new StringBuilder();
        boolean shouldRecur = false;
        for(int j = 0; j < linesSplit.length; j++) {
            String line = linesSplit[j];
            String previousLine = j == 0 ? line : linesSplit[j - 1];
            boolean shouldDo = true;
            if(previousLine.toLowerCase().contains("break") || previousLine.toLowerCase().contains("}")) {
                if(line.toLowerCase().contains("tick(")) {
                    shouldDo = false;
                }
            }
            if(shouldDo) {
                builderB.append(line).append("\n");
            } else {
                shouldRecur = true;
            }
        }
        if(shouldRecur) {
            return recurse(builderB.toString());
        }
        return builderB.toString();
    }


}


