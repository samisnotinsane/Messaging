package com.starfighterxi.messaging.client;

import com.starfighterxi.messaging.server.Message;
import com.starfighterxi.messaging.server.User;

import static org.junit.Assert.*;

/**
 * Created by sameen on 19/10/2016.
 */
public class PostmanTest {

    @org.junit.Test
    public void addMessage() throws Exception {

        User sender = new User();
        User receiver = new User();
        Message msg = new Message(sender, receiver, "Hello world!");

    }

}