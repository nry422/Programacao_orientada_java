package ifsc.tds.main;

import ifsc.tds.controller.calculadoraController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application{

	public static void main(String[] args) {
		launch(args);
		

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			primaryStage.setTitle("Calculadora IFSC");
			primaryStage.resizableProperty().setValue(Boolean.FALSE);
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/ifsc/tds/view/calculadoraview.fxml"));
			Parent arquivoXML = loader.load();
			
			Scene calculadoraCena = new Scene(arquivoXML);
			primaryStage.setScene(calculadoraCena);
			
			calculadoraController calculadoraController = loader.getController();
			
			primaryStage.setOnCloseRequest(e->{
				if(calculadoraController.onCloseQuery()) {
					System.exit(0);
				}else {
					e.consume();
				}
			});
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
