package com.company;

public class Mammifere extends Vertebre {
    Mammifere(String nom,String son,int nbVertebre, int nbMamelles){
        super(nom,son,nbVertebre);
        this.nbMamelles = nbMamelles;
    }
    private int nbMamelles;

    @Override
    public String toString() {
        return super.toString() + "\n il a "+nbMamelles+" mamelles";
    }
}
