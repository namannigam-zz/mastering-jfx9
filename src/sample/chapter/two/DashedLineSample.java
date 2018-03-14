package sample.chapter.two;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import javafx.stage.Stage;

public class DashedLineSample extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Line line = new Line(50, 0, 250, 0);
        line.setStrokeWidth(10);
        line.setStroke(Color.DARKGRAY);
        line.getStrokeDashArray().addAll(30.0, 15.0);
        line.setStrokeLineCap(StrokeLineCap.ROUND);
//        line.setStrokeLineCap(StrokeLineCap.BUTT);
        line.setStrokeDashOffset(20);

        StackPane root = new StackPane();
        root.getChildren().addAll(line);

        Scene scene = new Scene(root, 200, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello FX!");
        primaryStage.show();

    }

    public void stop() {
        System.out.println("Stopped!");
    }
}