package org.example;

import org.example.entities.Libro;
import org.example.entities.Periodicita;
import org.example.entities.Rivista;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Libro l = new Libro();
        System.out.println(l);

        Rivista r= new Rivista("Gioia", LocalDate.of(2004, 2, 2), 220, Periodicita.MENSILE);


        //System.out.println("Hello world!");
    }
}