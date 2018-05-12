package sample.chapter.ten;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class PieChartDemo extends Application {
    @Override public void start(Stage primaryStage) throws Exception {
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Luck", 10),
                        new PieChart.Data("Skill", 30),
                        new PieChart.Data("Power of Will", 15),
                        new PieChart.Data("Pleasure", 5),
                        new PieChart.Data("Pain", 40));

        PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Success");
        chart.setLegendSide(Side.LEFT);
        chart.setOnMouseClicked((e)-> {
            pieChartData.add(new PieChart.Data("Stuff",10));
        });
        primaryStage.setScene(new Scene(chart, 530, 400));
        primaryStage.setTitle("Pie Chart Demo");
        primaryStage.show();
    }
}