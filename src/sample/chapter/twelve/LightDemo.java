package sample.chapter.twelve;

import javafx.application.Application;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.shape.Cylinder;
import javafx.stage.Stage;

public class LightDemo extends Application {
    @Override public void start(Stage primaryStage) throws Exception {
        // creating a 3D cylinder
        Cylinder cylinder = new Cylinder(40, 120);
        cylinder.setRotationAxis(new Point3D(50, 50, 0));
        cylinder.setRotate(45);
        cylinder.setTranslateX(150);
        cylinder.setTranslateY(150);
        cylinder.setTranslateZ(600);

        PointLight light = new PointLight();
        light.setTranslateX(350);
        light.setTranslateY(100);
        light.setTranslateZ(300);

        Group root = new Group(cylinder, light);
        Scene scene = new Scene(root, 300, 300, true);

        scene.setOnMouseMoved((event) -> {
            light.setTranslateX(event.getSceneX() - 50);
            light.setTranslateY(event.getSceneY() - 200);
            light.setTranslateZ(300 - event.getSceneX() / 2);
        });

        primaryStage.setScene(scene);
        primaryStage.setTitle("3D shapes light demo");
        primaryStage.show();

    }
}