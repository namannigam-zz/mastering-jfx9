package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class HorizontalBoxes extends Application {
    @Override
    public void start(Stage stage) throws Exception {
//        CheckBox node = new CheckBox("I'm ready for FX!");
//        Rectangle rect = new Rectangle(70, 70, Color.GREEN);
        HBox root = new HBox(5);
        root.getChildren().addAll(
                new Rectangle(50, 50, Color.GREEN),
                new Rectangle(75, 75, Color.BLUE),
                new Rectangle(90, 90, Color.RED));

        Scene scene = new Scene(root, 150, 100);
        stage.setScene(scene);
        stage.setTitle("Hello FX!");
        stage.show();
    }
}