package com.example.progetto;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

//----CLASSE CONTROLLER SECONDO IL PATTERN MVC PER LA GESTIONE DELLE INTERAZIONI DELL'UTENTE CON IL SISTEMA (CASO SPECIFICO: LOGIN)----
public class LoginFX {
    //---ATTRIBUTI PER LO STAGE MANAGEMENT----
    private Stage stage;
    private Scene scene;
    private Parent root;
    //----USERNAME UTENTE----
    @FXML
    private TextField username;
    //----PASSWORD UTENTE----
    @FXML
    private PasswordField pssw;

    //----METODO CHIAMATO AL CLICK DEL TASTO DI LOGIN----
    @FXML
    public void onLoginButtonClick() throws IOException {
        if(LoginController.checkLogin(username.getText(), pssw.getText())) {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("home.fxml")));
            stage = (Stage)username.getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
}