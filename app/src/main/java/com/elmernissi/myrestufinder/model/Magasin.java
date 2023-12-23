package com.elmernissi.myrestufinder.model;

public class Magasin {
    String nom,adresse,telephone;
    public Magasin(String nom,String adresse,String telephone){
        this.nom=nom;
        this.adresse=adresse;
        this.telephone=telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getNom() {
        return nom;
    }

    public String getTelephone() {
        return telephone;
    }

}
