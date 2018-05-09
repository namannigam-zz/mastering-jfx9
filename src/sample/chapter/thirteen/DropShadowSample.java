package sample.chapter.thirteen;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class DropShadowSample extends Application {

    public void start(Stage stage) throws Exception {
        Circle red = new Circle(50, Color.RED);
        red.setEffect(new DropShadow());

        Circle yellow = new Circle(50, Color.YELLOW);
        yellow.setEffect(new DropShadow(
                10,      // shadow radius
                10, 0,   // x,y offset
                Color.DARKGRAY));

        Circle green = new Circle(50, Color.GREEN);
        green.setEffect(new DropShadow(10, 10, 10, Color.DARKGRAY));

        VBox root = new VBox(10, red, yellow, green);
        root.setAlignment(Pos.CENTER);
        stage.setScene(new Scene(root, 200, 350));
        stage.show();
    }
}