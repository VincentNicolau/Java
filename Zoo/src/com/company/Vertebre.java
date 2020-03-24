package com.company;

public class Vertebre extends Animal {
    Vertebre(String nom,String son,int nbVertebre){
        super(nom,son);
        this.nbVertebre = nbVertebre;
    }
    private int nbVertebre;

    @Override
    public String toString() {
        return super.toString()+"\n Il a "+nbVertebre+" vertebre";
    }
}
