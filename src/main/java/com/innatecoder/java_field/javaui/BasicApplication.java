package com.innatecoder.java_field.javaui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.control.Label;
import javafx.scene.Scene;

public class BasicApplication extends Application {

    @Override
        public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My First JavaFX App");
        Label label = new Label("Hello World, JavaFX!");
        
        Scene scene = new Scene(label, 400, 200);
        primaryStage.setScene(scene);

        primaryStage.initStyle(StageStyle.DECORATED);

        primaryStage.show();

    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    

}