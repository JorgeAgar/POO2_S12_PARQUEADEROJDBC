module poo2.parqueadero.views  {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.sql;
	requires javafx.base;

    opens poo2.parqueadero.views to javafx.fxml;
    opens poo2.parqueadero.controllers to javafx.fxml;
    exports poo2.parqueadero.views; 
}
