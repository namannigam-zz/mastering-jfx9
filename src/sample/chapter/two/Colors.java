package sample.chapter.two;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Colors extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        root.getChildren().addAll(
                // RED, opacity 0.3
                new Circle(150, 80, 70, Color.rgb(255, 0, 0, 0.3)),
                // GREEN, opacity 0.3
                new Circle(100, 180, 70, Color.hsb(120, 1.0, 1.0, 0.3)),
                // BLUE, opacity 0.3
                new Circle(200, 180, 70, Color.web("0x0000FF", 0.3))
        );

        Scene scene = new Scene(root, 200, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello FX!");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);

    }

    public void stop() {
        System.out.println("Stopped!");
    }
}