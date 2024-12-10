package com.example.progetto.login;

import com.example.progetto.dao.LoginDAO_JDBC;
import com.example.progetto.exception.CredentialErrorException;

//----CONTROLLER APPLICATIVO PER GESTIRE UN PROCESSO DI AUTENTICAZIONE----
public class LoginController {

    //----METODO DI VERIFICA DEL LOGIN----
    public void checkLogin(LoginInfoBean curr_log) throws CredentialErrorException {
        LoginDAO_JDBC logdb = new LoginDAO_JDBC();        //Istanziamento del DAO per il login
        logdb.isRegistered(curr_log);                     //Ricerca della presenza delle credenziali nel DAO
    }
}
