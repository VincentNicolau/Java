package Flore;

import java.util.AbstractMap;

public class Bettrave extends Vegetal implements IOgm {
    public Bettrave() {
        super();
        this.displayChar[3] = 'b';
        this.displayChar[4] = 'B';
    }

    @Override
    public Coordonnee seDupliquer(int longueur, int largeur) {
        int newX = (int)(Math.random() * ((longueur - 0))) + 0;
        int newY = (int)(Math.random() * ((largeur - 0))) + 0;
        return new Coordonnee(newX,newY);
    }
}
