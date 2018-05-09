package sample.chapter.eight;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ReflectionDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        Reflection reflection = new Reflection();
        reflection.setTopOffset(5);  // how far from source the reflection should start
        reflection.setFraction(0.7); // size of the reflection
        // starting and ending opacity levels
        reflection.setTopOpacity(0.05);
        reflection.setBottomOpacity(0.5);

        Button button = new Button("Button");
        button.setEffect(reflection);

        primaryStage.setTitle("Reflection Demo");
        primaryStage.setScene(new Scene(new StackPane(button), 300, 250));
        primaryStage.show();
    }
}