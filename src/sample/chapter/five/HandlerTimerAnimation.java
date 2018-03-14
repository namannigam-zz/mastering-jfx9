package sample.chapter.five;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HandlerTimerAnimation extends Application {

    @Override
    public void start(Stage primaryStage) {

        Node node = new Circle(50, 150, 50, Color.RED);

        Pane root = new Pane();
        root.getChildren().add(node);

        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();

        KeyFrame keyFrame = new KeyFrame(Duration.seconds(5),
                (ActionEvent event) -> {
//                    node.setFill(Color.GREEN);
                },
                new KeyValue(node.translateXProperty(), 200));

        Timeline ttimer = new Timeline(new KeyFrame(Duration.seconds(1),
                (event) -> System.out.println("every second on the UI thread"))); // no keyvalues is ok
        ttimer.setCycleCount(Timeline.INDEFINITE);
        ttimer.play();

    }
}