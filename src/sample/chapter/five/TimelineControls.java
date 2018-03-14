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

import java.util.Map;

public class TimelineControls extends Application {

    @Override
    public void start(Stage primaryStage) {

        Node node = new Circle(50, 150, 50, Color.RED);

        Pane root = new Pane();
        root.getChildren().add(node);

        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1),
                (event) -> System.out.println("every second on the UI thread"))); // no keyvalues is ok
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
        timeline.pause();
        timeline.play();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);
        System.out.println(timeline.getStatus());
        timeline.stop();



        // cue points
        KeyValue keyValue = new KeyValue(node.translateXProperty(), 200);
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(5), "cue point 1", keyValue);
        timeline.playFrom("cue point 1");

        timeline.getKeyFrames().add(keyFrame); // just to experiment

        // cue points set using KeyFrame
        for (Map.Entry<String, Duration> entry : timeline.getCuePoints().entrySet()) {
            System.out.println(entry.getValue() + ": " + entry.getKey());
        }
    }
}