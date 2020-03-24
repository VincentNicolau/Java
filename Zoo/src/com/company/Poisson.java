package com.company;

public class Poisson extends Vertebre {
    Poisson(String nom,String son,int nbVertebre,int nbNageoire){
        super(nom,son, nbVertebre);
        this.nbNageoire = nbNageoire;
    }
    private int nbNageoire;

    @Override
    public String toString() {
        return super.toString()+"\n Il a "+nbNageoire+" nageoires";
    }
}
