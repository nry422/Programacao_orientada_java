package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ControleAplicacao {

	@FXML
	private Button btnAcao;

	@FXML
	private HBox hbTopo;

	@FXML
	private Label lblMensagem;

	@FXML
	private VBox raiz;

	@FXML
	private TextField txtNome;

	@FXML
	void atualizaMensagem(ActionEvent event) {
		this.lblMensagem.setText("Olá, " + this.txtNome.getText() + ", bem-vindo!");

	}

}
