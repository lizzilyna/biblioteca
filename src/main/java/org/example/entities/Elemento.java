package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
    @Table(name = "elemento")
    public class Elemento {

        @Id @GeneratedValue (strategy = GenerationType.AUTO)
        private int isdn;
        private String titolo;
        private int anno;
        private int pagine;

    public Elemento() {
    }

    public Elemento(String titolo, int anno, int pagine) {
        this.titolo = titolo;
        this.anno=anno;
        this.pagine = pagine;
    }

    public int getIsdn() {
        return isdn;
    }

    public String getTitolo() {
        return titolo;
    }


    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getPagine() {
        return pagine;
    }

    public void setPagine(int pagine) {
        this.pagine = pagine;
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "isdn=" + isdn +
                ", titolo='" + titolo + '\'' +
                ", anno=" + anno +
                ", pagine=" + pagine +
                '}';
    }
}
