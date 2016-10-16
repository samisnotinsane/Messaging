package com.starfighterxi.messaging.client;

import com.starfighterxi.messaging.server.Server;
import com.starfighterxi.messaging.server.User;
import javafx.application.Application;
import javafx.stage.Stage;

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
        Greeter greet = new Greeter(userBuilder());
        User user = greet.getUsername();
        communicator.login(user);
        System.out.println("user id = " + user.getId() + " name = " + user.getName());

        ChatList chatList = new ChatList(communicator);
        User chatWithUser = chatList.pickContact();
        ChatView chatView = new ChatView(chatWithUser);


    }

    public static void main(String[] args) {
        launch(args);
    }
}
