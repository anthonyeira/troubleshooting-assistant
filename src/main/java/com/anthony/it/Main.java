package com.anthony.it;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class Main extends Application {
    @Override
    public void start(Stage stage){
        Label label = new Label("IT Troubleshooting Assistant");
        Scene scene = new Scene(label, 400, 300);
        stage.setScene(scene);
        stage.setTitle("IT Troubleshooting Assistant");
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}