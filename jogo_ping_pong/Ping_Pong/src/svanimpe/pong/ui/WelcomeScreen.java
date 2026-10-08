package svanimpe.pong.ui;

import javafx.application.Platform;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;

import static svanimpe.pong.Constants.*;

public class WelcomeScreen extends Pane {
	private Runnable onStart = () -> {
	}; /* Do nothing for now. */

	private final TextField nameInput = new TextField(); // criar textfield

	public String getPlayerName() {
		return nameInput.getText().trim().isEmpty() ? "Player 1" : nameInput.getText().trim();
	}

	public void setOnStart(Runnable onStart) {
		this.onStart = onStart;
	}

	public WelcomeScreen() {
		// Text header = new Text("pong");
		// header.boundsInLocalProperty().addListener(observable ->
		// {
		// /*
		// * When using CSS, the width and height (with CSS applied) aren't available
		// right away.
		// * Therefore, we listen for changes and update the position once the width and
		// height
		// * are available.
		// */
		// header.setTranslateX((WIDTH - header.getBoundsInLocal().getWidth()) / 2); /*
		// Centered. */
		// header.setTranslateY(TEXT_MARGIN_TOP_BOTTOM);
		// });
		// header.getStyleClass().add("header");

		nameInput.setPromptText("Type your name...");
		nameInput.setMaxWidth(200);
		nameInput.boundsInLocalProperty().addListener(observable -> {
			nameInput.setTranslateX((WIDTH - nameInput.getBoundsInLocal().getWidth()) / 2);
			nameInput.setTranslateY(HEIGHT / 2 - 50); // um pouco acima do centro
		});

		Text info = new Text(
				"use the arrow keys to move\npress p to pause\n\npress enter to start\npress escape to quit");
		info.boundsInLocalProperty().addListener(observable -> {
			info.setTranslateX((WIDTH - info.getBoundsInLocal().getWidth()) / 2); /* Centered. */
			info.setTranslateY(HEIGHT - TEXT_MARGIN_TOP_BOTTOM - info.getBoundsInLocal().getHeight());
		});
		info.getStyleClass().add("info");

		setPrefSize(WIDTH, HEIGHT);

		// O painel adiciona o texto e a caixa de input de uma só vez aqui
		getChildren().addAll(info, nameInput);
		getStyleClass().add("Welscreen");

		// Captura o Enter quando o ecrã tem o foco
		setOnKeyPressed(event -> {
			if (event.getCode() == KeyCode.ENTER) {
				onStart.run();
			} else if (event.getCode() == KeyCode.ESCAPE) {
				Platform.exit();
			}
		});

		// Captura o Enter quando a caixa de texto tem o foco
		nameInput.setOnKeyPressed(event -> {
			if (event.getCode() == KeyCode.ENTER) {
				onStart.run();
			} else if (event.getCode() == KeyCode.ESCAPE) {
				Platform.exit();
			}
		});
	}
}