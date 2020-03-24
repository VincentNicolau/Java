package com.company;

public class Chimpanze extends Mammifere {
    Chimpanze(String nom,String son,int nbVertebre, int nbMamelles,int nbBannane){
        super(nom,son, nbVertebre, nbMamelles);
        this.nbBannane = nbBannane;
    }
    private int nbBannane;

    @Override
    public String toString() {
        return super.toString() + "\n Il a mangé "+nbBannane+ " bannanes";
    }

    @Override
    String getSon() {
        return super.son;
    }
}
