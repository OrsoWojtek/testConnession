module com.example.testconnession {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testconnession to javafx.fxml;
    exports com.example.testconnession;
}