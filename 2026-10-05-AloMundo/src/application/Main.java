package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
//import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("JavaFX em ação - Feito no IFSC rau!");
			
			Label label = new Label("Alô Mundo JavaFX!");
			Label nome = new Label("Henry Müller");
			StackPane root = new StackPane();
			root.getChildren().addAll(label, nome);
			
			StackPane.setAlignment(label, Pos.CENTER);
			StackPane.setAlignment(nome, Pos.BOTTOM_CENTER);
			
			//VBox root = new VBox(10);
			//root.getChildren().addAll(label, nome);
			
			
			
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
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
