package sample.chapter.eight;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ColorAdjustDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        ImageView imageView = new ImageView(
                "https://github.com/sgrinev/mastering-javafx-9-book/blob/master/Chapter8/src/chapter8/colors/sample.jpg?raw=true");
        imageView.setFitHeight(240);
        imageView.setFitWidth(240);
        ColorAdjust ca = new ColorAdjust();

        //

        SepiaTone st = new SepiaTone();
        st.setLevel(0.5);
        imageView.setEffect(st);


        imageView.setEffect(ca);

        VBox root = new VBox(10);
        for (DoubleProperty prop : new DoubleProperty[]{
                ca.hueProperty(), ca.contrastProperty(), ca.brightnessProperty(), ca.saturationProperty()
        }) {
            Slider slider = new Slider(-1, 1, 0.);
            prop.bind(slider.valueProperty());
            root.getChildren().add(new HBox(5, slider, new Label(prop.getName())));
        }
        root.getChildren().add(imageView);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10));

        primaryStage.setTitle("Color Adjust Demo");
        primaryStage.setScene(new Scene(root, 300, 400));
        primaryStage.show();
    }
}