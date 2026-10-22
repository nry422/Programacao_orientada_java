package ifsc.tds.controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class calculadoraController implements Initializable{

    @FXML
    private Button btnDividir;

    @FXML
    private Button btnMultiplicar;

    @FXML
    private Button btnSomar;

    @FXML
    private Button btnSubtrair;

    @FXML
    private Button lblLimpar;

    @FXML
    private Label lblNumero1;

    @FXML
    private Label lblNumero2;

    @FXML
    private Label lblResultado;

    @FXML
    private Label lblResultadoCalc;

    @FXML
    private GridPane pnlGrid;

    @FXML
    private AnchorPane pnlPrincipal;

    @FXML
    private TextField txtNumero1;

    @FXML
    private TextField txtNumero2;

    @FXML
    void OnClickDividir(ActionEvent event) {
    	try {
        	double numero1 = Double.parseDouble(this.txtNumero1.getText());
        	double numero2 = Double.parseDouble(this.txtNumero2.getText());
        	
        	numero1 = numero1 / numero2;
        	
        	lblResultadoCalc.setText(new Double(numero1).toString());
        	}catch(NumberFormatException e) {
        		
        	}

    }

    @FXML
    void OnClickLimpar(ActionEvent event) {
    	this.txtNumero1.setText(new String());
    	this.txtNumero2.setText(new String());
    	this.lblResultadoCalc.setText(new String("0"));

    }
    
    
   

    @FXML
    void OnClickMultiplicar(ActionEvent event) {
    	try {
    	double numero1 = Double.parseDouble(this.txtNumero1.getText());
    	double numero2 = Double.parseDouble(this.txtNumero2.getText());
    	
    	numero1 = numero1 * numero2;
    	
    	lblResultadoCalc.setText(new Double(numero1).toString());
    	}catch(NumberFormatException e) {
    		
    	}

    }

    @FXML
    void OnClickSomar(ActionEvent event) {
    	try {
        	double numero1 = Double.parseDouble(this.txtNumero1.getText());
        	double numero2 = Double.parseDouble(this.txtNumero2.getText());
        	
        	numero1 = numero1 + numero2;
        	
        	lblResultadoCalc.setText(new Double(numero1).toString());
        	}catch(NumberFormatException e) {
        		
        	}

    }

    @FXML
    void OnClickSubtrair(ActionEvent event) {
    	try {
        	double numero1 = Double.parseDouble(this.txtNumero1.getText());
        	double numero2 = Double.parseDouble(this.txtNumero2.getText());
        	
        	numero1 = numero1 - numero2;
        	
        	lblResultadoCalc.setText(new Double(numero1).toString());
        	}catch(NumberFormatException e) {
        		
        	}

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	
    }

	public boolean onCloseQuery() {
		Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
		alerta.setTitle("Perguntar");
		alerta.setHeaderText("Deseja sair do sistema?");
		ButtonType botaoNao = ButtonType.NO;
		ButtonType botaoSim = ButtonType.YES;
		alerta.getButtonTypes().setAll(botaoSim, botaoNao);
		Optional<ButtonType> opcaoClicada = alerta.showAndWait();
		
		
		return opcaoClicada.get() == botaoSim ? true : false;
	}
    
    

}
