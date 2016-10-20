package com.starfighterxi.messaging.server;

/**
 * Created by sameen on 20/10/2016.
 */
public class UnableToRegisterUserException extends Exception {

    public UnableToRegisterUserException() {
    }

    public UnableToRegisterUserException(String message) {
        super(message);
    }
}
