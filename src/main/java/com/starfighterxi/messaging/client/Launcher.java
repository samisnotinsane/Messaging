package com.starfighterxi.messaging.client;

import com.starfighterxi.messaging.server.Server;
import com.starfighterxi.messaging.server.User;
import com.starfighterxi.messaging.server.UserNotFoundException;
import com.starfighterxi.messaging.server.Utils;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.List;

/**
 * Created by sameen on 16/10/2016.
 *
 * Main runner.
 */
public class Launcher extends Application {

    public User userBuilder() {
        return new User();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Communicator communicator = new Communicator();
        Greeter greeter = null;
        CLI cli = null;
        Utils.out("Start in debug mode (y/n)? ");
        String resp = Utils.in();
        if(resp.equalsIgnoreCase("y")) {
            // terminal mode
            cli = new CLI();

            greeter = new Greeter(userBuilder(), cli);
            User user = greeter.getUsername();
            Client client = new Client(user);

            boolean registrationSuccess = false;
            try {
                registrationSuccess = client.register(user); // register with server
            } catch (Exception e) {
                e.printStackTrace();
            }
            if(registrationSuccess) {
                List<User> onlineUsers = client.getOnlineUsers();
                if(onlineUsers.size() != 0) {
                    int onlineUserCount = onlineUsers.size();
                    Utils.out("There are " + onlineUserCount + " users online.");
                    Utils.out("Do you wish to chat (y/n)?");
                    String chatIntent = Utils.in();
                    if (chatIntent.equalsIgnoreCase("y")) {
                        // Create a new session
                        Session chatSession = Session.getInstance();
                        Utils.out("Please enter the username of the person you wish to chat with: ");
                        String chatWithName = Utils.in();
                        User chatWithUser = null;
                        try {
                            chatWithUser = client.findReceiver(chatWithName);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        if (chatWithUser != null) {
                            // Found a user to chat with


                        }



                    }

                }
            }


        } else if(resp.equalsIgnoreCase("n")) {
            // gui mode
            greeter = new Greeter(userBuilder());
            User user = greeter.getUsername();

            communicator.login(user);
            System.out.println("user id = " + user.getId() + " name = " + user.getName());
            ChatList chatList = new ChatList(communicator);

//          User chatWithUser = chatList.pickContact();
//          ChatView chatView = new ChatView(chatWithUser);
        }







    }

    public static void main(String[] args) {
        launch(args);
    }
}
