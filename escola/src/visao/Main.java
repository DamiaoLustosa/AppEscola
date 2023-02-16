package visao;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
			
			//Parent root = FXMLLoader.load(getClass().getResource("CadastroAluno.fxml"));
			Parent root = FXMLLoader.load(getClass().getResource("Principal.fxml"));
			//Scene scene = new Scene(root,400,500);
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//primaryStage.setOpacity(0.50);
			//primaryStage.setTitle("Cadastro de Alunos...");
			primaryStage.setResizable(true);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
