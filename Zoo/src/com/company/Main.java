package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Chimpanze champ = new Chimpanze("champ","AAAAAAAAAAAAAAAAAAA",3,2,110);
        Ours wojtek = new Ours("Vojtek","OOOOOOOOOOOOOOOOOOOOOOOOOOO",3,2,110);
        Truite truite = new Truite("truité","UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU",3,2,110);
        Serpent snakky = new Serpent("snakky","EEEEEEEEEEEEEEEEEEEEEEEEEEEEEE",3,2,110);
        Rat ratty = new Rat("Ratty","IIIIIIIIIIIIIIIIIIIIIIIIIIIIIII",3,2,110);
        Zoo monZoo = new Zoo();
        monZoo.ajouterNouvelHabitant(champ);
        monZoo.ajouterNouvelHabitant(wojtek);
        monZoo.ajouterNouvelHabitant(truite);
        monZoo.ajouterNouvelHabitant(snakky);
        monZoo.ajouterNouvelHabitant(ratty);
        System.out.println(monZoo);
    }
}
