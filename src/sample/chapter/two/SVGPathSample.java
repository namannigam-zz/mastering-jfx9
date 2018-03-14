package sample.chapter.two;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class SVGPathSample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M0,0 H50 A250,90 0 0,1 50,100 V150 H0 Z");
// M - move, H - horizontal line, A - arc, V - vertical line, Z - close path
        svgPath.setFill(Color.DARKGREY);

        StackPane root = new StackPane();
        root.getChildren().addAll(svgPath);

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