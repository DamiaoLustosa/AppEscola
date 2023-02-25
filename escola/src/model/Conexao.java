package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public void abreConexao() throws SQLException{
		String url = "jdbc:mysql://localhost:3306?useSSL=false";
		String usuario = "root";
		String senha = "159753";

		Connection conec = DriverManager.getConnection(url,usuario,senha);
		
		System.out.println("conexão realizada com Sucesso...");
		
		conec.close();
	}
	
	
}
