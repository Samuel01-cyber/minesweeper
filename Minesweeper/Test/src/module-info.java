module Test {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens minesweeper to javafx.graphics, javafx.fxml;
}
