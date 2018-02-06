package sample.chapter.two;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextSample extends Application {

    @Override
    public void start(Stage primaryStage) {
        Text txt = new Text("Hello, JavaFX!");
        txt.setFont(Font.font("Courier New", FontWeight.BOLD, FontPosture.ITALIC, 20));

        StackPane root = new StackPane();
        root.getChildren().addAll(txt);

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