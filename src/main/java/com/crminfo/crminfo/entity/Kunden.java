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

    @Column(name="geschlecht")
    private String geschlecht;

    @Column(name="Titel")
    private String Titel;

    @Column(name="Name")
    private String Name;

    @Column(name="Geburtsname")
    private String Geburtsname;

    @Column(name="Vorname")
    private String Vorname;

    @Column(name="Strasse")
    private String Strasse;

    @Column(name="PLZ")
    private String PLZ;

    @Column(name="Ort")
    private String Ort;

    @Column(name="Geburtsdatum")
    private Date Geburtsdatum;

    @Column(name="Land")
    private String Land ;

    @Column(name="Staatsangehorigkeit")
    private String Staatsangehorigkeit;

    @Column(name="Email")
    private String Email;

    @Column(name="familienstatus")
    private String familienstatus;

    @Column(name="berufsgruppe")
    private String berufsgruppe;

    @Column(name="selbststandig")
    private String selbststandig;

    @Column(name="selbstandingseit")
    private Date selbstandingseit;

    @Column(name="branche")
    private String branche;

    @Column(name="Anzahl_der_Kinde")
    private String AnzahlderKinde;

    @Column(name="wohnart")
    private String wohnart;

    @Column(name="produkte")
    private String produkte;

    @Column(name="mobil")
    private String mobil;

    @Column(name="privat")
    private String privat;

    @Column(name="geschaftlich")
    private String  geschaftlich;

    @Column(name="kundenstatus")
    private String kundenstatus;

    @Column(name="kundennummer")
    private String kundennummer;

    @Column(name="kontonummer")
    private String kontonummer;




//    @Column(name="einverstanden_Werbung_Per_Email")
//    private int  einverstandenWerbungPerEmail ;
//
//    @Column(name="einverstan_den_Uebermittlung_An_Schufa")
//    private int  einverstandenUebermittlungAnSchufa;

    public Kunden() {
    }

    public Kunden(String geschlecht, String titel, String name, String geburtsname, String vorname, String strasse, String PLZ, String ort, Date geburtsdatum, String land, String staatsangehorigkeit, String email, String familienstatus, String berufsgruppe, String selbststandig, Date selbstandingseit, String branche, String anzahlderKinde, String wohnart, String produkte, String mobil, String privat, String geschaftlich, String kundenstatus, String kundennummer, String kontonummer/*, int einverstandenWerbungPerEmail, int einverstandenUebermittlungAnSchufa*/) {
        this.geschlecht = geschlecht;
        Titel = titel;
        Name = name;
        Geburtsname = geburtsname;
        Vorname = vorname;
        Strasse = strasse;
        this.PLZ = PLZ;
        Ort = ort;
        Geburtsdatum = geburtsdatum;
        Land = land;
        Staatsangehorigkeit = staatsangehorigkeit;
        Email = email;
        this.familienstatus = familienstatus;
        this.berufsgruppe = berufsgruppe;
        this.selbststandig = selbststandig;
        this.selbstandingseit = selbstandingseit;
        this.branche = branche;
        this.AnzahlderKinde = anzahlderKinde;
        this.wohnart = wohnart;
        this.produkte = produkte;
        this.mobil = mobil;
        this.privat = privat;
        this.geschaftlich = geschaftlich;
        this.kundenstatus = kundenstatus;
        this.kundennummer = kundennummer;
        this.kontonummer = kontonummer;
//        this.einverstandenWerbungPerEmail = einverstandenWerbungPerEmail;
//        this.einverstandenUebermittlungAnSchufa = einverstandenUebermittlungAnSchufa;
    }



    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getTitel() {
        return Titel;
    }

    public void setTitel(String titel) {
        Titel = titel;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGeburtsname() {
        return Geburtsname;
    }

    public void setGeburtsname(String geburtsname) {
        Geburtsname = geburtsname;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getStrasse() {
        return Strasse;
    }

    public void setStrasse(String strasse) {
        Strasse = strasse;
    }

    public String getPLZ() {
        return PLZ;
    }

    public void setPLZ(String PLZ) {
        this.PLZ = PLZ;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String ort) {
        Ort = ort;
    }

    public Date getGeburtsdatum() {
        return Geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum) {
        Geburtsdatum = geburtsdatum;
    }

    public String getLand() {
        return Land;
    }

    public void setLand(String land) {
        Land = land;
    }

    public String getStaatsangehorigkeit() {
        return Staatsangehorigkeit;
    }

    public void setStaatsangehorigkeit(String staatsangehorigkeit) {
        Staatsangehorigkeit = staatsangehorigkeit;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFamilienstatus() {
        return familienstatus;
    }

    public void setFamilienstatus(String familienstatus) {
        this.familienstatus = familienstatus;
    }

    public String getBerufsgruppe() {
        return berufsgruppe;
    }

    public void setBerufsgruppe(String berufsgruppe) {
        this.berufsgruppe = berufsgruppe;
    }

    public String getSelbststandig() {
        return selbststandig;
    }

    public void setSelbststandig(String selbststandig) {
        this.selbststandig = selbststandig;
    }

    public Date getSelbstandingseit() {
        return selbstandingseit;
    }

    public void setSelbstandingseit(Date selbstandingseit) {
        this.selbstandingseit = selbstandingseit;
    }

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    public String getAnzahlderKinde() {
        return AnzahlderKinde;
    }

    public void setAnzahlderKinde(String anzahlderKinde) {
        AnzahlderKinde = anzahlderKinde;
    }

    public String getWohnart() {
        return wohnart;
    }

    public void setWohnart(String wohnart) {
        this.wohnart = wohnart;
    }

    public String getProdukte() {
        return produkte;
    }

    public void setProdukte(String produkte) {
        this.produkte = produkte;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public String getPrivat() {
        return privat;
    }

    public void setPrivat(String privat) {
        this.privat = privat;
    }

    public String getGeschaftlich() {
        return geschaftlich;
    }

    public void setGeschaftlich(String geschaftlich) {
        this.geschaftlich = geschaftlich;
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

    public String getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(String kontonummer) {
        this.kontonummer = kontonummer;
    }

//    public int getEinverstandenWerbungPerEmail() {
//        return einverstandenWerbungPerEmail;
//    }
//
//    public void setEinverstandenWerbungPerEmail(int einverstandenWerbungPerEmail) {
//        this.einverstandenWerbungPerEmail = einverstandenWerbungPerEmail;
//    }
//
//    public int getEinverstandenUebermittlungAnSchufa() {
//        return einverstandenUebermittlungAnSchufa;
//    }
//
//    public void setEinverstandenUebermittlungAnSchufa(int einverstandenUebermittlungAnSchufa) {
//        this.einverstandenUebermittlungAnSchufa = einverstandenUebermittlungAnSchufa;
//    }

    @Override
    public String toString() {
        return "Kunden{" +
                "Id=" + Id +
                ", geschlecht='" + geschlecht + '\'' +
                ", Titel='" + Titel + '\'' +
                ", Name='" + Name + '\'' +
                ", Geburtsname='" + Geburtsname + '\'' +
                ", Vorname='" + Vorname + '\'' +
                ", Strasse='" + Strasse + '\'' +
                ", PLZ='" + PLZ + '\'' +
                ", Ort='" + Ort + '\'' +
                ", Geburtsdatum=" + Geburtsdatum +
                ", Land='" + Land + '\'' +
                ", Staatsangehorigkeit='" + Staatsangehorigkeit + '\'' +
                ", Email='" + Email + '\'' +
                ", familienstatus='" + familienstatus + '\'' +
                ", berufsgruppe='" + berufsgruppe + '\'' +
                ", selbststandig='" + selbststandig + '\'' +
                ", selbstandingseit=" + selbstandingseit +
                ", branche='" + branche + '\'' +
                ", AnzahlderKinde='" + AnzahlderKinde + '\'' +
                ", wohnart='" + wohnart + '\'' +
                ", produkte='" + produkte + '\'' +
                ", mobil='" + mobil + '\'' +
                ", privat='" + privat + '\'' +
                ", geschaftlich='" + geschaftlich + '\'' +
                ", kundenstatus='" + kundenstatus + '\'' +
                ", kundennummer='" + kundennummer + '\'' +
                ", kontonummer='" + kontonummer + '\'' +
//                ", einverstandenWerbungPerEmail=" + einverstandenWerbungPerEmail +
//                ", einverstandenUebermittlungAnSchufa=" + einverstandenUebermittlungAnSchufa +
                '}';
    }

    //    @Column(name = "first_name")
//    private String first_name;
//
//    @Column(name = "last_name")
//    private String last_name;
//
//    @Column(name = "geburtsname")
//    private String geburtsname;
//
//    @Column(name ="geburtsdatum" )
//    private Date geburtsdatum;
//
//    @Column(name = "email")
//    private String email;
//
//    //
////    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
////    @JoinColumn(name = "kunden")
////    private List<Kontakt_history> kontakt_history;
//
//
//
//    @Column(name = "netto" )
//    private int netto;
//
//    @Column(name ="wohnart" )
//    private String wohnart;
//
//    @Column(name = "staatangehörigkeit")
//    private  String Staatangehörigkeit;
//
//    @Column(name = "familienstand")
//    private String familienstand;
//
//
//    @Column(name = "telefonnummer")
//    private String telefonnummer;
//
//    @Column(name = "kundenstatus")
//    private String kundenstatus;
//
//    @Column(name = "kundennummer")
//    private String kundennummer;
//
//    @Column(name = "kontonnummer")
//    private String kontonnummer;
//
//    //
////
////
//    public Kunden() {
//
//    }
//
//    public Kunden(String first_name, String last_name, String geburtsname, Date geburtsdatum, String email, int netto, String wohnart, String staatangehörigkeit, String familienstand, String telefonnummer, String kundenstatus, String kundennummer, String kontonnummer) {
//        this.first_name = first_name;
//        this.last_name = last_name;
//        this.geburtsname = geburtsname;
//        this.geburtsdatum = geburtsdatum;
//        this.email = email;
////        this.kontakt_history = kontakt_history;
//        this.netto = netto;
//        this.wohnart = wohnart;
//        Staatangehörigkeit = staatangehörigkeit;
//        this.familienstand = familienstand;
//        this.telefonnummer = telefonnummer;
//        this.kundenstatus = kundenstatus;
//        this.kundennummer = kundennummer;
//        this.kontonnummer = kontonnummer;
//    }
//
//
//
//    public int getId() {
//        return Id;
//    }
//
//    public void setId(int id) {
//        Id = id;
//    }
//
//    public String getFirst_name() {
//        return first_name;
//    }
//
//    public void setFirst_name(String first_name) {
//        this.first_name = first_name;
//    }
//
//    public String getLast_name() {
//        return last_name;
//    }
//
//    public void setLast_name(String last_name) {
//        this.last_name = last_name;
//    }
//
//    public String getGeburtsname() {
//        return geburtsname;
//    }
//
//    public void setGeburtsname(String geburtsname) {
//        this.geburtsname = geburtsname;
//    }
//
//    public Date getGeburtsdatum() {
//        return geburtsdatum;
//    }
//
//    public void setGeburtsdatum(Date geburtsdatum) {
//        this.geburtsdatum = geburtsdatum;
//    }
//
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//
//
//    public int getNetto() {
//        return netto;
//    }
//
//    public void setNetto(int netto) {
//        this.netto = netto;
//    }
//
//    public String getWohnart() {
//        return wohnart;
//    }
//
//    public void setWohnart(String wohnart) {
//        this.wohnart = wohnart;
//    }
//
//    public String getStaatangehörigkeit() {
//        return Staatangehörigkeit;
//    }
//
//    public void setStaatangehörigkeit(String staatangehörigkeit) {
//        Staatangehörigkeit = staatangehörigkeit;
//    }
//
//    public String getFamilienstand() {
//        return familienstand;
//    }
//
//    public void setFamilienstand(String familienstand) {
//        this.familienstand = familienstand;
//    }
//
//    public String getTelefonnummer() {
//        return telefonnummer;
//    }
//
//    public void setTelefonnummer(String telefonnummer) {
//        this.telefonnummer = telefonnummer;
//    }
//
//    public String getKundenstatus() {
//        return kundenstatus;
//    }
//
//    public void setKundenstatus(String kundenstatus) {
//        this.kundenstatus = kundenstatus;
//    }
//
//    public String getKundennummer() {
//        return kundennummer;
//    }
//
//    public void setKundennummer(String kundennummer) {
//        this.kundennummer = kundennummer;
//    }
//
//    public String getKontonnummer() {
//        return kontonnummer;
//    }
//
//    public void setKontonnummer(String kontonnummer) {
//        this.kontonnummer = kontonnummer;
//    }
//
//    @Override
//    public String toString() {
//        return "Kunden{" +
//                "Id=" + Id +
//                ", first_name='" + first_name + '\'' +
//                ", last_name='" + last_name + '\'' +
//                ", geburtsname='" + geburtsname + '\'' +
//                ", geburtsdatum=" + geburtsdatum +
//                ", email='" + email + '\'' +
////                ", kontakt_history=" + kontakt_history +
//                ", netto=" + netto +
//                ", wohnart='" + wohnart + '\'' +
//                ", Staatangehörikeit='" + Staatangehörigkeit + '\'' +
//                ", familienstand='" + familienstand + '\'' +
//                ", telefonnummer='" + telefonnummer + '\'' +
//                ", kundenstatus='" + kundenstatus + '\'' +
//                ", kundennummer='" + kundennummer + '\'' +
//                ", kontonnummer='" + kontonnummer + '\'' +
//                '}';
//    }
}