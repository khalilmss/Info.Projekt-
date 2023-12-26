package com.crminfo.crminfo.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Entity
@Table(name = "kontakt_history")
public class Kontakt_history {


    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "comment")
    private String comment;

    @Column(name = "datum")
    private LocalDate datum;

    @ManyToOne
    @JoinColumn(name = "kunden")
    private Kunden kunden;

    public Kontakt_history() {
    }

    public Kontakt_history(String comment, LocalDate datum) {
        this.comment = comment;
        this.datum = datum;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public Kunden getKunde() {
        return kunden;
    }

    public void setKunde(Kunden kunde) {
        this.kunden  = kunde;
    }

    @Override
    public String toString() {
        return "Kontakt_history{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", datum=" + datum +
                ", kunde=" + kunden +
                '}';
    }


}

