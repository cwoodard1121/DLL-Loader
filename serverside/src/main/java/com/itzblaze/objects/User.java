package com.itzblaze.objects;


import java.util.ArrayList;

public class User {
    public String discordId;
    public String uuid;
    public ArrayList<String> scripts = new ArrayList<>();
    public boolean isActivated;

    public User(String discordId, String uuid, ArrayList<String> scripts, boolean activated) {
        this.discordId = discordId;
        this.uuid = uuid;
        this.scripts = scripts;
        this.isActivated = activated;
    }
}
