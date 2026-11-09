package com.peregrinoti.controller;

import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import com.peregrinoti.dao.AmigoDAO;
import com.peregrinoti.entity.Amigo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;
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
	private TableColumn<Amigo, Long> tbcCodigo;

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
	private ObservableList<Amigo> observableListaAmigos = FXCollections.observableArrayList();
	private AmigoDAO amigoDAO;

	public static final String AMIGO_EDITAR = " - Editar";
	public static final String AMIGO_INCLUIR = " - Incluir";

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.setAmigoDAO(new AmigoDAO());
		this.carregarTableViewAmigos();
		this.selecionarItemTableViewAmigos(null);

		this.tbvAmigos.getSelectionModel().selectedItemProperty()
				.addListener((observable, oldValue, newValue) -> selecionarItemTableViewAmigos(newValue));
	}

	public void carregarTableViewAmigos() {
		this.tbcCodigo.setCellValueFactory(new PropertyValueFactory<>("id"));
		this.tbcNome.setCellValueFactory(new PropertyValueFactory<>("nome"));

		this.setListaAmigos(this.getAmigoDAO().getAll());
		this.setObservableListaAmigos(FXCollections.observableArrayList(this.getListaAmigos()));
		this.tbvAmigos.setItems(this.getObservableListaAmigos());
	}

	public void selecionarItemTableViewAmigos(Amigo amigo) {
		if (amigo != null) {
			this.lblNomeValor.setText(amigo.getNome());
			if (this.lblTelefoneValor != null && amigo.getTelefone() != null) {
				this.lblTelefoneValor.setText(amigo.getTelefone());
			}
		} else {
			this.lblNomeValor.setText("");
			if (this.lblTelefoneValor != null) {
				this.lblTelefoneValor.setText("");
			}
		}
	}

	public boolean onShowTelaAmigoEditar(Amigo amigo, String operacao) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/peregrinoti/view/AmigoEdit.fxml"));
			Parent amigoEditXML = loader.load();

			Stage janelaAmigoEditar = new Stage();
			janelaAmigoEditar.setTitle("Cadastro de Amigo" + operacao);
			janelaAmigoEditar.initModality(Modality.APPLICATION_MODAL);
			janelaAmigoEditar.resizableProperty().setValue(Boolean.FALSE);

			Scene amigoEditLayout = new Scene(amigoEditXML);
			janelaAmigoEditar.setScene(amigoEditLayout);

			AmigoEditController amigoEditController = loader.getController();
			amigoEditController.setJanelaAmigoEdit(janelaAmigoEditar);
			amigoEditController.populaTela(amigo);

			janelaAmigoEditar.showAndWait();

			return amigoEditController.isOkClick();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@FXML
	void onClickBtnEditar(ActionEvent event) {
		Amigo amigo = this.tbvAmigos.getSelectionModel().getSelectedItem();

		if (amigo != null) {
			boolean btnConfirmarClic = this.onShowTelaAmigoEditar(amigo, AmigoListaController.AMIGO_EDITAR);

			if (btnConfirmarClic) {
				this.getAmigoDAO().update(amigo, null);
				this.carregarTableViewAmigos();
			}
		} else {
			Alert alerta = new Alert(Alert.AlertType.ERROR);
			alerta.setContentText("Por favor, escolha um amigo na tabela!");
			alerta.show();
		}
	}

	@FXML
	void onClickBtnExcluir(ActionEvent event) {
		Amigo amigo = this.tbvAmigos.getSelectionModel().getSelectedItem();

		if (amigo != null) {
			Alert alerta = new Alert(AlertType.CONFIRMATION);
			alerta.setTitle("Pergunta");
			alerta.setHeaderText("Confirma a exclusão do amigo?\n" + amigo.getNome());

			ButtonType botaoNao = ButtonType.NO;
			ButtonType botaoSim = ButtonType.YES;
			alerta.getButtonTypes().setAll(botaoSim, botaoNao);
			Optional<ButtonType> resultado = alerta.showAndWait();

			if (resultado.isPresent() && resultado.get() == botaoSim) {
				this.getAmigoDAO().delete(amigo);
				this.carregarTableViewAmigos();
			}
		} else {
			Alert alerta = new Alert(Alert.AlertType.ERROR);
			alerta.setContentText("Por favor, escolha um amigo na tabela!");
			alerta.show();
		}
	}

	@FXML
	void onClickBtnIncluir(ActionEvent event) {
		Amigo amigo = new Amigo();

		boolean btnConfirmarClic = this.onShowTelaAmigoEditar(amigo, AmigoListaController.AMIGO_INCLUIR);

		if (btnConfirmarClic) {
			this.getAmigoDAO().save(amigo);
			this.carregarTableViewAmigos();
		}
	}

	public boolean onCloseQuery() {
		Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
		alerta.setTitle("Pergunta");
		alerta.setHeaderText("Deseja sair do cadastro de amigos?");
		ButtonType buttonTypeNO = ButtonType.NO;
		ButtonType buttonTypeYES = ButtonType.YES;
		alerta.getButtonTypes().setAll(buttonTypeYES, buttonTypeNO);
		Optional<ButtonType> result = alerta.showAndWait();
		return result.isPresent() && result.get() == buttonTypeYES;
	}

	public List<Amigo> getListaAmigos() {
		return listaAmigos;
	}

	public void setListaAmigos(List<Amigo> listaAmigos) {
		this.listaAmigos = listaAmigos;
	}

	public ObservableList<Amigo> getObservableListaAmigos() {
		return observableListaAmigos;
	}

	public void setObservableListaAmigos(ObservableList<Amigo> observableListaAmigos) {
		this.observableListaAmigos = observableListaAmigos;
	}

	public AmigoDAO getAmigoDAO() {
		return amigoDAO;
	}

	public void setAmigoDAO(AmigoDAO amigoDAO) {
		this.amigoDAO = amigoDAO;
	}
}