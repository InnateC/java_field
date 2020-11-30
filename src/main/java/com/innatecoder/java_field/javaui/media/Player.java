package com.innatecoder.java_field.javaui.media;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;


public class Player extends Application {

    @Override
        public void start(Stage primaryStage) {
            try {
                
                Stage stage = FXMLLoader.load(getClass().getResource("media.fxml"));
                stage.show();
                

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Something went wrong");
                System.exit(-1);
            }
        

    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    

}