package com.example.progetto;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    //----USERNAME UTENTE----
    @FXML
    private TextField username;
    //----PASSWORD UTENTE----
    @FXML
    private PasswordField pssw;

    @FXML
    public void onLoginButtonClick(MouseEvent event) throws IOException {
        checkLogin();
    }

    private void checkLogin() throws IOException {
        if(username.getText().toString().equals("studente") && pssw.getText().toString().equals("1234")){
            Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
            stage = (Stage)username.getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else{
            // Mostra un popup di errore
            showErrorPopup("Errore di login", "Inserisci 'studente' come username e '1234' come password.");
        };
    }

    private void showErrorPopup(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);

        // Mostra il popup e attendi la chiusura
        alert.showAndWait();
    }
}