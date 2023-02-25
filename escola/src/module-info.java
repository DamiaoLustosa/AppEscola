module escola {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	requires java.sql;
	
	
	opens visao to javafx.graphics, javafx.fxml;
	opens model;
}
