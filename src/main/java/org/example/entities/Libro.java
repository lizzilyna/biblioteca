package org.example.entities;

import java.time.LocalDate;

public class Libro extends Elemento{
    private String autore;
    private String genere;

    public Libro() {
    }



    public Libro(String titolo, LocalDate anno, int pagine, String autore, String genere) {
        super(titolo, anno, pagine);
        this.autore = autore;
        this.genere = genere;
    }


    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
