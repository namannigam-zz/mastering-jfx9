package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class AnchorPaneDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        Rectangle rect = new Rectangle(50, 50, Color.BLUE);

        Pane root = new AnchorPane(rect);
        AnchorPane.setRightAnchor(rect, 20.);
        AnchorPane.setBottomAnchor(rect, 20.);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                double size = 5 + 30 * Math.random();
                Rectangle rect1 = new Rectangle(size, size,
                        (i + j) % 2 == 0 ? Color.RED : Color.BLUE);
                root.getChildren().add(rect1);
            }
        }

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle(root.getClass().getSimpleName());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}