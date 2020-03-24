package Craft;

import Hero.Hero;
import Hero.Hit;


public class Craft {
    Hero hero;
    Craft(Hero hero){
        this.hero  =hero;
    }

    public Hit getHit() {
        return hero.getHit();
    }
}
