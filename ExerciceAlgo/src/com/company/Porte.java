package com.company;

public class Porte {
    Porte(int numeroPorte,boolean isWin){
        this.numeroPorte = numeroPorte;
        this.isWin = isWin;
        this.isOpen = false;
    }
    private int numeroPorte;
    private boolean isWin;
    private boolean isOpen;

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public boolean isWin() {
        return isWin;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
