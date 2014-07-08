package kata;

import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ElevatorManagerTest {
    
    public ElevatorManagerTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCallElevatorMovesUpToRider() {
        System.out.println("testCallElevatorMovesUpToRider");

        IElevatorService elevatorService = new ElevatorService();
        ElevatorManager elevatorManager = new ElevatorManager(elevatorService);
        
        int callerFloor = 4;
        int finalFloor = elevatorManager.callElevator(callerFloor);
        
        assertThat(finalFloor, is(callerFloor));
        
    }
    
    @Test
    public void testCallElevatorMovesDownToRider() {
        System.out.println("testCallElevatorMovesDownToRider");

        IElevatorService elevatorService = new ElevatorService();
        ElevatorManager elevatorManager = new ElevatorManager(elevatorService);
        
        // call elevator up
        int priorFloor = 4;
        int destinationFloor = elevatorManager.callElevator(priorFloor);
        
        // call elevator back down
        int callerFloor = 1;
        int finalFloor = elevatorManager.callElevator(callerFloor);
        
        assertThat(finalFloor, is(callerFloor));
        
    }
    
}
