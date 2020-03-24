package Hero;

import sun.reflect.annotation.EnumConstantNotPresentExceptionProxy;

public class Hit {
    private int strength;
    private int range;
    private TypeHit hitType;
    public Hit(int strength,int range, TypeHit hitType) throws Exception {
        if (strength <0 || strength>100){
            throw new Exception("Strength out of range");
        }
        if (range <0 || range >100){
            throw new Exception("Range out of range");
        }
        this.range = range;
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public int getRange() {
        return range;
    }

    public TypeHit getHitType() {
        return hitType;
    }
}
