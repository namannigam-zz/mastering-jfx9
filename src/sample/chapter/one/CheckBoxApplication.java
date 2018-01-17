package sample.chapter.one;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class CheckBoxApplication extends Application {
    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane();

        CheckBox node = new CheckBox("I'm ready for FX!");
        Rectangle rect = new Rectangle(70, 70, Color.GREEN);
        root.getChildren().addAll(rect, node);

        Scene scene = new Scene(root, 150, 100);
        stage.setScene(scene);
        stage.setTitle("Hello FX!");
        stage.show();
    }
}