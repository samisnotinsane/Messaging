package com.starfighterxi.messaging.client;

import com.starfighterxi.messaging.server.User;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by sameen on 16/10/2016.
 *
 * UI for creating username and logging into network.
 */
public class Greeter {

    private TextField txtUsername;
    private User user;

    public Greeter(User user) {
        this.user = user;
    }

    public User getUsername() {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Welcome");

        Label lblUsername = new Label("Username");
        txtUsername = new TextField();
        Button btnRegister = new Button("Register");
        btnRegister.setDefaultButton(true);

        btnRegister.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                registerButtonHandler(event);
                stage.close();
            }
        });

        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setPadding(new Insets(10,10,10,10));
        hBox.getChildren().addAll(lblUsername, txtUsername, btnRegister);


        Scene scene = new Scene(new Group());
        ((Group) scene.getRoot()).getChildren().addAll(hBox);
        stage.setScene(scene);
        stage.showAndWait();

        return user;
    }

    public void registerButtonHandler(ActionEvent e) {
        user.setName(txtUsername.getText());
        System.out.println("[DEBUG] - RegisterButtonHandler()");

    }

    public User getUser() {
        return user;
    }
}
