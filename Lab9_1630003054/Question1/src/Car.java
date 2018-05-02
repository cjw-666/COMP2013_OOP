
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
			c2.openOneDoor(2);
			System.out.println("There are " + c2.countOpenDoors() + " open door(s)");
			c2.listDoors();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
