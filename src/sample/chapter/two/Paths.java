package sample.chapter.two;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Paths extends Application {

    @Override
    public void start(Stage primaryStage) {
        ArcTo arcTo = new ArcTo();
        arcTo.setRadiusX(250);
        arcTo.setRadiusY(90);
        arcTo.setX(50);
        arcTo.setY(100);
        arcTo.setSweepFlag(true);

        Path path = new Path(
                new MoveTo(0, 0),
                new HLineTo(50),
                arcTo, // ArcTo is set separately due to its complexity
                new VLineTo(150),
                new HLineTo(0),
                new ClosePath()
        );

        StackPane root = new StackPane();
        root.getChildren().addAll(path);

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