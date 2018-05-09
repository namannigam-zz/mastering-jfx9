package sample.chapter.eight;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BlendDiffDemo extends Application {
    @Override public void start(Stage primaryStage) throws Exception {
        Image image = new Image(
                "https://github.com/sgrinev/mastering-javafx-9-book/blob/master/resources/sample.jpg?raw=true",
                200, 200, true, true);
        ImageInput ii = new ImageInput(image, 0, 0);

        Image image2 = new Image(
                "https://github.com/sgrinev/mastering-javafx-9-book/blob/master/resources/sample2.jpg?raw=true",
                200, 200, true, true);

        Blend blend = new Blend();
        blend.setMode(BlendMode.DIFFERENCE);
        blend.setTopInput(ii);

        ImageView iv = new ImageView(image2);
        iv.setEffect(blend);

        primaryStage.setTitle("Blend Demo");
        primaryStage.setScene(new Scene(
                new HBox(20, new ImageView(image), iv, new ImageView(image2)), 640, 200));
        primaryStage.show();
    }
}