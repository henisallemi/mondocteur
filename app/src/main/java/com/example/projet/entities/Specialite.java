package com.example.projet.entities;

public class Specialite {

    private String id ;
    private String specialite ;

    Specialite(String specialite){
        this.specialite = specialite;
    }


    public String getId() {
        return id;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
