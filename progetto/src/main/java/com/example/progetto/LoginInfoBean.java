package com.example.progetto;

//----BEAN CONTENENTE INFORMAZIONI UTILI PER IL LOGIN----
public class LoginInfoBean {
    //----ATTRIBUTI----
    private String username;
    private String password;
    private boolean check;
    //----METODI----
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setCheck(boolean check) {
        this.check = check;
    }
    public boolean getCheck() {
        return check;
    }
    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }
}
