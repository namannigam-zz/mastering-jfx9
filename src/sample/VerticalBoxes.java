package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class VerticalBoxes extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox(5);
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