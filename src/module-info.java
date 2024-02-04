module CV {
	requires javafx.controls;
	requires javafx.fxml;

	requires java.sql;
	requires javafx.graphics;
	requires java.xml;
	requires javafx.base;
	opens application to javafx.graphics, javafx.fxml;
}
