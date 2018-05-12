package sample.chapter.twelve;

import javafx.application.Application;
import javafx.geometry.Point3D;
import javafx.scene.image.Image;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

public class Materials extends Application {

    @Override public void start(Stage primaryStage) throws Exception {
        PhongMaterial material = new PhongMaterial();
        material.setBumpMap(new Image(
                "https://upload.wikimedia.org/wikipedia/commons/8/86/IntP_Brick_NormalMap.png"));

        Box box = new Box(100, 100, 100);
        box.setTranslateX(250);
        box.setTranslateY(100);
        box.setTranslateZ(400);
        box.setRotate(50);
        box.setRotationAxis(new Point3D(100, 100, 0));
        box.setMaterial(material);
    }
}
