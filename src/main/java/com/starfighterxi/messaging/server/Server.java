package com.starfighterxi.messaging.server;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sameen on 15/10/2016.
 */
public class Server {
    private List<Message> inTray;
    private List<Message> outTray;
    private List<User> onlineUsers;

    private void addOnlineUser(User user) {
        if (onlineUsers == null)
            onlineUsers = new ArrayList<>();
        onlineUsers.add(user);
    }

    public List<Message> getInTray() {
        return inTray;
    }

    public List<Message> getOutTray() {
        return outTray;
    }

    public List<User> getOnlineUsers() {
        return onlineUsers;
    }

    public boolean registerUser(User user) throws UnableToRegisterUserException {
        try {
            addOnlineUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
