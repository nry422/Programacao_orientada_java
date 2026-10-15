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
	@Override
	public void start(Stage primaryStage) {
		try {

			primaryStage.setTitle("Calculadora de Juros simples - Feita no IFSC Rau!");

			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25, 25, 25, 25));

			Scene scene = new Scene(grid, 400, 400);
			primaryStage.setScene(scene);

			Text scenetitle = new Text("Calcular juros simples");
			scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			grid.add(scenetitle, 0, 0, 2, 1);

			Label lblNum1 = new Label("Valor base");
			grid.add(lblNum1, 0, 1);

			TextField txtNum1 = new TextField();
			grid.add(txtNum1, 1, 1);
			
			Label lblNum2 = new Label("Tempo em meses:");
			grid.add(lblNum2, 0, 2);
			
			TextField txtNum2 = new TextField();
			grid.add(txtNum2, 1, 2);
			
			
			Label lblNum3 = new Label("Taxa:");
			grid.add(lblNum3, 0, 3);
			
			TextField txtNum3 = new TextField();
			grid.add(txtNum3, 1, 3);


			
			Button btnMult = new Button("Calcular juros");
			HBox caixa3Btn = new HBox(10);
			caixa3Btn.setAlignment(Pos.BOTTOM_RIGHT);
			caixa3Btn.getChildren().add(btnMult);
			grid.add(caixa3Btn, 0, 4);

			
			
			

			final Text resultado = new Text();
			grid.add(resultado, 1, 6);			
		

			/*Exercício 2: Calculadora de Juros Simples.
			Enunciado: Crie um aplicativo para calcular o montante final e o
			rendimento gerado a partir de juros simples: J = C * i \* t (onde C é o
			capital, i é a taxa em percentual e t é o tempo em meses)
			*/
			


			btnMult.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					Double numero1 = Double.parseDouble(txtNum1.getText());
					Double numero2 = Double.parseDouble(txtNum2.getText());
					Double numero3 = Double.parseDouble(txtNum3.getText());
					Double numero4 = Double.parseDouble(txtNum3.getText());
					Double numero5 = Double.parseDouble(txtNum3.getText());
					
					numero4 = numero1 * (numero3 / 100) * numero2;

					numero5 = numero1 + numero4;

					resultado.setFill(Color.FIREBRICK);
					resultado.setText("Rendimentos com juros: " + numero4 + " Total: " + numero5);
				}

			});

			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
