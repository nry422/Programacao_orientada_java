package com.peregrinoti.controller;

import java.util.List;
import java.util.Optional;

import com.peregrinoti.dao.AmigoDAO;
import com.peregrinoti.entity.Amigo;
import com.peregrinoti.entity.TipoColecao;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AmigoListaController implements Initializable {

    @FXML
    private ButtonBar barBotoes;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnExcluir;

    @FXML
    private Button btnInclur;

    @FXML
    private Label lblDetalhes;

    @FXML
    private Label lblNome;

    @FXML
    private Label lblNomeValor;

    @FXML
    private Label lblTelefone;

    @FXML
    private Label lblTelefoneValor;

    @FXML
    private GridPane pnlDetalhes;

    @FXML
    private AnchorPane pnlDireita;

    @FXML
    private SplitPane pnlDivisao;

    @FXML
    private AnchorPane pnlEsquerda;

    @FXML
    private AnchorPane pnlPrincipal;

    @FXML
    private TableColumn<TipoColecao, Long> tbcCodigo;

    @FXML
    private TableColumn<Amigo, String> tbcNome;

    @FXML
    private TableView<Amigo> tbvAmigos;

    @FXML
    private Tooltip tlpEditar;

    @FXML
    private Tooltip tlpExcluir;

    @FXML
    private Tooltip tlpIncluir;
    
    private List<Amigo> listaAmigos;
	private ObservableList<Amigo> observableListaAmigo = FXCollections.observableArrayList();
	private AmigoDAO amigoDAO;

	public static final String AMIGO_EDITAR = " - Editar";
	public static final String AMIGO_INCLUIR = " - Incluir";
	
	public boolean onShowAmigoEditar(Amigo amigo, String operacao) {
		try {
			// carregando o loader
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/peregrinoti/view/AmigoEdit.fxml"));
			Parent amigoEditXML = loader.load();

			// criando uma janela nova
			Stage janelaTipoColecaoEditar = new Stage();
			janelaTipoColecaoEditar.setTitle("Cadastro de tipo de cole��o" + operacao);
			janelaTipoColecaoEditar.initModality(Modality.APPLICATION_MODAL);
			janelaTipoColecaoEditar.resizableProperty().setValue(Boolean.FALSE);

			Scene tipoColecaoEditLayout = new Scene(tipoColecaoEditXML);
			janelaTipoColecaoEditar.setScene(tipoColecaoEditLayout);

			// carregando o controller e a scene
			TipoColecaoEditController tipoColecaoEditController = loader.getController();
			tipoColecaoEditController.setJanelaTipoColecaoEdit(janelaTipoColecaoEditar);
			tipoColecaoEditController.populaTela(tipoColecao);

			// mostrando a tela
			janelaTipoColecaoEditar.showAndWait();

			return tipoColecaoEditController.isOkClick();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
	
	

  @FXML
    void onClickBtnEditar(ActionEvent event) {
		Amigo amigo = this.tbvAmigos.getSelectionModel().getSelectedItem();

		if ( amigo != null) {
			boolean btnConfirmarClic = this.onShowAmigoEditar(amigo,
					AmigoListaController.AMIGO_EDITAR);

			if (btnConfirmarClic) {
				this.amigoDAO().update(amigo, null);
				this.carregarTableViewAmigo();
			}
		} else {
			Alert alerta = new Alert(Alert.AlertType.ERROR);
			alerta.setContentText("Por favor, escolha um tipo de cole��o na tabela!");
			alerta.show();
		}

	}
	
	
	
	 

    @FXML
    void onClickBtnExcluir(ActionEvent event) {

    }

    @FXML
	void onClickBtnIncluir(ActionEvent event) {
		Amigo amigo = new Amigo();

		boolean btnConfirmarClic = this.onShowTelaAmigoEditar(amigo,
				AmigoListaController.AMIGO_INCLUIR);

		if (btnConfirmarClic) {
			this.getAmigoDAO().save(amigo);
			this.carregarTableViewAMIGO();
		}
	}
    
    public boolean onCloseQuery() {
		Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
		alerta.setTitle("Pergunta");
		alerta.setHeaderText("Deseja sair do cadastro de tipo de cole��o?");
		ButtonType buttonTypeNO = ButtonType.NO;
		ButtonType buttonTypeYES = ButtonType.YES;
		alerta.getButtonTypes().setAll(buttonTypeYES, buttonTypeNO);
		Optional<ButtonType> result = alerta.showAndWait();
		return result.get() == buttonTypeYES ? true : false;
	}

}
