package Test;

import Hero.Hit;
import Hero.TypeHit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HitTest {
    private Hit hit;
    @BeforeEach
    public void setUp() throws Exception{
        this.hit = new Hit(1,10,TypeHit.NORMAL);
    }
    @Test
    void getStrength() {
        final int expected =1;
        assertEquals(expected,this.hit.getStrength());
    }

    @Test
    void getRange() {
    }

    @Test
    void getHitType() {
    }

    @Test
    public void excepStrengthMinRange(){
        try{
            new Hit(-1,1,TypeHit.NORMAL);
            fail("Should throw exception when strength <0");
        }catch (final Exception e){
            final String expected = "Strength out of range";
            assertEquals(expected, e.getMessage());
        }
    }
    @AfterEach
    public void tearDown()throws Exception{

    }
}