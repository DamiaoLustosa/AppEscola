package visao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.FabricaConexao;

public class CadastraDisciplinaControler {

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
	Button btNovo = new Button();

	@FXML
	Button btSalvar = new Button();

	@FXML
	TableView<String> jtTabDisc = new TableView<String>();

	@FXML
	TableColumn<String, String> tcCod = new TableColumn<>();

	@FXML
	TableColumn<String, String> tcTitulo = new TableColumn<>();

	@FXML
	TableColumn<String, String> tcChSemanal = new TableColumn<>();

	@FXML
	TableColumn<String, String> tcChAnual = new TableColumn<>();

	@FXML
	TableColumn<String, String> tcDatCad = new TableColumn<>();

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

	// Métodos de ações
	public void pesquisar() throws SQLException {
		Connection con = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		

		try {
			
			String select = "SELECT * FROM disciplina WHERE id = ? ";
	
			int campoPesquisa = Integer.parseInt(tfCodigo.getText()); 		//Convertendo para inteiro o valor do TextField codigo
			//String tituloPesquisa = tfDisciplina.getText();
			
			con = FabricaConexao.getConexao();	
			stm = con.prepareStatement(select);
			
			stm.setInt(1, campoPesquisa);
			//stm.setString(2, tituloPesquisa);
			
			rs = stm.executeQuery();

			while (rs.next()) {
				//int codNovo = Integer.parseInt(rs.getString("id"));
				int codNovo = rs.getInt("id");					//nomes da colunas entre parenteses
				String nome = rs.getString("titulo");			//nomes da colunas entre parenteses
				String cargSemanal = rs.getString("chSemanal");	//nomes da colunas entre parenteses
				String cargAnual = rs.getString("chAnual");		//nomes da colunas entre parenteses
				Date data = rs.getDate("dataCadastro");			//nomes da colunas entre parenteses
				
				 System.out.println("ID: " + codNovo + ", Título: " + nome +
						 ", CH Semanal: " + cargSemanal 
						 + " CH Anual" + cargAnual + " Data: " + data );
				 
				 //A partir daqui, setar valores para os campos da tela
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			
			// Fechar o ResultSet, Statement e conexão com o banco de dados
			if (rs != null) {
				rs.close();
			}
			if (stm != null) {
				stm.close();
			}
			if (con != null) {
				con.close();
			}
		}
	}

	public void excluir() {
		System.out.println("Excluindo...");
	}

	public void alterar() {
		// System.out.println("Alterando...");

		try {
			Connection con = FabricaConexao.getConexao();
			System.out.println("Conexão realizada com sucesso");
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void insereNovo() {
		// tfCodigo.setText("");
		// tfDisciplina.setText("");
		limpaTela();
	}

	public void salvar() {
		String tituloDisci = tfDisciplina.getText().toUpperCase();
		String chHorariaSemanal = tfChSemanal.getText().toUpperCase();
		String chHorariaAnual = tfChAnual.getText().toUpperCase();
		LocalDate dataInclusao = dpDtCadastro.getValue(); // Nova API de datas

		java.sql.Date dataSql = java.sql.Date.valueOf(dataInclusao); // converte de LocalDate para java.sql.Date

		String inserir = "INSERT INTO disciplina (titulo, chSemanal, chAnual, dataCadastro) VALUES (?, ?, ?, ?)";

		try {
			Connection con = FabricaConexao.getConexao();
			PreparedStatement stm = con.prepareStatement(inserir);
			stm.setString(1, tituloDisci);
			stm.setString(2, chHorariaSemanal);
			stm.setString(3, chHorariaAnual);
			stm.setDate(4, dataSql);

			stm.execute();
			limpaTela();

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void limpaTela() {

		tfCodigo.setText("");
		tfDisciplina.setText("");
		tfChSemanal.setText("");
		tfChAnual.setText("");
		dpDtCadastro.getEditor().setText(""); // Limpa o texto do editor do DatePicker

	}

	
}