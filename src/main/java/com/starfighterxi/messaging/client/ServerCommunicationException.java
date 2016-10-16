package com.starfighterxi.messaging.client;

import com.starfighterxi.messaging.server.Server;

/**
 * Created by sameen on 16/10/2016.
 */
public class ServerCommunicationException extends Exception {

    public ServerCommunicationException() { }

    public ServerCommunicationException(String message) {
        super(message);
    }
}
