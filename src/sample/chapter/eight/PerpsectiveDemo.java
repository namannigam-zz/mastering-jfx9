package sample.chapter.eight;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.effect.PerspectiveTransform;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PerpsectiveDemo extends Application {
    @Override public void start(Stage primaryStage) throws Exception {
        PerspectiveTransform pt = new PerspectiveTransform();
        pt.setUlx(20);  // upper-left
        pt.setUly(20);
        pt.setUrx(100); // upper-right
        pt.setUry(20);

        pt.setLlx(0);   // lower-left
        pt.setLly(120);
        pt.setLrx(120); // lower-right
        pt.setLry(120);

//        PerspectiveTransform pt1 = new PerspectiveTransform(20, 20, 100, 20, 0, 120, 120, 120);

        Group g = new Group();
        g.setEffect(pt);
        g.setCache(true);

        Rectangle rect = new Rectangle();
        rect.setX(10.0);
        rect.setY(10.0);
        rect.setWidth(280.0);
        rect.setHeight(80.0);
        rect.setFill(Color.web("0x3b596d"));

        Text text = new Text();
        text.setX(20.0);
        text.setY(65.0);
        text.setText("Perspective");
        text.setFill(Color.ALICEBLUE);
        text.setFont(Font.font(null, FontWeight.BOLD, 36));

        g.getChildren().addAll(rect, text);
    }
}