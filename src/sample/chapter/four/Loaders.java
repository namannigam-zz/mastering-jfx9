package sample.chapter.four;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

public class Loaders {

    public void referenceFXML() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FirstDocument.fxml"));
        loader.load();
        FirstController controller = loader.getController();
        Parent root = loader.getRoot();
    }
}