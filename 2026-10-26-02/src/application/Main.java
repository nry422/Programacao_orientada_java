package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


public class Main extends Application {
	
	final static String AUSTRIA = "Áustria";
	final static String BRASIL = "Brasil";
	final static String CHINA = "China";
	
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Exemplo gráfico de abarras");
			final CategoryAxis xAxis = new CategoryAxis();
			final NumberAxis yAxis = new NumberAxis();
			final BarChart<String, Number> grafico = new BarChart<String, Number>(xAxis, yAxis);
			grafico.setTitle("Resumo por País");
			xAxis.setLabel("País");
			yAxis.setLabel("Valor em Vendas");
			XYChart.Series series1 = new XYChart.Series<>();
			series1.setName("2003");
			series1.getData().add(new XYChart.Data(Main.AUSTRIA, 25601.31));
			series1.getData().add(new XYChart.Data(Main.BRASIL, 20148.82));
			series1.getData().add(new XYChart.Data(Main.CHINA, 50148.82));
			
			XYChart.Series series2 = new XYChart.Series<>();
			series2.setName("2004");
			series2.getData().add(new XYChart.Data(Main.AUSTRIA, 57401.85));
			series2.getData().add(new XYChart.Data(Main.BRASIL, 41941.12));
			series2.getData().add(new XYChart.Data(Main.CHINA, 81941.12));
			
			XYChart.Series series3 = new XYChart.Series<>();
			series3.setName("2005");
			series3.getData().add(new XYChart.Data(Main.AUSTRIA, 47401.85));
			series3.getData().add(new XYChart.Data(Main.BRASIL, 31941.12));
			series3.getData().add(new XYChart.Data(Main.CHINA, 91941.12));
			
			Scene scene = new Scene(grafico, 800,600);
			grafico.getData().addAll(series1, series2, series3);
			primaryStage.setScene(scene);
			
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
