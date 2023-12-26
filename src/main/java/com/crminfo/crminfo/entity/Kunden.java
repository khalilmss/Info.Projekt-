package com.crminfo.crminfo.entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Kunden {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int Id;
    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "geburtsname")
    private String geburtsname;

    @Column(name ="geburtsdatum" )
    private Date geburtsdatum;

    @Column(name = "email")
    private String email;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "kunden")
    private List<Kontakt_history> kontakt_history;



    @Column(name = "netto" )
    private int netto;

    @Column(name ="wohnart" )
    private String wohnart;

    @Column(name = "staatangehörigkeit")
    private  String Staatangehörigkeit;

    @Column(name = "familienstand")
    private String familienstand;


    @Column(name = "telefonnummer")
    private String telefonnummer;

    @Column(name = "kundenstatus")
    private String kundenstatus;

    @Column(name = "kundennummer")
    private String kundennummer;

    @Column(name = "kontonnummer")
    private String kontonnummer;

    //
//
//
    public Kunden() {

    }

    public Kunden(String first_name, String last_name, String geburtsname, Date geburtsdatum, String email, List<Kontakt_history> kontakt_history, int netto, String wohnart, String staatangehörigkeit, String familienstand, String telefonnummer, String kundenstatus, String kundennummer, String kontonnummer) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.geburtsname = geburtsname;
        this.geburtsdatum = geburtsdatum;
        this.email = email;
        this.kontakt_history = kontakt_history;
        this.netto = netto;
        this.wohnart = wohnart;
        Staatangehörigkeit = staatangehörigkeit;
        this.familienstand = familienstand;
        this.telefonnummer = telefonnummer;
        this.kundenstatus = kundenstatus;
        this.kundennummer = kundennummer;
        this.kontonnummer = kontonnummer;
    }



    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGeburtsname() {
        return geburtsname;
    }

    public void setGeburtsname(String geburtsname) {
        this.geburtsname = geburtsname;
    }

    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public int getNetto() {
        return netto;
    }

    public void setNetto(int netto) {
        this.netto = netto;
    }

    public String getWohnart() {
        return wohnart;
    }

    public void setWohnart(String wohnart) {
        this.wohnart = wohnart;
    }

    public String getStaatangehörigkeit() {
        return Staatangehörigkeit;
    }

    public void setStaatangehörigkeit(String staatangehörigkeit) {
        Staatangehörigkeit = staatangehörigkeit;
    }

    public String getFamilienstand() {
        return familienstand;
    }

    public void setFamilienstand(String familienstand) {
        this.familienstand = familienstand;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public String getKundenstatus() {
        return kundenstatus;
    }

    public void setKundenstatus(String kundenstatus) {
        this.kundenstatus = kundenstatus;
    }

    public String getKundennummer() {
        return kundennummer;
    }

    public void setKundennummer(String kundennummer) {
        this.kundennummer = kundennummer;
    }

    public String getKontonnummer() {
        return kontonnummer;
    }

    public void setKontonnummer(String kontonnummer) {
        this.kontonnummer = kontonnummer;
    }

    public List<Kontakt_history> getKontakt_history() {
        return kontakt_history;
    }

    public void setKontakt_history(List<Kontakt_history> kontakt_history) {
        this.kontakt_history = kontakt_history;
    }

    //convenience method
    public void addkontakt(Kontakt_history k_h){
        if (kontakt_history == null){
            kontakt_history = new ArrayList<>();
        }
        kontakt_history.add(k_h);
    }

    @Override
    public String toString() {
        return "Kunden{" +
                "Id=" + Id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", geburtsname='" + geburtsname + '\'' +
                ", geburtsdatum=" + geburtsdatum +
                ", email='" + email + '\'' +
                ", kontakt_history=" + kontakt_history +
                ", netto=" + netto +
                ", wohnart='" + wohnart + '\'' +
                ", Staatangehörikeit='" + Staatangehörigkeit + '\'' +
                ", familienstand='" + familienstand + '\'' +
                ", telefonnummer='" + telefonnummer + '\'' +
                ", kundenstatus='" + kundenstatus + '\'' +
                ", kundennummer='" + kundennummer + '\'' +
                ", kontonnummer='" + kontonnummer + '\'' +
                '}';
    }
}