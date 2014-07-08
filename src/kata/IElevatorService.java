package kata;

public interface IElevatorService {
 
    public int getFloor();
    public int up();
    public int down();
    public void closeDoors();
    public void openDoors();
    public Integer[] getFloors();

}
