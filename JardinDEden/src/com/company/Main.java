package com.company;

import Flore.VegetType;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean IsQuitting = false;
        Jardin monJardin = new Jardin(4,5);
        monJardin.ajouterGraine("Betterave",4);
        monJardin.ajouterGraine("Carotte",7);
        monJardin.ajouterGraine("Ail",6);
        monJardin.ajouterGraine("Tomate",9);
        while (true){
            System.out.println(monJardin);
            System.out.println("Que souhaitez vous faire ? \n 0:semer \n 1:recolter les plantes \n 2:Passer a la saison suivante \n 3:Quitter l'application");
            Scanner scan =new Scanner(System.in);
            int res = scan.nextInt();
            switch (res){
                case 0:
                    System.out.println("entrez la colone ou le planter (maximum 3):");
                    int Xres = scan.nextInt();
                    System.out.println("entrez la ligne ou le planter:(maximum 4)");
                    int Yres = scan.nextInt();
                    System.out.println("Que souhaitez vous planter ? \n 0:Ail \n 1:Bettrave \n 2:Carrotte \n 3:Tomate");
                    int plante = scan.nextInt();
                    monJardin.semer(Xres,Yres, VegetType.values()[plante]);
                case 1:
                    monJardin.recolter();
                    break;
                    case 2:
                        monJardin.saisonSuivante();
                break;
                case 3:
                    IsQuitting = true;
                    break;
            }
            if(IsQuitting)break;
        }

    }
}
