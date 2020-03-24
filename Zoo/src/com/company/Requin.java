package com.company;

public class Requin extends Poisson {
    Requin(String nom,String son,int nbVertebre,int nbNageoire,int nbHumainsDevoree){
        super(nom,son, nbVertebre, nbNageoire);
        this.nbHumainsDevoree = nbHumainsDevoree;
    }
    private int nbHumainsDevoree;

    @Override
    public String toString() {
        return super.toString()+"\n il a devoré "+nbHumainsDevoree+" Humains";
    }

    @Override
    String getSon() {
        return super.son;
    }
}
