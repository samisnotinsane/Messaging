package com.starfighterxi.messaging.server;

/**
 * Created by sameen on 15/10/2016.
 *
 * Represents a single user in the network.
 */
public class User {

    private String id;
    private String name;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {

        return id;
    }

    public String getName() {
        return name;
    }
}
