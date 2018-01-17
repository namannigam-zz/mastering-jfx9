package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BorderPaneDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        root.setRight(new Text("Right "));
        root.setCenter(new Text("Center"));
        root.setBottom(new Text(" Bottom"));
        root.setLeft(new Text(" Left"));

        Text top = new Text("Top");
        root.setTop(top);

        BorderPane.setAlignment(top, Pos.CENTER);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                double size = 5 + 30 * Math.random();
                Rectangle rect = new Rectangle(size, size,
                        (i + j) % 2 == 0 ? Color.RED : Color.BLUE);
                root.getChildren().add(rect);
            }
        }

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle(root.getClass().getSimpleName());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}