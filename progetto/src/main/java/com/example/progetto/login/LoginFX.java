package com.example.progetto.login;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

//----CLASSE CONTROLLER SECONDO IL PATTERN MVC PER LA GESTIONE DELLE INTERAZIONI DELL'UTENTE CON IL SISTEMA (CASO SPECIFICO: LOGIN)----
public class LoginFX {
    //----USERNAME UTENTE----
    @FXML
    private TextField username;
    //----PASSWORD UTENTE----
    @FXML
    private PasswordField pssw;

    //----METODO CHIAMATO AL CLICK DEL TASTO DI LOGIN----
    @FXML
    public void onLoginButtonClick() throws IOException {
        LoginInfoBean bean = new LoginInfoBean();               //Istanziamento bean per il login
        LoginController controller = new LoginController();     //Istanziamento controller
        bean.setUsername(username.getText());                   //Setting del bean
        bean.setPassword(pssw.getText());
        controller.checkLogin(bean);                            //Verifica che siano state inserite le credenziali corrette

        if(bean.getCheck()){                                                                                           //Se le credenziali erano corrette...
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/home.fxml")));          //...Mostra la pagina di home
            Stage stage = (Stage) username.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else {                                                                                                         //Altrimenti...
            showErrorPopup();                                                                                          //...Mostra un popup di errore
        }
    }
    //----METODO PER POPUP DI ERRORE----
    private void showErrorPopup() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Errore di login");
        alert.setHeaderText(null);
        alert.setContentText("Username e/o password inseriti non corretti. Prego riprovare.");

        //Mostra il popup e attendi la chiusura
        alert.showAndWait();
    }
}