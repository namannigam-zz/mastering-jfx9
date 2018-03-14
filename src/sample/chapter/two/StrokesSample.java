package sample.chapter.two;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Arrays;

public class StrokesSample extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        HBox hbox = new HBox();
        hbox.getChildren().add(new VBox(5, new Text("NONE"), new Rectangle(50, 50, Color.LIGHTGRAY)));
        Arrays.stream(StrokeType.values()).forEach(type -> {
            Rectangle rect = new Rectangle(50, 50, Color.LIGHTGRAY);
            rect.setStrokeType(type);
            rect.setStroke(Color.BLACK);
            rect.setStrokeWidth(10);
            hbox.getChildren().add(new VBox(5, new Text(type.toString()), rect));
        });
        root.getChildren().addAll(hbox);

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