package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	
	public static Connection getConexao() {
		
		try {
			String url = "jdbc:mysql://localhost:3306/app_escola";
			String usuario = "root";
			String senha = "159753";

			return DriverManager.getConnection(url,usuario,senha);
			
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

}
