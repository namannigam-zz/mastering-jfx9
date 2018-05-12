package sample.chapter.ten;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;

public class MultiSelectDemo extends Application {
    @Override public void start(Stage stage) throws Exception {
        ObservableList<String> items = FXCollections.observableArrayList(
                "Apple", "Banana");

        ListView<String> list = new ListView<>(items);
        list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
// getting selected items for multi-select
        ObservableList<String> selected = list.getSelectionModel().getSelectedItems();

// tracking selection
        list.getSelectionModel().selectedIndexProperty().addListener((obs) -> {
            System.out.println("Selected: " + list.getSelectionModel().getSelectedItems());
            System.out.println("Focused: " + list.getFocusModel().getFocusedItem());
        });

        stage.setTitle("TextFieldListCell Demo");
        stage.setScene(new Scene(new StackPane(list), 200, 200));
        stage.show();
    }
}