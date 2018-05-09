package sample.chapter.eight;

import javafx.application.Application;
import javafx.scene.effect.InnerShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class InnerShadowDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        Circle red = new Circle(50, Color.RED);
        red.setEffect(new InnerShadow());

        Circle yellow = new Circle(50, Color.YELLOW);
        yellow.setEffect(new InnerShadow(
                10,    // shadow radius
                10, 0, // x,y offset
                Color.BLACK));

        Circle green = new Circle(50, Color.GREEN);
        green.setEffect(new InnerShadow(10, 10, 10, Color.BLACK));
    }
}