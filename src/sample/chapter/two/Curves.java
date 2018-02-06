package sample.chapter.two;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.QuadCurve;
import javafx.stage.Stage;

public class Curves extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Ellipse ellipse = new Ellipse();
        ellipse.setRadiusX(60);
        ellipse.setRadiusY(40);
        ellipse.setFill(Color.DARKGREY);

        Arc arc = new Arc();
        arc.setRadiusX(60);
        arc.setRadiusY(40);
        arc.setFill(Color.DARKGREY);
        arc.setStartAngle(45);
        arc.setLength(180);

        CubicCurve cubic = new CubicCurve();
        cubic.setStartX(0.0);
        cubic.setStartY(100.0);
        cubic.setControlX1(75.0);
        cubic.setControlY1(0.0);
        cubic.setControlX2(125.0);
        cubic.setControlY2(170.0);
        cubic.setEndX(150.0);
        cubic.setEndY(100.0);
        cubic.setFill(Color.DARKGRAY);

        QuadCurve quad = new QuadCurve();
        quad.setStartX(0.0);
        quad.setStartY(100.0);
        quad.setEndX(100.0);
        quad.setEndY(100.0);
        quad.setControlX(115.0);
        quad.setControlY(0.0);
        quad.setFill(Color.DARKGRAY);

        StackPane root = new StackPane();
        root.getChildren().addAll(ellipse, arc, quad, cubic);

        Scene scene = new Scene(root, 200, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello FX!");
        primaryStage.show();


    }
}