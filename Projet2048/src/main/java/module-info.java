module com.mycompany.projet2048 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.projet2048 to javafx.fxml;
    exports com.mycompany.projet2048;
}
