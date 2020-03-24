package com.company;

public class Truite extends Poisson {
    Truite(String nom,String son,int nbVertebre,int nbNageoire,int nbHameconsEvitée){
        super(nom,son, nbVertebre, nbNageoire);
        this.nbHameconsEvitée =nbHameconsEvitée;
    }
    private int nbHameconsEvitée;

    @Override
    public String toString() {
        return super.toString()+"\n Il a evitées "+nbHameconsEvitée+" hamecons";
    }

    @Override
    String getSon() {
        return super.son;
    }
}
