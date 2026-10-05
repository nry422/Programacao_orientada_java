package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
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

			primaryStage.setTitle("Calculadora - Feita no IFSC Rau!");

			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25, 25, 25, 25));

			Scene scene = new Scene(grid, 400, 400);
			primaryStage.setScene(scene);

			Text scenetitle = new Text("Calculadora");
			scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			grid.add(scenetitle, 0, 0, 2, 1);

			Label lblNum1 = new Label("Número 1:");
			grid.add(lblNum1, 0, 1);

			TextField txtNum1 = new TextField();
			grid.add(txtNum1, 1, 1);

			Label lblNum2 = new Label("Número 2:");
			grid.add(lblNum2, 0, 2);

			TextField txtNum2 = new TextField();
			grid.add(txtNum2, 1, 2);

			Button btnMult = new Button("Multiplicar");
			HBox caixa3Btn = new HBox(10);
			caixa3Btn.setAlignment(Pos.BOTTOM_RIGHT);
			caixa3Btn.getChildren().add(btnMult);
			grid.add(caixa3Btn, 0, 4);

			Button btnSomar = new Button("Somar");
			HBox caixaBtn = new HBox(10);
			caixaBtn.setAlignment(Pos.BOTTOM_RIGHT);
			caixaBtn.getChildren().add(btnSomar);
			grid.add(caixaBtn, 2, 4);

			Button btnSubtrair = new Button("Subtrair");
			Button btnDividir = new Button("Dividir");
			
			HBox caixa2Btn = new HBox(10);
			caixa2Btn.setAlignment(Pos.BOTTOM_CENTER);
			caixa2Btn.getChildren().add(btnSubtrair);
			caixa2Btn.getChildren().add(btnDividir);
			grid.add(caixa2Btn, 1, 4);
			
			Button btnLimpar = new Button("Limpar");
			HBox caixaLimpar = new HBox(10);
			caixaLimpar.setAlignment(Pos.BOTTOM_CENTER);
			caixaLimpar.getChildren().add(btnLimpar);
			grid.add(btnLimpar, 1, 5);
			
			

			final Text resultado = new Text();
			grid.add(resultado, 1, 6);
			
			btnLimpar.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent e) {
					txtNum1.clear();
					txtNum2.clear();
					resultado.setText("");
					txtNum1.requestFocus();
				}
			});

			btnSomar.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					Double numero1 = Double.parseDouble(txtNum1.getText());
					Double numero2 = Double.parseDouble(txtNum2.getText());

					numero1 = numero1 + numero2;

					resultado.setFill(Color.FIREBRICK);
					resultado.setText("Total: " + numero1);
				}

			});

			btnSubtrair.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					Double numero1 = Double.parseDouble(txtNum1.getText());
					Double numero2 = Double.parseDouble(txtNum2.getText());

					numero1 = numero1 - numero2;

					resultado.setFill(Color.FIREBRICK);
					resultado.setText("Total: " + numero1);
				}

			});

			btnMult.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					Double numero1 = Double.parseDouble(txtNum1.getText());
					Double numero2 = Double.parseDouble(txtNum2.getText());

					numero1 = numero1 * numero2;

					resultado.setFill(Color.FIREBRICK);
					resultado.setText("Total: " + numero1);
				}

			});
			
			btnDividir.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					Double numero1 = Double.parseDouble(txtNum1.getText());
					Double numero2 = Double.parseDouble(txtNum2.getText());

					
					
					if (numero2 == 0) {
						
						Alert alerta = new Alert(AlertType.WARNING);
						alerta.setTitle("AVISO IMPORTANTE");
						alerta.setHeaderText("LEIA!!");
						alerta.setContentText("Não divida por 0!");
						alerta.showAndWait();
						txtNum2.requestFocus();
						
						resultado.setFill(Color.FIREBRICK);
						resultado.setText("ERRO NÃO DIVIDIR POR 0!!!");
						
						
					} else { numero1 = numero1 / numero2;
					resultado.setFill(Color.FIREBRICK);
					resultado.setText("Total: " + numero1);
					
					}

					
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
