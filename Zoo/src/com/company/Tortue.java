package com.company;

public class Tortue extends Reptile {
    Tortue(String nom,String son,int nbVertebre,int nbEcailles,int vitesse){
        super(nom,son, nbVertebre, nbEcailles);
        this.vitesse=vitesse;
    }
    private int vitesse;

    @Override
    public String toString() {
        return super.toString()+"\n Il va a une vitesse de"+vitesse+" km/h";
    }

    @Override
    String getSon() {
        return super.son;
    }
}
