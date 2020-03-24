package com.company;

public class theGame {
    theGame(){
    int porteGagneant =(int) (Math.random()*3);
        allPorte = new Porte[3];
    for (int i =0;i<3;i++){
        if (i == porteGagneant){
            allPorte[i]=new Porte(i,true);
        }else {
            allPorte[i]=new Porte(i,false);
        }
    }
    }
    Porte[] allPorte;
    public int jeuMemePorte(){
        int nbWin =0;
        for (int i =0;i<100000;i++){
            int portechoisit =(int) (Math.random()*3);
            int porteOuverte = portechoisit;
            while (porteOuverte == portechoisit && allPorte[porteOuverte].isWin()){
                porteOuverte = (int) (Math.random()*3);
            }
            if (allPorte[portechoisit].isWin()){
                nbWin++;
            }
        }
        return nbWin;
    }
    public int jeuPorteDifferente(){
        int nbWin =0;
        for (int i =0;i<100000;i++){
            int portechoisit =(int) (Math.random()*3);
            int porteOuverte = portechoisit;
            while (porteOuverte == portechoisit && allPorte[porteOuverte].isWin()){
                porteOuverte = (int) (Math.random()*3);
            }
            int porteATester =0;
            if (portechoisit !=0 && porteOuverte!=0){
                porteATester =0;
            }else{
                if (portechoisit !=1 && porteOuverte!=1){
                    porteATester =1;
                }else{
                    porteATester =2;
                }
            }
            if (allPorte[porteATester].isWin()){
                nbWin++;
            }
        }
        return nbWin;
    }
}
