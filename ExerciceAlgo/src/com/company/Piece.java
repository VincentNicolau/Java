package com.company;

public class Piece {
    Piece(double valeur,int nbRestant){
        this.valeur = valeur;
        this.nbRestant = nbRestant;
    }
    private double valeur;
    private int nbRestant;

    public double getValeur() {
        return valeur;
    }

    public int getNbRestant() {
        return nbRestant;
    }

    public void setNbRestant(int nbRestant) {
        this.nbRestant = nbRestant;
    }
}
