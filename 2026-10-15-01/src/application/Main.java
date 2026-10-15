package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.EventHandler;

public class Main extends Application {
	final Text resultado = new Text();
	@Override
	public void start(Stage primaryStage) {
		try {

			primaryStage.setTitle("Area de um circula - Feita no IFSC Rau!");

			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25, 25, 25, 25));

			Scene scene = new Scene(grid, 400, 400);
			primaryStage.setScene(scene);

			Text scenetitle = new Text("Calcular area e perimetro do circulo");
			scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			grid.add(scenetitle, 0, 0, 2, 1);

			Label lblNum1 = new Label("Raio e perimetro do circulo:");
			grid.add(lblNum1, 0, 1);

			TextField txtNum1 = new TextField();
			grid.add(txtNum1, 1, 1);
			

			Button btnMult = new Button("Calcular area e perimetro");
			HBox caixa3Btn = new HBox(10);
			caixa3Btn.setAlignment(Pos.BOTTOM_RIGHT);
			caixa3Btn.getChildren().add(btnMult);
			grid.add(caixa3Btn, 1, 4);

			
			
			

			final Text resultado = new Text();
			grid.add(resultado, 1, 6);			
		

			


			btnMult.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					Double numero1 = Double.parseDouble(txtNum1.getText());
					Double numero2 = Double.parseDouble(txtNum1.getText());
					
					
					numero2 = 2 * Math.PI * numero1;
					numero1 = (numero1 * numero1) * Math.PI;
					

					resultado.setFill(Color.FIREBRICK);
					resultado.setText("Area do Circulo: " + String.format("%.2f", numero1) + " Perimetro: " + String.format("%.2f", numero2));
				}

			});

			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
			
			resultado.setText("Insira um valor valido!");
			resultado.setText("");
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
