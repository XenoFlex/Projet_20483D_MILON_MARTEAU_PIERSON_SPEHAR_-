module com.mycompany.d {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.d to javafx.fxml;
    exports Principal;
}
