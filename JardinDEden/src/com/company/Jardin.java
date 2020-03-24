package com.company;

import Flore.*;

import java.util.HashMap;
import java.util.Map;

public class Jardin {
    Jardin(){
        this.panier = new HashMap<String, Integer>();
        this.longueur = 0;
        this.largeur = 0;
    }
    Jardin(int longueur,int largeur){
        this.panier = new HashMap<String, Integer>();
        this.longueur = longueur;
        this.largeur = largeur;
        this.emplacement= new Emplacement[longueur][largeur];
    }
    private int longueur;
    private int largeur;
    private Emplacement[][] emplacement;
    private HashMap<String, Integer> panier;

    public void ajouterGraine(String nomDuVegetal,Integer qty){
        this.panier.put(nomDuVegetal,qty);
    }
    public String toString(){
        String garden = "";
        for (int i=0;i<largeur ;i++){
            for (int j=0;j<longueur;j++){
                if (emplacement[j][i] == null){
                    garden += "0";
                }else{
                    garden += emplacement[j][i].getVeget().getDisplayChar();
                }
            }
            garden += "\n";
        }
        garden+= "\n";
        for (Map.Entry entry:this.panier.entrySet()){
            garden+= entry.getKey()+":"+ entry.getValue()+"\n";
        }
        return garden;
    }
    public void semer(int x,int y, VegetType plante){
        String nomPlante ="";
        switch (plante){
            case AIL:
                nomPlante="Ail";
                break;
            case BETTERAVE:
                nomPlante="Betterave";
                break;
            case CAROTTE:
                nomPlante="Carotte";
                break;
            case TOMATE:
                nomPlante="Tomate";
                break;
        }
        for (Map.Entry entry:this.panier.entrySet()){
            if (entry.getKey() == nomPlante){
                int newValue = Integer.parseInt(entry.getValue().toString());
                if (newValue!=0){
                    emplacement[x][y] = new Emplacement(plante);
                    entry.setValue(newValue-1);
                }
            }
        }
    }

    public void saisonSuivante(){
        for (int i=0;i<largeur ;i++) {
            for (int j = 0; j < longueur; j++) {
                if (emplacement[j][i] != null) {
                    if(emplacement[j][i].getVeget().getEtatVeget()==Etat.MORT){
                        emplacement[j][i] = null;
                    }else{
                        emplacement[j][i].getVeget().grandir();
                    }
                }
            }
        }
    }

    public void recolter(){
        for (int i=0;i<largeur ;i++) {
            for (int j = 0; j < longueur; j++) {
                if (emplacement[j][i] != null) {
                    if(emplacement[j][i].getVeget().getEtatVeget()==Etat.FLEUR){
                        if (emplacement[j][i].getVeget() instanceof IRacePure){
                            IRacePure v = (IRacePure) emplacement[j][i].getVeget();
                            v.seReproduire(panier);
                            emplacement[j][i] = null;
                        }else{
                            if (emplacement[j][i].getVeget() instanceof IOgm){
                                IOgm v = (IOgm) emplacement[j][i].getVeget();
                                Class type = emplacement[j][i].getVeget().getClass();
                                    Coordonnee newCoor =  v.seDupliquer(longueur,largeur);
                                emplacement[j][i] = null;
                                System.out.println(newCoor.getX()+""+newCoor.getY());
                                if (type.getName() == "Flore.Bettrave"){
                                    for (Map.Entry entry:this.panier.entrySet()){
                                    if (entry.getKey() == "Betterave"){
                                        int newValue = Integer.parseInt(entry.getValue().toString());
                                        entry.setValue(newValue+1);
                                    }
                                }
                                    semer(newCoor.getX(),newCoor.getY(),VegetType.BETTERAVE);
                                }
                            }else{
                                emplacement[j][i] = null;
                            }
                        }
                    }
                }
            }
        }
    }
}
