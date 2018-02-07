package sample.chapter.three;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class BindingForVisualHelp extends Application {

    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(150, 150, 40, Color.ANTIQUEWHITE);
        circle.setStroke(Color.BLACK);

        Slider sliderRadius = new Slider(0, 100, 40);
        sliderRadius.relocate(80, 20);
        sliderRadius.setShowTickLabels(true);
        sliderRadius.setMajorTickUnit(20);

        circle.radiusProperty()
                .bind(sliderRadius.valueProperty());

        Slider sliderStrokeWidth = new Slider(0, 10, 2);
        sliderStrokeWidth.setShowTickLabels(true);
        sliderStrokeWidth.setMajorTickUnit(2);
        sliderStrokeWidth.relocate(80, 50);

        circle.strokeWidthProperty()
                .bind(sliderStrokeWidth.valueProperty());

        Pane root = new Pane();
        root.getChildren().addAll(sliderRadius, circle, sliderStrokeWidth);
        primaryStage.setTitle("Hello Binding!");
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}