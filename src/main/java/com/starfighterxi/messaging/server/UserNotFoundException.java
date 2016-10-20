package com.starfighterxi.messaging.server;

/**
 * Created by sameen on 20/10/2016.
 */
public class UserNotFoundException extends Exception {

    public UserNotFoundException() {}

    public UserNotFoundException(String message) {
        super(message);
    }
}
