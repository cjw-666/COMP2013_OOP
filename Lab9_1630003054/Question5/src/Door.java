
public class Door {
	private boolean isOpen;

	public Door() {
		this.isOpen = false;
		// The default state of a door is closed
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void open() {
		this.isOpen = true;
	}

	public void close() {
		this.isOpen = false;
	}

	public static void testDoor() {
		Door d = new Door();
		System.out.println(d.isOpen() == false);
		d.open();
		System.out.println(d.isOpen() == true);
		d.close();
		System.out.println(d.isOpen() == false);
	}

}
