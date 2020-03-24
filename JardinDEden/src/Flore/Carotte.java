package Flore;

import java.util.HashMap;

public class Carotte extends Vegetal implements IRacePure {
    public Carotte() {
        super();
        this.displayChar[3] = 'c';
        this.displayChar[4] = 'C';
    }

    @Override
    public void seReproduire(HashMap<String, Integer> panier) {
        panier.put("Carotte", panier.get("Carotte") + 3);
    }
}
