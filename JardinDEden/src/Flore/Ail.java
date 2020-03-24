package Flore;

import java.util.HashMap;

public class Ail extends Vegetal implements IRacePure {
    public Ail() {
        super();
        this.displayChar[3] = 'a';
        this.displayChar[4] = 'A';
    }

    @Override
    public void seReproduire(HashMap<String, Integer> panier) {
        panier.put("Ail", panier.get("Ail") + 3);
    }
}
