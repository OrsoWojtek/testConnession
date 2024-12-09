module com.example.progetto {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.progetto to javafx.fxml;
    exports com.example.progetto;
    exports com.example.progetto.dao;
    opens com.example.progetto.dao to javafx.fxml;
    exports com.example.progetto.login;
    opens com.example.progetto.login to javafx.fxml;
}