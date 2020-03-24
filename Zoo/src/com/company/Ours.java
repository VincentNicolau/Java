package com.company;

public class Ours extends Mammifere {
    Ours(String nom,String son,int nbVertebre, int nbMamelles,int nbLitresMiel){
        super(nom,son,nbVertebre,nbMamelles);
        this.nbLitresMiel = nbLitresMiel;
    }
    private int nbLitresMiel;

    @Override
    public String toString() {
        return super.toString()+"\n il a mangé "+nbLitresMiel+" litres de miel";
    }

    @Override
    String getSon() {
        return super.son;
    }
}
