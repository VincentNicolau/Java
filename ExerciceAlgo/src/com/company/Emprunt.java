package com.company;

public class Emprunt {
    public double sommeDueAN(double somme,int annee,double taux){
        for (int i =0; i<annee;i++){
            somme=somme+somme*taux;
        }
        return somme;
    }
    public int remoursement(double emprunt,double taux,double remboursement){
        int annee=0;
        while (emprunt>remboursement){
            emprunt = emprunt+emprunt*taux;
            emprunt= emprunt-remboursement;
            annee++;
        }
        return annee+1;
    }
}
