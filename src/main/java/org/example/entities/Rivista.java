package org.example.entities;

import java.time.LocalDate;

public class Rivista extends Elemento{
    private Periodicita periodicita;

    public Rivista() {

    }

   

    public Rivista(String titolo, int anno, int pagine, Periodicita periodicita) {
        super(titolo, anno, pagine);
        this.periodicita = periodicita;
    }
}

