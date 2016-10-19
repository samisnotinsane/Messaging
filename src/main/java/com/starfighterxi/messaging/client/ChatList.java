package com.starfighterxi.messaging.client;

import com.starfighterxi.messaging.server.Server;
import com.starfighterxi.messaging.server.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.util.List;

/**
 * Created by sameen on 16/10/2016.
 *
 * Shows contacts online and ready for chat.
 */
public class ChatList {

    private List<User> onlineUsers;

    public ChatList(Communicator communicator) {
        // get online users from server
        this.onlineUsers = communicator.getOnlineUsers();

        showChatList();
    }

    private void showChatList() {
        try {
//            new FXMLLoader(getClass().getClassLoader().getResource(//path);
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("//fxml/ChatList.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    public User pickContact() {
        // TODO: Fetch online contacts from server and populate listview. Return chosen user.
        ListView<String> list = new ListView<String>();
        ObservableList<String> items = FXCollections.observableArrayList (
                "Single", "Double", "Suite", "Family App");
        list.setItems(items);

        return null;
    }


}
