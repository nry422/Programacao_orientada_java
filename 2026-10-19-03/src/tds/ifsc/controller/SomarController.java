package tds.ifsc.controller;

import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class SomarController {

    @FXML
    private Button btnLimpar;

    @FXML
    private Button btnSomar;

    @FXML
    private Label lblNumero1;

    @FXML
    private Label lblNumero2;

    @FXML
    private Label lblResultadoSoma;

    @FXML
    private Label lblResultado;

    @FXML
    private GridPane pnlGrid;

    @FXML
    private GridPane pnlGrid2;

    @FXML
    private AnchorPane pnlPrincipal;

    @FXML
    private TextField txtNumero1;

    @FXML
    private TextField txtNumero2;

    @FXML
    void onClickLimpar(ActionEvent event) {
    	this.txtNumero1.setText(new String());
    	this.txtNumero2.setText(new String());
    	this.lblResultadoSoma.setText(new String("0"));

    }

    @FXML
    void onClickSomar(ActionEvent event) {
    	try {
    		double numero1 = Double.parseDouble(this.txtNumero1.getText());
    		double numero2 = Double.parseDouble(this.txtNumero2.getText());
    		
    		numero1 = numero1 + numero2;
    		
    		lblResultadoSoma.setText(new Double(numero1).toString());
    	}catch(NumberFormatException e) {
    		
    	}

    }
    
    public boolean onCloseQuery() {
    	Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
    	alerta.setTitle("Pergunta");
    	alerta.setHeaderText("Deseja sair do Sistema?");
    	ButtonType botaoNao = ButtonType.NO;
    	ButtonType botaoSim = ButtonType.YES;
    	alerta.getButtonTypes().setAll(botaoSim, botaoNao);
    	Optional<ButtonType> opcaoClicada = alerta.showAndWait();
    	
    	return opcaoClicada.get() == botaoSim ? true : false;
    }

}
