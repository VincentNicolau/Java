package com.company;

public class Raie extends Poisson {
    Raie(String nom,String son,int nbVertebre,int nbNageoire,double surface){
        super(nom,son,nbVertebre,nbNageoire);
        this.surface = surface;
    }
    private double surface;

    @Override
    public String toString() {
        return super.toString()+"\n Il represente une surface de"+surface+" km²";
    }

    @Override
    String getSon() {
        return super.son;
    }
}
