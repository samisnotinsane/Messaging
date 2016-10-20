package com.starfighterxi.messaging.client;

import com.starfighterxi.messaging.server.User;
import com.starfighterxi.messaging.server.UserNotFoundException;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sameen on 20/10/2016.
 */
public class ClientTest {
    @Test
    public void findReceiver() throws Exception {
        User user = new User();
        Client newClient = new Client(user);
        User otherUser = newClient.findReceiver("abbey");
        if(otherUser == null)
            throw new UserNotFoundException();
    }

    @Test
    public void register() throws Exception {

    }

    @Test
    public void getOnlineUsers() throws Exception {

    }

}