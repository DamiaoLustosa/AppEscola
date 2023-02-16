package visao;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;


public class MainController {
	
	private int contador = 0;
	
	
	
	@FXML
	Label texto = new Label();
	
	@FXML
	Label titulo = new Label();
	
	
	@FXML
	Button inc = new Button();
	
	
	
	@FXML
	Button dec = new Button();
	
	@FXML
	public void incrementaValor() {
		contador++;
		corContador();
		texto.setText(Integer.toString(contador));
		
		
	}
	
	@FXML
	public void decrementaValor() {
		contador--;
		corContador();
		texto.setText(Integer.toString(contador));
	}
	
	public void corContador() {
		if(contador > 0) {
			texto.getStyleClass().add("contadorPos");
		} else if(contador < 0) {
			texto.getStyleClass().add("contadorNeg");
	
	}

}
}
