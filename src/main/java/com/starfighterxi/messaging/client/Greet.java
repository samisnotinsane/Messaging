package com.starfighterxi.messaging.client;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by sameen on 16/10/2016.
 *
 * UI for creating username and logging into network.
 */
public class Greet extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new Group());
        stage.setTitle("Welcome");
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setPadding(new Insets(10,10,10,10));
        Label lblUsername = new Label("Username");
        TextField txtUsername = new TextField();
        Button btnRegister = new Button("Register");
        hBox.getChildren().addAll(lblUsername, txtUsername, btnRegister);
        ((Group) scene.getRoot()).getChildren().addAll(hBox);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
