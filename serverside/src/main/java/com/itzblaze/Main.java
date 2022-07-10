package com.itzblaze;

import com.itzblaze.objects.User;
import com.itzblaze.server.Aes;
import com.itzblaze.server.ServerHandler;
import com.itzblaze.server.Utils;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080),0);
        server.createContext("/api",new ServerHandler());
        server.setExecutor(null);
        server.start();
    }
}
