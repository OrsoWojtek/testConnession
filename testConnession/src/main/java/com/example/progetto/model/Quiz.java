package com.example.progetto.model;

public class Quiz {
    private final String titolo;
    private final String argomenti;
    private final int durata; //in minuti
    /*
    private Corso corso;
    private List<Domanda> domande;
    private Tutor tutor;
     */
    private final int numeroDomande;
    private final int punteggioMassimo;

    public Quiz(String titolo, String argomenti, int durata, int numeroDomande, int punteggioMassimo){
        this.titolo = titolo;
        this.durata = durata;
        this.numeroDomande = numeroDomande;
        this.punteggioMassimo = punteggioMassimo;
        this.argomenti = argomenti;
    }

    public int getDurata() {return durata;}
    public String getTitolo() {return titolo;}
    public int getNumeroDomande() {return numeroDomande;}
    public int getPunteggioMassimo() {return punteggioMassimo;}
    public String getArgomenti() {return argomenti;}
}
