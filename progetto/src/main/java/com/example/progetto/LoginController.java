package com.example.progetto;

//----CLASSE FANTOCCIO PER 'SIMULARE' UN PROCESSO DI AUTENTICAZIONE----
public class LoginController {

    //----METODO DI VERIFICA DEL LOGIN----
    public void checkLogin(LoginInfoBean curr_log) {
        LoginDAO logdb = new LoginDAO();                  //Istanziamento del DAO per il login
        curr_log.setCheck(logdb.isRegistered(curr_log));  //Setting del check del bean in base alla presenza o meno delle credenziali ricercate nel DAO
    }
}
