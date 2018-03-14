package sample.chapter.two;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class ShapeOperations extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(30);
        Rectangle rect = new Rectangle(45, 45);

        StackPane root = new StackPane();
        root.getChildren().addAll(
                Shape.union(circle, rect),
                Shape.intersect(circle, rect),
                Shape.subtract(circle, rect));

        Scene scene = new Scene(root, 200, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello FX!");
        primaryStage.show();
    }
}