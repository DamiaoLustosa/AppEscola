package visao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.FabricaConexao;

public class CadastraDisciplinaControler{
	

	@FXML
	TextField tfCodigo = new TextField();
	
	
	
	@FXML
	TextField tfDisciplina = new TextField();
	
	@FXML
	TextField tfChSemanal = new TextField();
	
	@FXML
	TextField tfChAnual = new TextField();
	
	@FXML
	DatePicker dpDtCadastro = new DatePicker();
	
	@FXML
	Button btPesq = new Button();
	
	@FXML
	Button btExcluir = new Button();
	
	@FXML
	Button btAlterar = new Button();

	@FXML
	Button btLimpar = new Button();
	
	@FXML
	Button btSalvar = new Button();
	
	@FXML
	TableView<String> jtTabDisc = new TableView<String>();

	public TextField getTfCodigo() {
		return tfCodigo;
	}

	public void setTfCodigo(TextField tfCodigo) {
		this.tfCodigo = tfCodigo;
	}

	public TextField getTfDisciplina() {
		return tfDisciplina;
	}

	public void setTfDisciplina(TextField tfDisciplina) {
		this.tfDisciplina = tfDisciplina;
	}

	
	//Métodos de ações
	public void pesquisar() {
		//System.out.println("Pesquisando...");
		//tfCodigo.getText().toUpperCase();
		//System.out.println(tfDisciplina.getText().toUpperCase());
		//String cod = tfCodigo.getText().toUpperCase();
		//tfCodigo.setText(cod);
		//String disci = tfDisciplina.getText().toUpperCase();
		//tfDisciplina.setText(disci);
		//tfDisciplina.setText("História da Matemática".toUpperCase());
		//TextField textField = new TextField();

		
		
	}
	
	public void excluir() {
		System.out.println("Excluindo...");
	}
	
	public void alterar() {
		//System.out.println("Alterando...");
		
		try {
			Connection con = FabricaConexao.getConexao();	
			System.out.println("Conexão realizada com sucesso");
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		tfCodigo.setText("aLTERANDO COD");
		tfDisciplina.setText("ALTERANDO DISIC");
	}
	
	public void limpar() {
		tfCodigo.setText("");
		tfDisciplina.setText("");
	}
	
	public void salvar() {
		String tituloDisci = tfDisciplina.getText();
		String chHorariaSemanal = tfChSemanal.getText();
		String chHorariaAnual = tfChAnual.getText();
		LocalDate dataInclusao = dpDtCadastro.getValue();	//Nova API de datas
		
		java.sql.Date dataSql = java.sql.Date.valueOf(dataInclusao); // converte de LocalDate para java.sql.Date
		
		
				
		String inserir = "INSERT INTO disciplina (titulo, chSemanal, chAnual, dataCadastro) VALUES (?, ?, ?, ?)";
		
		
		try {
			Connection con = FabricaConexao.getConexao();	
			PreparedStatement stm = con.prepareStatement(inserir);
			stm.setString(1, tituloDisci);
			stm.setString(2, chHorariaSemanal);
			stm.setString(3, chHorariaAnual);
			stm.setDate(4, dataSql );
			
			stm.execute();
			
			//System.out.println("Conexão realizada com sucesso");
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
}
