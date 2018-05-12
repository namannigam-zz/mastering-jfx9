package sample.chapter.ten;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class TableViewDemo extends Application {
    @Override public void start(Stage primaryStage) throws Exception {
        TableColumn<Chapter, String> columnTitle = new TableColumn<>("Title");
        columnTitle.setCellValueFactory(
                new PropertyValueFactory<>("title"));

        TableColumn<Chapter, String> columnNumber = new TableColumn<>("#");
        columnNumber.setCellValueFactory(
                new PropertyValueFactory<>("number"));

        ObservableList<Chapter> listChapters = FXCollections.observableArrayList(
                new Chapter(1,"!"), new Chapter(2, "@"));

        TableView<Chapter> table = new TableView<>();
        table.setItems(listChapters);
        table.getColumns().addAll(columnNumber, columnTitle);

        table.setOnMouseClicked((e)-> {
            listChapters.add(new Chapter(14, "Future chapter"));
        });
    }
}