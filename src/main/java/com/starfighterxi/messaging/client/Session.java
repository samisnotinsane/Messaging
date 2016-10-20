package com.starfighterxi.messaging.client;

import com.starfighterxi.messaging.server.Utils;

/**
 * Created by sameen on 20/10/2016.
 * Singleton. Represents a single (chat) session.
 */
public class Session  {
    private static Session instance;
    private int sessionId;

    private Session(int sessionId) {
        this.sessionId = sessionId;
    }

    public static Session getInstance() {
        if(instance == null) {
            instance = new Session(Utils.generateRandomInt());
        }
        return instance;
    }
}
