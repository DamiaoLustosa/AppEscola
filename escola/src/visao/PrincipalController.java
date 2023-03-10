package visao;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class PrincipalController {
	
		
	@FXML
	Button btAlunos = new Button();
	
	@FXML
	Button btDiretor = new Button();
	
	@FXML
	Button btDisciplina = new Button();
	
	@FXML
	Button btNovoUsuario = new Button();
	
	@FXML
	Button btRelAlunos = new Button();
	
	@FXML
	Button btRelDisciplinas = new Button();
	
	@FXML
	Button btConfigSistem = new Button();
	
	@FXML
	Button btConfigSair = new Button();
	
	
	@FXML
	public void exibeTelaCadAluno() {
		try {
			Stage stage =  new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("CadastroAluno.fxml"));
			//Scene scene = new Scene(root,400,500);
			Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			stage.initModality(Modality.APPLICATION_MODAL); //Janela modal
			
			stage.setOpacity(0.9);
			stage.setTitle("Cadastro de Alunos...");
			stage.getModality();
			//primaryStage.setResizable(true);
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	@FXML
	public void exibeTelaCadDiretor() {
		try {
			Stage stage =  new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("CadastroDiretor.fxml"));
			//Scene scene = new Scene(root,400,500);
			Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			stage.initModality(Modality.APPLICATION_MODAL); //Janela modal
			
			stage.setOpacity(0.9);
			stage.setTitle("Cadastro de Diretor...");
			//primaryStage.setResizable(true);
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	@FXML
	public void exibeTelaCadDisciplina() {
		try {
			Stage stage =  new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("CadastraDisciplina.fxml"));
			//Scene scene = new Scene(root,400,500);
			Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			stage.initModality(Modality.APPLICATION_MODAL); //Janela modal
			
			stage.setOpacity(0.9);
			stage.setTitle("Cadastro de Disciplina...");
			//primaryStage.setResizable(true);
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	@FXML
	public void exibeTelaCadUsuario() {
		try {
			Stage stage =  new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("CadastraDisciplina.fxml"));
			//Scene scene = new Scene(root,400,500);
			Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			stage.initModality(Modality.APPLICATION_MODAL); //Janela modal
			
			stage.setOpacity(0.9);
			stage.setTitle("Cadastro de Novo Usuário...");
			//primaryStage.setResizable(true);
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}




	
	
	
}
