package com.starfighterxi.messaging.client;

import com.starfighterxi.messaging.server.Server;
import com.starfighterxi.messaging.server.User;
import com.starfighterxi.messaging.server.Utils;

import java.net.Socket;
import java.util.List;

/**
 * Created by sameen on 16/10/2016.
 *
 * Communicates with Server.
 */
public class Communicator {
    private static Socket clientSocket;

    private static final String SERVER_NAME = "ALEC";
    private static final int PORT = 1025;


    public static boolean connect() {
        try {
            clientSocket = new Socket(SERVER_NAME, PORT);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    public boolean login(User user) {
        try {
//            server.registerUser(user);
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
//            onlineUsers =  server.getOnlineUsers();
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



    public static int getPortNo() {
        return PORT;
    }

    public static String getServerName() {
        return SERVER_NAME;
    }
}
