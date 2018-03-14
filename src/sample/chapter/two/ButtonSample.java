package sample.chapter.two;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ButtonSample extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(event -> System.out.println("Hello World!"));
        btn.setGraphic(new Circle(10));
        btn.setDefaultButton(true);

        btn.setText("_Press Alt+P to fire me.");

        VBox root = new VBox(5);
        root.setPadding(new Insets(20));
        Button btnShort = new Button("short");
        btnShort.setMinWidth(50);
        root.getChildren().addAll(
                new Button("hi"),
                btnShort,
                new Button("mediocre"),
                new Button("wide-wide-wide")
        );
    }
}