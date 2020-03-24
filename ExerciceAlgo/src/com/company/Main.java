package com.company;

import com.sun.javafx.collections.MappingChange;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan =new Scanner(System.in);
        System.out.println("Wesh tu gagne combien :");
        double res = scan.nextDouble();
        double impotRev = 0;
        Map<Double,Double> seuil= new TreeMap<>();
        seuil.put(10000.00,0.14);
        seuil.put(30000.00 ,0.26);
        seuil.put(100000.00,0.35);
        seuil.put(500000.00,0.50);
        int index =0;
        List key =new ArrayList( seuil.keySet());
        double curSeuil=Double.parseDouble(key.get(index).toString());
        double prevCurSeuil = 0;
        while (res>curSeuil){
            if (res<curSeuil){
                    impotRev += (res-curSeuil)* seuil.get(key.get(index));
            }else{
                if (curSeuil ==500000.00 ){
                    impotRev += (res-prevCurSeuil)* seuil.get(key.get(index));
                }else{
                    impotRev += (curSeuil-prevCurSeuil)* seuil.get(key.get(index));
                }
            }
            prevCurSeuil = curSeuil;
            index++;
            if (index >= seuil.size()){
                break;
            }
            curSeuil=Double.parseDouble(key.get(index).toString());
        }
        System.out.println(impotRev);
        System.out.println("Valeur a rendre :");
        res = scan.nextDouble();
        DAB myDab = new DAB();
        System.out.println(myDab.RendreMonnaie(res));
        System.out.println("Valeur a emprunte, nombre d'annee, taux :");
        Emprunt myDebt = new Emprunt();
        System.out.println(myDebt.sommeDueAN(3000,3,0.5));
        System.out.println(myDebt.remoursement(3000,0.1,500));
        theGame newGame = new theGame();
        System.out.println(newGame.jeuMemePorte());
        System.out.println(newGame.jeuPorteDifferente());
        System.out.println(racineCarre(9.9));
        System.out.println(pi());
        System.out.println(fizzBuzz());
        if (isBissectile(2019)){
            System.out.println("c'est");
        }else{
            System.out.println("c'est pas");
        }
        RomanMounth roman = new RomanMounth(22,6,1999);
        System.out.println(roman);
    }
    public static double racineCarre(double A){
        double racine =1;
        for (int i = 0; i < 500; i++) {
            racine = (racine+A/racine) /2;
        }
        return racine;
    }
    public static double pi(){
        double a =1;
        double an;
        double b = 1/racineCarre(2);
        double t = 1./4.;
        double p =1;
        for (int i = 0; i < 500; i++) {
            an=(a+b)/2;
            b = racineCarre(a*b);
            t = t -p* Math.pow(a-an,2);
            p = 2*p;
            a =an;
        }
        return (Math.pow(a + b,2)/(4*t));
    }
    public static String fizzBuzz(){
        String theString="";
        for (int i=1;i<=100;i++){
            boolean isDIvF = false;
            boolean isDIvS = false;
            if (i%5 == 0){
                theString+="Fizz";
                isDIvF = true;
            }
            if (i%7 ==0 || (i-7)%10 ==0){
                theString+="Buzz";
                isDIvS = true;
            }
            if (!isDIvF && !isDIvS){
                theString+=""+i;
            }
            theString+="\n";
        }
        return theString;
    }

    public static boolean isBissectile(int annee){
        boolean bisec = false;
        if(annee %4 == 0  && annee % 100 != 0){
            bisec= true;
        }
        if (annee %400 == 0){
            bisec = true;
        }
        return bisec;
    }
}
