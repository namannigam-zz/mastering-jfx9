package sample.chapter.five;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

// BasicAnimation.java
public class BasicAnimation extends Application {

    @Override
    public void start(Stage primaryStage) {

        Node node = new Circle(50, 150, 50, Color.RED);

        Pane root = new Pane();
        root.getChildren().add(node);

        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();

        KeyValue keyValue = new KeyValue(node.translateXProperty(), 200);
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(5), keyValue);
        Timeline timeline = new Timeline(keyFrame);

        timeline.play();
    }
}