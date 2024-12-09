package com.example.progetto;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

//----CLASSE PER LA CONNESSIONE AL DB (IMPLEMENTA IL PATTERN SINGLETON)----
public class Connectivity {
    private static Connectivity istance; //----VARIABILE STATICA CHE CONTIENE L'UNICA ISTANZA DELLA CLASSE
    private final Connection connect; //----CONNESSIONE AL DB

    //----COSTRUTTORE PRIVATO PER IMPEDIRE L'ISTANZA ESTERNA----
    private Connectivity(){
        try{
            InputStream input = new FileInputStream("C://Users//AleB1//IdeaProjects//progetto//src//main//resources//connecting_info.properties");
            Properties properties = new Properties();
            properties.load(input);

            String user = properties.getProperty("db.user");
            String pssw = properties.getProperty("db.password");
            String dburl = properties.getProperty("db.url");
            this.connect = DriverManager.getConnection(dburl, user, pssw);
        } catch (FileNotFoundException e){
            throw new RuntimeException("File inesistente o non accessibile",e);
        } catch (IOException e){
            throw new RuntimeException("Errore durante la lettura del file 'connecting_info.properties'", e);
        } catch (SQLException e){
            throw new RuntimeException("Errore durante la connessione al database",e);
        }
    }

    //----METODO STATICO PER OTTENERE L'ISTANZA UNICA----
    public static synchronized Connectivity getInstance(){
        if(istance == null){
            istance = new Connectivity();
        }
        return istance;
    }

    //----METODO PER CHIUDERE LO STATEMENT----
    public void close(PreparedStatement stm){
        try {
            if (stm != null){
                stm.close();
            }
        } catch (SQLException e){
            throw new RuntimeException("Errore nella chiusura dello statement");
        }
    }

    //----METODO PER OTTENERE LA CONNESSIONE----
    public Connection getConnect(){return connect;}
}
