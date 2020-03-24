package com.company;

import java.util.ArrayList;

public class Zoo {
    Zoo(){
        this.habitant = new ArrayList<Animal>();
    }
    ArrayList<Animal> habitant;
    public void ajouterNouvelHabitant(Animal nouveaux){
        habitant.add(nouveaux);
    }

    @Override
    public String toString() {
        String allAnimaux="";
        for (Animal animal:habitant) {
        allAnimaux += animal.toString()+"\n";
        }
        return allAnimaux;
    }
}
