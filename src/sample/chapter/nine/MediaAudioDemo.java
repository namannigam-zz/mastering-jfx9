package sample.chapter.nine;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioSpectrumListener;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class MediaAudioDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        final int MID = 50;

        Pane root = new Pane();

        // preparing a line for each frequency
        Line[] lines = new Line[128];
        for (int i = 0;
             i < 128;
             i++) {
            Line line = new Line(5 + i * 3, MID, 5 + i * 3, MID);
            lines[i] = line;
            root.getChildren().add(line);
        }

        // please update next line to the your mp3 file location
        Media media = new Media("http://www.sample-videos.com/audio/mp3/wave.mp3");
        MediaPlayer mp = new MediaPlayer(media);
        mp.setAudioSpectrumListener(new AudioSpectrumListener() {
            @Override
            public void spectrumDataUpdate(double timestamp, double duration, float[] magnitudes, float[] phases) {
                for (int i = 0;
                     i < Math.max(128, magnitudes.length);
                     i++) {
                    // updating each line according to the corresponding magnitude value
                    lines[i].setEndY(MID - magnitudes[i] + mp.getAudioSpectrumThreshold());
                }
            }
        });

        primaryStage.setTitle("AudioSpectrumDemo");
        primaryStage.setScene(new Scene(root, 370, 100));
        primaryStage.show();
        mp.play();
    }
}