
public class Bag {
	private String color;
	private Pen pen;
	private Food food;

	public Bag(String color, Pen pen) {
		this.color = color;
		this.pen = pen;
		Food food = new Food("cookies", 3);
		this.food = food;
	}

	public String getColor() {
		return this.color;
	}

	public Food getFood() {
		return food;
	}

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public String getDescr() {
		return this.color + " bag containing a " + this.pen.getDescr() + " and " + food.getAmount() + " Kg of "
				+ food.getName();
	}

	public static void testBag() {
		String penOneColor = "blue";
		String penTwoColor = "red";
		String bagColor = "green";
		Pen pen1 = new Pen(penOneColor); // new a blue pen that will put into bag
		Bag bag = new Bag(bagColor, pen1); // new a bag
		System.out.println(bag.getFood().getName().equals("cookies")); // check if the bag initially a cookies as food
		System.out.println(bag.getFood().getAmount() == 3); // check if the food's amount is 3 Kg
		System.out.println(bag.getColor().equals(bagColor));
		// check if the bag color is correct
		System.out.println(bag.getPen().equals(pen1));
		// check if the pen inside the bag are the same
		Pen pen2 = new Pen(penTwoColor); // new another red pen
		bag.setPen(pen2); // change the pen inside the bag
		System.out.println(bag.getPen().equals(pen2)); // check if the pen object are equal
		System.out.println(bag.getDescr().equals("green bag containing a red pen and 3 Kg of cookies")); // check if the
																											// describe
																											// are the
																											// same
	}
}
