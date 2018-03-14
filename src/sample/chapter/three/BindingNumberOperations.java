package sample.chapter.three;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class BindingNumberOperations extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = new Pane();

        final int count = 7; //number of rectangles

        // this is binding to calculate rectangle size
        // based on their count and minimal of scene width and height
        NumberBinding minSide = Bindings
                .min(root.heightProperty(), root.widthProperty())
                .divide(count);

        for (int x = 0; x < count; x++) {
            for (int y = 0; y < count; y++) {
                Rectangle rectangle = new Rectangle(0, 0, Color.LIGHTGRAY);

                // binding rectangle location to it's side size
                rectangle.xProperty().bind(minSide.multiply(x));
                rectangle.yProperty().bind(minSide.multiply(y));

                // binding rectangle's width and height
                rectangle.heightProperty().bind(minSide.subtract(2));
                rectangle.widthProperty().bind(rectangle.heightProperty());

                root.getChildren().add(rectangle);
            }
        }

        stage.setScene(new Scene(root, 500, 500));
        stage.show();
    }
}