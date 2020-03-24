package com.company;

public class Reptile extends Vertebre {
    Reptile(String nom,String son,int nbVertebre,int nbEcailles){
        super(nom,son, nbVertebre);
        this.nbEcailles = nbEcailles;
    }
    private int nbEcailles;

    @Override
    public String toString() {
        return super.toString()+"\n il a "+nbEcailles+" ecailles";
    }
}
