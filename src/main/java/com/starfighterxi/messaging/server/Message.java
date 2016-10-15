package com.starfighterxi.messaging.server;

/**
 * Created by sameen on 15/10/2016.
 *
 * Represents a single packet of message in the network.
 */
public class Message {

    private String message;
    private User owner;
    private User receiver;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }
}
