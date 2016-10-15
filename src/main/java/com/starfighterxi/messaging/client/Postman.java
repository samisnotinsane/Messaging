package com.starfighterxi.messaging.client;

import com.starfighterxi.messaging.server.Message;

import java.util.List;

/**
 * Created by sameen on 13/10/2016.
 */
public class Postman {
    List<Message> messages;

    public void addMessage(Message message) {
        messages.add(message);
    }
}
