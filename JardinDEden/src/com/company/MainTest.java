package com.company;

import Flore.VegetType;


import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void main() {
        boolean IsQuitting = false;
        Jardin monJardin;
        try {
            monJardin = new Jardin(4,5);
            monJardin.ajouterGraine("Betterave",4);
            monJardin.ajouterGraine("Carotte",7);
            monJardin.ajouterGraine("Ail",6);
            monJardin.ajouterGraine("Tomate",9);
        }catch (Exception e){
            System.out.println("dude wtf ??");
            return;
        }
        try{
            monJardin.semer(5,5, VegetType.values()[1]);
        }catch (Exception e){
            System.out.println("Probleme lors de la seme");
        }
        assert VegetType.values()[1] == VegetType.BETTERAVE;
    }
}