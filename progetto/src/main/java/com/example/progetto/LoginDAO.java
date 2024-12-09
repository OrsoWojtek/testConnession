package com.example.progetto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    private final Connectivity connectivity = Connectivity.getInstance();
    private final Connection connection = connectivity.getConnect();
    private PreparedStatement statement = null;

    //----METODO PER VERIFICARE LA PRESENZA DELLE CREDENZIALI INSERITE NEL DB----
    public boolean isRegistered(LoginInfoBean current_cred){
        boolean user_exist;
        try {
            statement = connection.prepareStatement("SELECT username, password FROM utenti WHERE username=? AND password=?");
            statement.setString(1, current_cred.getUsername());
            statement.setString(2, current_cred.getPassword());
            ResultSet result = statement.executeQuery();
            user_exist = result.next();
        }catch (SQLException e){
            throw new RuntimeException("Errore durante la verifica del login",e);
        } finally {
            connectivity.close(statement);
        }
        return user_exist;
    }
}
