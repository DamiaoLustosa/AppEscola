package visao;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CadastroDiretorControler {
	
	@FXML
	TextField tfCodigo = new TextField();
	
	@FXML
	TextField tfNomeDiretor = new TextField();
	
	@FXML
	TextField tfCpf = new TextField();
	
	@FXML
	Button btPesqDiretor = new Button();
	
	@FXML
	DatePicker dpDatCad = new DatePicker();
	
	@FXML
	RadioButton rbAtivo = new RadioButton();
	
	@FXML
	RadioButton rbInativo = new RadioButton();
	
	@FXML
	TableView<String> tvTabDiretor = new TableView<String>();
	
	@FXML
	TableColumn<String, String> tcCodigo = new TableColumn<>();
	
	@FXML
	TableColumn<String, String> tcNome = new TableColumn<>();
	
	@FXML
	TableColumn<String, String> tcCpf = new TableColumn<>();
	
	@FXML
	TableColumn<String, String> tcDtCad = new TableColumn<>();
	
	@FXML
	Button btExcluirDiretor = new Button();
	
	@FXML
	Button btAlterarDiretor = new Button();
	
	@FXML
	Button btNovoDiretor = new Button();
	
	@FXML
	Button btSalvarDiretor = new Button();
	
	
	
	
	
	
	
	
	

}
