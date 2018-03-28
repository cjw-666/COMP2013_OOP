
public class Bag {
	private String color;
	private Pen pen;

	public Bag(String color, Pen pen) {
		this.color = color;
		this.pen = pen;
	}

	public String getColor() {
		return this.color;
	}

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public String getDescr() {
		return this.color + " bag containing a " + this.pen.getDescr();
	}

	public static void testBag() {
		String penOneColor = "blue";
		String penTwoColor = "red";
		String bagColor = "green";
		Pen pen1 = new Pen(penOneColor); // new a blue pen that will put into bag
		Bag bag = new Bag(bagColor, pen1); // new a bag
		System.out.println(bag.getColor().equals(bagColor));
		// check if the bag color is correct
		System.out.println(bag.getPen().equals(pen1));
		// check if the pen inside the bag are the same
		Pen pen2 = new Pen(penTwoColor); // new another red pen
		bag.setPen(pen2); // change the pen inside the bag
		System.out.println(bag.getPen().equals(pen2)); // check if the pen object are equal
		System.out.println(bag.getDescr().equals("green bag containing a red pen")); // check if the describe are the
																						// same
	}
}
