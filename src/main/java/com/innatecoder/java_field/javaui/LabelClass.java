/* example from CLI
export PATH_TO_FX=/usr/lib/jvm/java-14-openjdk/lib/
javac -d target/classes --module-path /usr/lib/jvm/java-14-openjdk/lib/ --add-modules javafx.controls src/main/java/com/innatecoder/java_field/javafx/LabelClass.java
java -cp target/classes --module-path $PATH_TO_FX --add-modules javafx.controls com.innatecoder.java_field.javafx.LabelClass
*/ 


package com.innatecoder.java_field.javaui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class LabelClass extends Application {

    @Override
    public void start(Stage stage) {
                
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Scene scene = new Scene(new StackPane(l), 640, 480);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}