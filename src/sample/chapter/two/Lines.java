package sample.chapter.two;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Lines extends Application {
    public static void main(String[] args) {
        Application.launch(args);
//        Application.launch(FXApplication.class, args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Line line = new Line(10, 10, 100, 50);

        Polyline polyline = new Polyline();
        polyline.getPoints().addAll(
                0.0, 0.0,
                50.0, 30.0,
                10.0, 60.0);
        polyline.setFill(Color.RED);

        StackPane root = new StackPane();
        root.getChildren().addAll(line, polyline);

        Scene scene = new Scene(root, 200, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello FX!");
        primaryStage.show();

    }

    public void stop() {
        System.out.println("Stopped!");
    }
}
