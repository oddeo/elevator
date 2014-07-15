package kata;

import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FlowerPotTest {
    
    public FlowerPotTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getLifeLevel method, of class FlowerPot.
     */
    @Test
    public void testGetLifeLevelIsAlwaysGreaterThanZero() {
        System.out.println("testGetLifeLevelIsAlwaysGreaterThanZero");
        FlowerPot instance = new FlowerPot();
        instance.setLifeLevel(-1);
        int result = instance.getLifeLevel();
        
        assertTrue(result >= 0);
    }
    
    @Test
    public void testSetLifeLevelCannotExceedMaxLifeLevel() {
        System.out.println("testSetLifeLevelCannotExceedMaxLifeLevel");
        FlowerPot instance = new FlowerPot();
        instance.setLifeLevel(6);
        int result = instance.getLifeLevel();
        
        assertThat(result, is(5));
    }
    
    @Test
    public void testFlowerDiesWhenLifeLevelIsZero() {
        System.out.println("testFlowerCanDie");
        FlowerPot instance = new FlowerPot();
  
        // kill the plant - bring its life to zero 
        Flower state = instance.setLifeLevel(-5);
   
        assertThat(state, is(Flower.DEAD));
    }
    
    @Test
    public void testFlowerIsInBadStateWhenHalfDead() {
        System.out.println("testFlowerIsInBadStateWhenHalfDead");
        FlowerPot instance = new FlowerPot();
  
        // kill the plant - bring its life to zero 
        Flower state = instance.setLifeLevel(-3);
   
        assertThat(state, is(Flower.BAD));
    }
    
    @Test
    public void testNewFlowerIsInGoodState() {
        System.out.println("testNewFlowerIsInGoodState");
        FlowerPot instance = new FlowerPot();
   
        assertThat(instance.getState(), is(Flower.GOOD));
    }
    
}
