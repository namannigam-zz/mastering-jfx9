package sample.chapter.five;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.stream.Stream;

public class Interpolators extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(10);
        Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);

        // Note that we can reuse the same timeline for all keyframes despite the fact that they all work with different properties
        Stream.of(
                Interpolator.LINEAR,
                Interpolator.EASE_IN,
                Interpolator.EASE_BOTH,
                Interpolator.EASE_OUT
        ).forEach(interpolator -> {
            Circle node = new Circle(30, Color.RED);
            root.getChildren().add(node);
            KeyFrame keyFrame = new KeyFrame(Duration.seconds(2),
                    new KeyValue(node.translateXProperty(), 200, interpolator));
            timeline.getKeyFrames().add(keyFrame);
        });

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
        timeline.play();
    }
}