package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PieChartExperiments extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("OOP Lab Marks Distribution JavaFX App Lab 12");

        PieChart pieChart = new PieChart();

        PieChart.Data slice1 = new PieChart.Data("Assignments", 175);
        PieChart.Data slice2 = new PieChart.Data("Task"  , 100);
        PieChart.Data slice3 = new PieChart.Data("Mids" , 25);
        PieChart.Data slice4 = new PieChart.Data("Finals" , 40);

        pieChart.getData().add(slice1);
        pieChart.getData().add(slice2);
        pieChart.getData().add(slice3);
        pieChart.getData().add(slice4);

        VBox vbox = new VBox(pieChart);

        Scene scene = new Scene(vbox, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.setHeight(300);
        primaryStage.setWidth(1200);

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
