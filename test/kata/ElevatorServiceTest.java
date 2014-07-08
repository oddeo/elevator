/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata;

import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danieljones
 */
public class ElevatorServiceTest {

    
    public ElevatorServiceTest() {
    }
    
    @Before
    public void setUp() {

    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCheckCurrentFloor() {
        System.out.println("testSummonReturnsBool");
        
        int startingFloor = 0;
        ElevatorService elevator = new ElevatorService();
        int result = elevator.getFloor();
        
        assertThat(result, is(startingFloor));

    }
    
    @Test
    public void testElevatorCanGoUp() {
        System.out.println("testElevatorCanGoUp");
       
        int currentFloor = 2;
        ElevatorService elevator = new ElevatorService(currentFloor);
        int nextFloor = currentFloor + 1;

        int result = elevator.up();
        
        assertThat(result, is(nextFloor));

    }
    
    @Test
    public void testElevatorCantGoPastTopFloor() {
        System.out.println("testElevatorCantGoPastTopFloor");
       
        int topFloor = 4;
        ElevatorService elevator = new ElevatorService(topFloor);

        int result = elevator.up();
        
        assertThat(result, is(topFloor));

    }
    
    @Test
    public void testElevatorCanGoDown() {
        System.out.println("testElevatorCanGoDown");
       
        int currentFloor = 2;
        ElevatorService elevator = new ElevatorService(currentFloor);
        int nextFloor = currentFloor - 1;

        int result = elevator.down();
        
        assertThat(result, is(nextFloor));

    }
    
    @Test
    public void testElevatorCantGoPastBottomFloor() {
        System.out.println("testElevatorCantGoPastBottomFloor");
       
        int bottomFloor = 0;
        ElevatorService elevator = new ElevatorService(bottomFloor);

        int result = elevator.down();
        
        assertThat(result, is(bottomFloor));

    }
    
}
