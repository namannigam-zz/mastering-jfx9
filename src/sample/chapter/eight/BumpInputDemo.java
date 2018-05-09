package sample.chapter.eight;

import javafx.application.Application;
import javafx.scene.effect.ImageInput;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class BumpInputDemo extends Application {
    @Override public void start(Stage primaryStage) throws Exception {
        // initialize light effect
        Light.Distant light = new Light.Distant();
        light.setAzimuth(100);
        light.setElevation(45);

// image for bump input
        ImageInput ii = new ImageInput(new Image(
                "https://github.com/sgrinev/mastering-javafx-9-book/blob/master/resources/packt_logo.png?raw=true"), 0,
                70); // 70 here is a vertical offset

// create lighting and set bump input
        Lighting lighting = new Lighting();
        lighting.setLight(light);
        lighting.setBumpInput(ii);

// node which we apply effect to
        ImageView iv = new ImageView(new Image(
                "https://github.com/sgrinev/mastering-javafx-9-book/blob/master/resources/sample.jpg?raw=true", 250,
                250, true, true));
        iv.setEffect(lighting);
    }
}
