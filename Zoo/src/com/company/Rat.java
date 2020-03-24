package com.company;

public class Rat extends Mammifere {
    Rat(String nom,String son,int nbVertebre, int nbMamelles,int nbPoubellesVisite){
        super(nom,son, nbVertebre, nbMamelles);
        this.nbPoubellesVisite = nbPoubellesVisite;
    }
    private int nbPoubellesVisite;

    @Override
    public String toString() {
        return super.toString()+"\n Il a visité "+nbPoubellesVisite+" poubelles";
    }

    @Override
    String getSon() {
        return super.son;
    }
}
