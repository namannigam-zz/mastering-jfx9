package sample.chapter.eight;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SpotLightDemo extends Application {
    @Override public void start(Stage primaryStage) throws Exception {
        Light.Spot light = new Light.Spot(200, 150, 500, 1, Color.WHITE);
        light.setPointsAtX(100);
        light.setPointsAtY(100);
        light.setPointsAtZ(0);

        Lighting lighting = new Lighting();
        lighting.setLight(light);
        lighting.setSurfaceScale(5);

        Text text = new Text("FX");
        text.setFill(Color.STEELBLUE);
        text.setFont(Font.font(null, FontWeight.BOLD, 70));

        text.setEffect(lighting);

        Rectangle rect = new Rectangle(70, 70, Color.LIGHTGREEN);
        rect.setEffect(lighting); // note we can reuse the effect object

        Circle circle = new Circle(60, Color.TRANSPARENT);
        circle.setStroke(Color.DARKGRAY);
        circle.setStrokeWidth(10);
        circle.setEffect(lighting);

        HBox root = new HBox(10, text, rect, circle);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        Scene scene = new Scene(root, 400, 150);

        primaryStage.setTitle("Lighting Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}