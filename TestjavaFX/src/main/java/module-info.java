module com.mycompany.testjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.testjavafx to javafx.fxml;
    exports com.mycompany.testjavafx;
}
