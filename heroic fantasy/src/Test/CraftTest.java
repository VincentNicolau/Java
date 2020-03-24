package Test;

import Craft.Craft;
import Craft.Warrior;
import Hero.Human;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CraftTest {
    private Craft  craft;
    @BeforeEach
    public void setUp() throws Exception{
        this.craft = new Warrior(new Human());
    }
    @Test
    void getHit() {
        assertNotNull(this.craft.getHit());
    }
}