package com.company;

import Flore.*;

import java.io.CharArrayReader;

public class Emplacement {
    Emplacement(){}
    Emplacement(VegetType plante){
        switch (plante){
            case AIL:
                veget = new Ail();
                break;
            case BETTERAVE:
                veget = new Bettrave();
                break;
            case CAROTTE:
                veget = new Carotte();
                break;
            case TOMATE:
                veget = new Tomate();
                break;
        }
    }
    private Vegetal veget;

    public Vegetal getVeget() {
        return veget;
    }
}
