package com.company;

public class Serpent extends Reptile {
    Serpent(String nom,String son,int nbVertebre,int nbEcaille,int nbSourisDevores){
        super(nom,son,nbVertebre,nbEcaille);
        this.nbSourisDevores = nbSourisDevores;
    }
    private int nbSourisDevores;

    @Override
    public String toString() {
        return super.toString()+"\n il a devorées "+nbSourisDevores+" souris";
    }

    @Override
    String getSon() {
        return super.son;
    }
}
