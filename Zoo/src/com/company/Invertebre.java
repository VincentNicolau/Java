package com.company;

public class Invertebre extends Animal {
    Invertebre(String nom,String son){
        super(nom,son);
    }

    @Override
    public String toString() {
        return super.toString() + "\n il n'a pas de vertebre";
    }
}
