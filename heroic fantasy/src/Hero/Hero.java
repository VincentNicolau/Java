package Hero;

public class Hero implements IHero {
    Hit hit;
    Hero() {
    }
    @Override
    public Hit getHit() {
        return hit;
    }
}
