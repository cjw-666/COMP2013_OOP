
public class Car {
	private String name;
	private Door[] doors;

	public Car(String name, int numberOfDoors) throws BadCarException {
		this.name = name;
		if (numberOfDoors < 1) {
			throw new BadCarException("A car must have at least one door!");
		} else {
			this.doors = new Door[numberOfDoors];
			for (int i = 0; i < numberOfDoors; i++) {
				doors[i] = new Door();
			}
		}
	}

	public void listDoors() {
		for (Door door : doors) {
			if (door.isOpen()) {
				System.out.println(this.name + ": door is open");
			} else {
				System.out.println(this.name + ": door is closed");
			}

		}
	}

	public int countOpenDoors() {
		int i = 0;
		for (Door door : doors) {
			if (door.isOpen()) {
				i++;
			}
		}
		return i;
	}

	public void openOneDoor(int doorNumber) throws BadDoorException {
		int doorsNumber = doors.length;
		if (doorNumber > 0 && doorNumber <= doorsNumber) {
			doors[doorNumber - 1].open();
		} else {
			throw new BadDoorException("Door " + doorNumber + " does not exist!");
		}
	}

	public void changeAllDoors() {
		for (Door door : doors) {
			if (door.isOpen()) {
				door.close();
			} else {
				door.open();
			}

		}
	}
	
	public void replaceDoors(int doorNumber) throws BadDoorException  {
		int doorsNumber = doors.length;
		if (doorNumber > 0 && doorNumber <= doorsNumber) {
			doors[doorNumber - 1] = new Door();
		} else {
			throw new BadDoorException("Door " + doorNumber + " does not exist!");
		}
	}
	
	public void replaceAllDoors() {
		for (int i = 0; i < doors.length; i++) {
			doors[i] = new Door();
		}
	}
	
	public void replaceManyDoors(int numOfDoorsToReplace) {
		for (int i = 0; i < numOfDoorsToReplace; i++) {
			doors[i] = new Door();
		}
	}
	
	public void expandCar() {
		// this method will add two door to the existing car
		Door[] tempDoors = new Door[this.doors.length + 2];
		int i = 0;
		for(i = 0; i < this.doors.length; i++) {
			tempDoors[i] = this.doors[i]; // copy every objects to the new array object
		}
		for(int j = 0; j < 2; j++) {
			tempDoors[i+j] = new Door();
		}
		this.doors = tempDoors; // replace the original array with the new temperate Array
	}

	public static void testCar() {
		// try to create a car with 0 door
		try {
			Car c1 = new Car("Aston Martin", 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// try to create a car with 0 door
		try {
			Car c2 = new Car("Tesla", 2);
			c2.listDoors();
			System.out.println("There are " + c2.countOpenDoors() + " open door(s)");
			// try to open a not exist door
			try {
				c2.openOneDoor(0);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			c2.listDoors();
			c2.openOneDoor(1);
			System.out.println("There are " + c2.countOpenDoors() + " open door(s)");
			c2.listDoors();
			c2.changeAllDoors();
			System.out.println("There are " + c2.countOpenDoors() + " open door(s)");
			c2.listDoors();
			// door no.2 is opened, the replaced door should be closed
			c2.replaceDoors(2);
			System.out.println("There are " + c2.countOpenDoors() + " open door(s)");
			c2.listDoors();
			// try to replace a not exist door
			try {
				c2.replaceDoors(0);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			c2.changeAllDoors();
			c2.listDoors();
			c2.replaceAllDoors();
			c2.listDoors();
			try {
				c2.replaceManyDoors(4);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			c2.listDoors();
			c2.expandCar(); // expand the car
			c2.listDoors();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
