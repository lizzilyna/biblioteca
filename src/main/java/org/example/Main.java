package org.example;

import org.example.dao.ElementoDao;
import org.example.entities.Libro;
import org.example.entities.Periodicita;
import org.example.entities.Rivista;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ElementoDao elementoDao = new ElementoDao();

        Libro l = new Libro("Le correzioni", 1990, 460, "Jonathan Franzen", "Narrativa");
        System.out.println(l);
        elementoDao.inserisciElemento(l);

        Rivista r = new Rivista("Gioia", 2000, 220, Periodicita.MENSILE);
        System.out.println(r);
        elementoDao.inserisciElemento(r);

        elementoDao.close();
    }
}