package com.starfighterxi.messaging.client;

import com.starfighterxi.messaging.server.Server;
import com.starfighterxi.messaging.server.User;
import com.starfighterxi.messaging.server.Utils;

import java.util.List;

/**
 * Created by sameen on 16/10/2016.
 *
 * Communicates with Server.
 */
public class Communicator {
    private Server server;


    public Communicator() {
        this.server = new Server();
    }


    public boolean login(User user) {
        try {
            server.addOnlineUser(user);
        } catch (Exception e) {
            Utils.print("Could not make user online!");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public List<User> getOnlineUsers() {
        List<User> onlineUsers = null;
        try {
            onlineUsers =  server.getOnlineUsers();
        }catch (Exception e) {
            e.printStackTrace();
        }
        if(onlineUsers == null) {
            try {
                throw new ServerCommunicationException();
            } catch (ServerCommunicationException e) {
                e.printStackTrace();
            }
        }
        return onlineUsers;
    }
}
