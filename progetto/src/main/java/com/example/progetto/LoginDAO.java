package com.example.progetto;

public class LoginDAO {
    public boolean isRegistered(String user,String pssw){
        return (user.equals("studente") && pssw.equals("1234"));
    }
}
