package Flore;

public abstract class Vegetal {
    Vegetal() {
        etatVeget = Etat.GRAINE;
        displayChar = new char[]{'_', '.', 'i', ' ', ' ', '#'};
    }

    protected Etat etatVeget;
    protected char[] displayChar;

    public char getDisplayChar() {
        switch (this.etatVeget) {
            case GRAINE:
                return displayChar[0];
            case GERME:
                return displayChar[1];
            case TIGE:
                return displayChar[2];
            case FEUILLE:
                return displayChar[3];
            case FLEUR:
                return displayChar[4];
            case MORT:
                return displayChar[5];
        }
        return '0';
    }

    public void grandir() {
        this.etatVeget = Etat.values()[this.etatVeget.ordinal() + 1];
    }

    public Etat getEtatVeget() {
        return etatVeget;
    }
}
