module javafx3 {
	requires javafx.controls;
	requires javafx.fxml;
	opens controllers to javafx.graphics, javafx.fxml;
	opens application to javafx.graphics, javafx.fxml;
}
