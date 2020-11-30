package com.innatecoder.java_field.javaui.media;


import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;


public class Player extends Application {

    @Override
        public void start(Stage primaryStage) {
            try {
                
                //primaryStage.setTitle("Media Player");
                //var mediafile = new File("src/main/java/com/innatecoder/java_field/javaui/media/Portal.mp4");
                
                //var media = new Media(mediafile.toURI().toURL().toString());
                //var mediaPlayer = new MediaPlayer(media);
                                
                                
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