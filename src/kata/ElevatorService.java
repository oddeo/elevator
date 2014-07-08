package kata;

import java.util.Arrays;

public class ElevatorService implements IElevatorService {
    
    private static final Integer[] _floors = {0,0,0,0,0};
    private static final String _messageCloseDoors = "Close Elevator Doors";
    private static final String _messageOpenDoors = "Open Elevator Doors";
    
    public ElevatorService() {
    
        setFloor(0);
    
    }
    
    public ElevatorService(int floorNumber) {
    
        setFloor(floorNumber);
    
    }
    
    @Override
    public int getFloor () {
        
        // 1 is the elevator's position in the array
        int index = Arrays.asList(getFloors()).indexOf(1);
        return index;
        
    }
    
    @Override
    public int up () {
        
        int currentFloor = Arrays.asList(_floors).indexOf(1);
        return setFloor(currentFloor + 1);
        
    }
    
    @Override
    public int down () {
        
        int currentFloor = Arrays.asList(_floors).indexOf(1);
        return setFloor(currentFloor - 1);
        
    }
    
    @Override
    public void closeDoors() {
        
        System.out.println(_messageCloseDoors);
        
    }
    
    @Override
    public void openDoors() {
        
        System.out.println(_messageOpenDoors);
        
    }
    
    @Override
    public Integer[] getFloors() {
        
        return _floors;
        
    }
    
    private int setFloor(int floorNumber) {
        
        if(floorNumber >= _floors.length) { return _floors.length -1; }
        
        if(floorNumber < 0) { return 0; }
        
        // find the current floor that the elevator is on and 0 it out
        int currentFloor = Arrays.asList(_floors).indexOf(1);
        
        if(currentFloor > -1) {
         
            _floors[currentFloor] = 0;
            
        }
        
        _floors[floorNumber] = 1;

        return floorNumber;
        
    }
    
    
    
}
