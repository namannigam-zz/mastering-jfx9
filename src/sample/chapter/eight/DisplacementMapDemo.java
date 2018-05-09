package sample.chapter.eight;

import javafx.application.Application;
import javafx.scene.effect.DisplacementMap;
import javafx.scene.effect.FloatMap;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class DisplacementMapDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        final int SIDE = 240;
        ImageView iv = new ImageView(
                "https://github.com/sgrinev/mastering-javafx-9-book/blob/master/Chapter8/src/chapter8/colors/sample.jpg?raw=true");
        iv.setFitHeight(SIDE);
        iv.setFitWidth(SIDE);

        FloatMap floatMap = new FloatMap();
        floatMap.setWidth(SIDE);
        floatMap.setHeight(SIDE);

        for (int x = 0;
             x < SIDE;
             x++) {
            double v = Math.sin(x / 30.) / 10.;
            for (int y = 0;
                 y < SIDE;
                 y++) {
                floatMap.setSamples(x, y, 0.0f, (float) v);
            }
        }

        DisplacementMap displacementMap = new DisplacementMap();
        displacementMap.setWrap(true);
        displacementMap.setMapData(floatMap);
        iv.setEffect(displacementMap);
    }
}