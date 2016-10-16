package com.starfighterxi.messaging.server;

import java.util.List;

/**
 * Created by sameen on 15/10/2016.
 */
public class Server {
    private List<Message> inTray;
    private List<Message> outTray;
    private List<User> onlineUsers;

    public void addOnlineUser(User user) {
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
}
