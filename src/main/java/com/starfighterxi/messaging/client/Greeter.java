package com.starfighterxi.messaging.client;

import com.starfighterxi.messaging.server.User;
import com.starfighterxi.messaging.server.Utils;
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

import java.util.Scanner;

/**
 * Created by sameen on 16/10/2016.
 *
 * UI for creating username and logging into network.
 */
public class Greeter {

    private TextField txtUsername;
    private User user;
    private CLI cli;

    public Greeter(User user) {
        this.user = user;
    }

    public Greeter(User user, CLI cli) {
        this.user = user;
        this.cli = cli;
    }

    public User getUsername() {
        if(cli == null) {
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
            hBox.setPadding(new Insets(10, 10, 10, 10));
            hBox.getChildren().addAll(lblUsername, txtUsername, btnRegister);


            Scene scene = new Scene(new Group());
            ((Group) scene.getRoot()).getChildren().addAll(hBox);
            stage.setScene(scene);
            stage.showAndWait();
        } else {
            Scanner scanner = new Scanner(System.in);
            Utils.out("Enter username for registration: ");
            String username = scanner.nextLine();
            user.setName(username);
        }

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
