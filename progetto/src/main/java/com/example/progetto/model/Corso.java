package com.example.progetto.model;

public class Corso {
    private String id;
    private String nome;
    private String descrizione;
    /*
    private Tutor tutor; // Relazione con Tutor
    private List<Studente> studenti; // Relazione con Studenti
    private List<Quiz> quiz; // Relazione con Quiz
    private List<Materiale> materialeDidattico; // Relazione con Materiale Didattico
    */
    public void setId(String id) {this.id = id;}
    public void setNome(String nome) {this.nome = nome;}
    public void setDescrizione(String descrizione) {this.descrizione = descrizione;}
    public String getId() {return id;}
    public String getNome() {return nome;}
    public String getDescrizione() {return descrizione;}
}
