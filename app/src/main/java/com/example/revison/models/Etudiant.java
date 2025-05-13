package com.example.revison.models;

public class Etudiant {
    public int id;
    public  String nom,prenom;

    public Etudiant(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    public Etudiant(String nom, String prenom,int id){
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
    }
}
