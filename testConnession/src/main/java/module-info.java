module com.example.progetto {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.progetto to javafx.fxml;
    exports com.example.progetto;
    exports com.example.progetto.exception;
    exports com.example.progetto.view.fx;
    opens com.example.progetto.view.fx to javafx.fxml;
    exports com.example.progetto.controller;
    opens com.example.progetto.controller to javafx.fxml;
    exports com.example.progetto.bean;
    opens com.example.progetto.bean to javafx.fxml;
    exports com.example.progetto.dao.jdbc;
    opens com.example.progetto.dao.jdbc to javafx.fxml;
}