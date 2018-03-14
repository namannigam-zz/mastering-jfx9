package sample.chapter.two;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ClosedShapes extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Rectangle rect = new Rectangle(50, 50);
        rect.setArcHeight(10);
        rect.setArcWidth(10);
        rect.setFill(Color.DARKGREY);

        Circle circle = new Circle(50);
        circle.setFill(Color.DARKGREY);

        Ellipse ellipse = new Ellipse();
        ellipse.setRadiusX(60);
        ellipse.setRadiusY(40);
        ellipse.setFill(Color.DARKGREY);

        Polygon polygon = new Polygon();
        polygon.setFill(Color.DARKGREY);
        polygon.getPoints().addAll(
                0.0, 0.0,
                50.0, 30.0,
                10.0, 60.0);


//        polygon.getPoints().addAll(0., 0., 50., 0., 0., 50., 50., 50., 30., -10., 20.,70.);

        StackPane root = new StackPane();
        root.getChildren().addAll(rect, polygon, circle, ellipse);

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