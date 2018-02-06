package sample.chapter.two;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ImagePatternSample extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        root.getChildren().add(new Circle(100, new ImagePattern(
                new Image("https://upload.wikimedia.org/wikipedia/commons/3/3f/Chimpanzee_congo_painting.jpg"))));
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