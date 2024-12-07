package com.example.progetto;

import javafx.scene.control.Alert;

//----CLASSE FANTOCCIO PER 'SIMULARE' UN PROCESSO DI AUTENTICAZIONE----
public class LoginController {
    //----USERNAME UTENTE----
    private static final String username = "studente";
    //----PASSWORD UTENTE----
    private static final String password = "1234";

    //----METODO DI VERIFICA DEL LOGIN----
    public static boolean checkLogin(String user_insert, String pssw_insert) {
        if(!(getUsername().equals(user_insert) && getPassword().equals(pssw_insert))){
            // Mostra un popup di errore
            showErrorPopup("Inserisci '"+getUsername()+"' come username e '"+getPassword()+"' come password.");
            return false;
        }
        return true;
    }

    //----METODO PER POPUP DI ERRORE----
    private static void showErrorPopup(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Errore di login");
        alert.setHeaderText(null);
        alert.setContentText(message);

        // Mostra il popup e attendi la chiusura
        alert.showAndWait();
    }
    private static String getUsername(){
        return username;
    }
    private static String getPassword(){
        return password;
    }
}
