package com.example.progetto;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

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
    public void onLoginButtonClick(MouseEvent event) throws IOException {
        if(LoginController.checkLogin(username.getText(), pssw.getText())) {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("home.fxml")));
            stage = (Stage)username.getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
}