package com.innatecoder.java_field.javaui.base;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

 
public class Main extends Application{
     
    public static void main(String[] args) {
         
        Application.launch(args);
    }
     
    @Override
    public void start(Stage stage) throws Exception {
         
        Parent root = FXMLLoader.load(getClass().getResource("Mainfx.fxml")); 
        Scene scene = new Scene(root);
                
         
        stage.setScene(scene);
         
        stage.setTitle("Hello JavaFX");
        //stage.setWidth(800);
        //stage.setHeight(400);
         
        stage.showAndWait();
    }
}
