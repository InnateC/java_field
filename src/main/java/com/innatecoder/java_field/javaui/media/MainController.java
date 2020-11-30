package com.innatecoder.java_field.javaui.media;

import java.io.File;
import java.net.MalformedURLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class MainController {

    public MainController() throws MalformedURLException {
        var mediafile = new File("src/main/java/com/innatecoder/java_field/javaui/media/Portal.mp4");
        
        var media = new Media(mediafile.toURI().toURL().toString());
        var mediaPlayer = new MediaPlayer(media);
        
        view = new MediaView(mediaPlayer); 
    }

    @FXML
    private Button playBtn;

    @FXML
    private MediaView view;

    @FXML
    private void clickStop(ActionEvent event)  {
      
        view.getMediaPlayer().stop();;
    }

    @FXML
    private void clickPlay(ActionEvent event)  {
      
        view.getMediaPlayer().play();;
    }

    @FXML
    void initialize() {
        
    }
}