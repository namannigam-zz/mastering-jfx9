package sample.chapter.eight;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BlendSourceDemo extends Application {

    public void start(Stage primaryStage) {
        Image image = new Image(
                "https://github.com/sgrinev/mastering-javafx-9-book/blob/master/resources/sample.jpg?raw=true",
                300, 300, true, true);
        ImageInput ii = new ImageInput(image, 0, 0);

        Blend blend = new Blend();
        blend.setMode(BlendMode.SRC_ATOP);
        blend.setTopInput(ii);

        Text text = new Text(0, 80, "JavaFX");
        text.setFont(Font.font("Verdana", FontWeight.BOLD, 70));
        text.setEffect(blend);

        primaryStage.setTitle("Blend Demo");
        primaryStage.setScene(new Scene(new StackPane(text), 300, 300));
        primaryStage.show();
    }
}