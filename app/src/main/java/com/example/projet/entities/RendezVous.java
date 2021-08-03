package com.example.projet.entities;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Timer;

public class RendezVous {

    private String id ;
    private Medecin medecin ;
    private Patient patient ;
    private Date date ;
    private LocalDateTime time ;
    private String causse ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getCausse() {
        return causse;
    }

    public void setCausse(String causse) {
        this.causse = causse;
    }
}
