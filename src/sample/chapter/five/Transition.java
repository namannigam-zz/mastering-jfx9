package sample.chapter.five;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Transition extends Application {

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


    public void translateTransition(Node node) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(5), node);
        transition.setToX(200);

        // instead of the end point you can set desired delta
        transition.setByX(200);

        // you can set both start and end point
        // and, of course, set X and Y coordinates for the same transition
        transition.setFromY(50);
        transition.setToY(200);

        transition.play();
    }


    public void pathTransition() {
        // PathTransitionDemo.java
        SVGPath svgPath = new SVGPath();
        svgPath.setFill(Color.LIGHTGRAY);
        // You can remember this path from Chapter 2
        svgPath.setContent("M30,30 H80 A280,120 0 0,1 80,130 V180 H30 Z");

        Node node = new Circle(10, Color.BLACK);
        PathTransition pt = new PathTransition(Duration.seconds(4), svgPath, node);

        // any shape
        PathTransition pathTransition = new PathTransition(Duration.seconds(4), new Circle(50), node);
    }

    public void rotateTransition() {
        Node node = new Rectangle(50, 50, 120, 80);
        RotateTransition rt = new RotateTransition(Duration.seconds(3), node);
        rt.setByAngle(180);
        rt.play();
    }

    public void scaleTransition(Node node) {
        ScaleTransition st = new ScaleTransition(Duration.seconds(3), node);
        st.setToX(2); // double the size of the node
        st.setByX(1); // double the size of the node
        st.setByX(-1); // change size to 0
        st.play();
    }

    public void colorTransition() {
        // ColorTransitionsDemo.java
        Shape circle = new Circle(50, 150, 50);
        FillTransition ft = new FillTransition(Duration.seconds(3), circle, Color.RED, Color.BLUE);
        ft.play();
    }
}