package sample.chapter.eight;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class OneToAnotherEffect extends Application {
    @Override public void start(Stage primaryStage) throws Exception {
        Rectangle rect1 = new Rectangle(50, 50, Color.RED);
        DropShadow effect1 = new DropShadow();
        effect1.setInput(new Reflection());
        rect1.setEffect(effect1);

        Rectangle rect2 = new Rectangle(50, 50, Color.RED);
        Reflection effect2 = new Reflection();
        effect2.setInput(new DropShadow());
        rect2.setEffect(effect2);

        HBox root = new HBox(30, rect1, rect2);
        root.setPadding(new Insets(50));
        primaryStage.setTitle("Inputs");
        primaryStage.setScene(new Scene(root, 230, 200));
        primaryStage.show();
    }
}