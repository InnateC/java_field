package com.innatecoder.java_field.javaui;

import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Responsive extends Application{

    private static final int number = 5;

    @Override
    public void start(Stage privaryStage) throws Exception {
        privaryStage.setTitle("Responsive app");
        Label label = new Label("The scene is ready");
        privaryStage.setScene(new Scene(label, 400, 400) );
        
      
        label.setOnMouseClicked((event) -> {
            Random random = new Random();
            label.setText("clicked " + random.nextInt(number));
        });

        privaryStage.addEventHandler(KeyEvent.KEY_PRESSED, (event) -> {
            System.out.println("Key pressed: " + event.toString());

            switch(event.getCode().getCode()) {
                case 27 : 
                    privaryStage.close();
                    break;
                case 10 : 
                    privaryStage.setWidth(privaryStage.getWidth()*2);
                    break;
                default: 
                    System.out.println("Press something else");
            }
            
        });


        privaryStage.show();

        
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
