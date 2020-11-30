package com.innatecoder.java_field.javaui.media;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;


public class Player extends Application {

    @Override
        public void start(Stage primaryStage) {
            try {
                var mediafile = new File("src/main/java/com/innatecoder/java_field/javaui/media/aperture.mp3");
                
                var media = new Media(mediafile.toURI().toURL().toString());
                var mediaPlayer = new MediaPlayer(media);
            
                                
                Stage stage = FXMLLoader.load(getClass().getResource("media.fxml"));
                System.out.println(stage.getScene().getRoot().getChildrenUnmodifiable().);
                //stage.getScene().getRoot().getChildrenUnmodifiable().
                stage.setTitle("Media Player");
                stage.show();
                mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
                mediaPlayer.setAutoPlay(true);

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