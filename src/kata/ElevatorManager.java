package kata;

public class ElevatorManager {
    
    private final IElevatorService _elevatorService;
    private final String messageElevatorCall = "Call sent to Elevator";
    
    public ElevatorManager(IElevatorService elevatorService){
    
      this._elevatorService = elevatorService;
    
    }
    
    public int callElevator(int currentFloor) {
        
        System.out.println(messageElevatorCall);
        
        int moves = _elevatorService.getFloor() - currentFloor;
        
        _elevatorService.closeDoors();
        if(moves > 0) {
            
            System.out.println("Elevator is currently on floor: " + _elevatorService.getFloor());
            for(int i = 0; i < moves; i++) {
                
                _elevatorService.down();
                int floorNum = _elevatorService.getFloor();
                System.out.println("Elevator moves down to floor: " + floorNum);
                
            }
            
        } else {
            
            System.out.println("Elevator is currently on floor: " + _elevatorService.getFloor());
            for(int i = 0; i > moves; i--) {
                
                _elevatorService.up();
                int floorNum = _elevatorService.getFloor();
                System.out.println("Elevator moves up to floor: " + floorNum);
                
            }
            
        }
        _elevatorService.openDoors();
        
        return _elevatorService.getFloor();
        
    }
    
}
