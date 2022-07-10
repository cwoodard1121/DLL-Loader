package com.itzblaze.server;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Date;

public class ServerHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange request) throws IOException {
        System.out.println("Recieved request.");
        String response = "";
        Date timeStampBefore = new Date();
        BufferedReader reader = new BufferedReader(new InputStreamReader(request.getRequestBody()));
        String line = null;
        StringBuilder b = new StringBuilder();
        while((line = reader.readLine()) != null) {
            b.append(line);
        }
        line = b.toString();
            JsonParser parser = new JsonParser();
            try {
                String decrypt = Aes.decrypt(line,Utils.key0);
                if(decrypt == null) return;
                JsonElement element = parser.parse(decrypt);
                System.out.println(element instanceof JsonNull);
                if(element instanceof JsonNull) return;
                JsonObject object = (JsonObject) element;
                String term = object.get("term").getAsString();
                if(term != null) {
                    if(term.toLowerCase().equals("blacklist")) {
                        System.out.println("BLACKLIST!");
                        String uuid = object.get("uuid").getAsString();
                        Utils.blacklist(uuid);
                    }
                    if (term.toLowerCase().equals("gethashes")) {

                    }
                    if(term.toLowerCase().equals("checkscript")) {
                        JsonObject killObject = new JsonObject();
                        killObject.addProperty("timestamp",new Date().getTime());
                        killObject.addProperty("isAllowed",false);
                        System.out.println("Term: checkScriptPermissions");
                        long timestamp = object.get("timestamp").getAsLong();
                        String script = object.get("script").getAsString();
                        String uuid = object.get("uuid").getAsString();
                        Date dateTime = new Date(timestamp);
                        Calendar c = Calendar.getInstance();
                        c.setTime(dateTime);
                        c.add(Calendar.SECOND, 5);
                        Date futureSeconds = c.getTime();
                        if(futureSeconds.after(timeStampBefore)) {
                            System.out.println("first step");
                            // step 1 complete
                            if(Utils.isAllowed(uuid,script)) {
                                System.out.println("second step");
                                // step 2 complete
                                // user is real
                                // making response
                                JsonObject responseObject = new JsonObject();
                                responseObject.addProperty("timestamp",new Date().getTime());
                                responseObject.addProperty("isAllowed",true);
                                responseObject.addProperty("shouldBlacklist",false);
                                response = Aes.encrypt(responseObject.toString(),Utils.key0);
                            } else {
                                killObject.addProperty("shouldBlacklist",false);
                                response = Aes.encrypt(killObject.toString(),Utils.key0);
                            }
                        } else {
                            killObject.addProperty("shouldBlacklist",true);
                            Utils.blacklist(uuid);
                            response = Aes.encrypt(killObject.toString(),Utils.key0);
                        }
                    }
                    System.out.println(response);
                }

            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        reader.close();
        request.sendResponseHeaders(200,response.length());
        OutputStream responseStream = request.getResponseBody();
        responseStream.write(response.getBytes());
        responseStream.close();
    }
}
