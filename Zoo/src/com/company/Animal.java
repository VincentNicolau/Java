package com.company;

public class Animal {
    Animal(String nom,String son){
        this.nom = nom;
        this.son = son;
    }
    private String nom;
    protected String son;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "c'est un "+nom + " et il fait "+son;
    }

    String getSon(){return null;};
}
