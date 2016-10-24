package com.starfighterxi.messaging.client;

import com.starfighterxi.messaging.server.Server;
import com.starfighterxi.messaging.server.UnableToRegisterUserException;
import com.starfighterxi.messaging.server.User;
import com.starfighterxi.messaging.server.UserNotFoundException;

import java.util.List;

/**
 * Created by sameen on 20/10/2016.
 * Holds a User who sends Messages to a Postman.
 */
public class Client {
    private User user;
    private User receiver;



    public Client(User user) {
        this.user = user;
    }

    public User findReceiver(String username) throws UserNotFoundException {
        return null;
    }

    public boolean register(User user) throws UnableToRegisterUserException {
        if( Communicator.connect() ) {
            // perform registration actions ...

//            return Communicator.registerUser(user);
        } else {
            throw new UnableToRegisterUserException();
        }



        return false;
    }

    private void connect() {

    }

    public List<User> getOnlineUsers() throws ServerCommunicationException {
        List<User> onlineUsers = null;
        try {
//            onlineUsers =  serverInstance.getOnlineUsers();
        }catch (Exception e) {
            e.printStackTrace();
        }
        if(onlineUsers == null)
            throw new ServerCommunicationException();

        return onlineUsers;
    }

    // Getters and Setters
    public User getUser() {
        return user;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setReceiver(User user) {
        this.receiver = user;
    }
}
