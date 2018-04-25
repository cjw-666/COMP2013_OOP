public class Elevator {

    private boolean doorOpen;
    private int floor;

    public Elevator(){
        doorOpen = true;
        floor = 1;
    }

    public boolean isDoorOpen(){
        return doorOpen;
    }

    public void openDoor(){
        doorOpen = true;

    }

    public void closeDoor(){
        doorOpen = false;
    }

    public int getFloor(){
        return this.floor;
    }

    public void moveUp() {
        if (isDoorOpen()){
            System.out.println("Cannot move up when the door is open");
        }else if(getFloor() >= 10){
            System.out.println("Cannot move higher than 10th floor");
        }else{
            floor += 1;
        }
    }

    public void moveDown() {
        if (isDoorOpen()){
            System.out.println("Cannot move down when the door is open");
        }else if(getFloor() <= 1){
            System.out.println("Cannot move below ground floor");
        }else{
            floor -= 1;
        }
    }

    public void moveToFloor(int floor) {
        if (isDoorOpen()){
            System.out.println("Cannot move to another floor when the door is open");
        }else if(floor > 10 || floor < 1){
            System.out.println("Cannot move to floor " + floor);
        }else if(getFloor() == floor) {
            System.out.println("Cannot move to the same floor");
        }else{
            this.floor = floor;
        }
    }

    public static void TestElevator(){
        Elevator buildingElevator = new Elevator();
        if (buildingElevator.isDoorOpen()){
            System.out.println("This Elevator's door is opened");
        }else{
            System.out.println("This Elevator's door is closed");
        }
        buildingElevator.closeDoor();
        if (buildingElevator.isDoorOpen()){
            System.out.println("This Elevator's door is opened");
        }else{
            System.out.println("This Elevator's door is closed");
        }
        buildingElevator.moveToFloor(10);
        System.out.println("The Elevator is currently at floor " + buildingElevator.getFloor());
        buildingElevator.moveUp();
        buildingElevator.moveToFloor(1);
        buildingElevator.openDoor();
        if (buildingElevator.isDoorOpen()){
            System.out.println("This Elevator's door is opened");
        }else{
            System.out.println("This Elevator's door is closed");
        }
        buildingElevator.moveUp();
        buildingElevator.closeDoor();
        if (buildingElevator.isDoorOpen()){
            System.out.println("This Elevator's door is opened");
        }else{
            System.out.println("This Elevator's door is closed");
        }
        buildingElevator.moveDown();
        buildingElevator.moveUp();
        System.out.println("The Elevator is currently at floor " + buildingElevator.getFloor());
        buildingElevator.moveDown();
        System.out.println("The Elevator is currently at floor " + buildingElevator.getFloor());
    }

}
