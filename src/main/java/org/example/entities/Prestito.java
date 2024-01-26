package org.example.entities;
import jakarta.persistence.*;
import java.time.LocalDate;



@Entity
@Table(name = "prestito")

public class Prestito {
    @ManyToOne
    @JoinColumn(name = "utente_fk")
    private Utente utente;
    @Id
    private int id;
    @OneToOne
    @JoinColumn(name = "catalogo_fk")
    private Catalogo catalogo;


    @Column(name = "attivazione_prestito")
    private LocalDate attivazionePrestito;

    @Column(name = "scadenza_prestito")
    private LocalDate scadenzaPrestito;

    @Column(name = "data_restituzione")
    private LocalDate dataRestituzione;

    public Prestito() {
    }

    public Prestito(Utente utente, int id, Catalogo catalogo, LocalDate attivazionePrestito, LocalDate scadenzaPrestito, LocalDate dataRestituzione) {
        this.utente = utente;
        this.id = id;
        this.catalogo = catalogo;
        this.attivazionePrestito = attivazionePrestito;
        this.scadenzaPrestito = scadenzaPrestito;
        this.dataRestituzione = dataRestituzione;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public LocalDate getAttivazionePrestito() {
        return attivazionePrestito;
    }

    public void setAttivazionePrestito(LocalDate attivazionePrestito) {
        this.attivazionePrestito = attivazionePrestito;
    }

    public LocalDate getScadenzaPrestito() {
        return scadenzaPrestito;
    }

    public void setScadenzaPrestito(LocalDate scadenzaPrestito) {
        this.scadenzaPrestito = scadenzaPrestito;
    }

    public LocalDate getDataRestituzione() {
        return dataRestituzione;
    }

    public void setDataRestituzione(LocalDate dataRestituzione) {
        this.dataRestituzione = dataRestituzione;
    }

    @Override
    public String toString() {
        return "Prestito{" +
                "utente=" + utente +
                ", id=" + id +
                ", catalogo=" + catalogo +
                ", attivazionePrestito=" + attivazionePrestito +
                ", scadenzaPrestito=" + scadenzaPrestito +
                ", dataRestituzione=" + dataRestituzione +
                '}';
    }
}