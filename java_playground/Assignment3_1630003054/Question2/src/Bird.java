
public class Bird extends Animal {

	private int numOfFeathers; // extra private int variable

	public Bird(String color, int numOfFeathers) {
		super(color);
		this.numOfFeathers = numOfFeathers;
	}

	@Override
	public boolean isEdible() {
		return true;
	}

	public int getNumOfFeathers() {
		return numOfFeathers;
	}

	public static void testBird() {
		Bird b = new Bird("Yellow", 10000);
		System.out.println(b.getColor().equals("Yellow"));
		System.out.println(b.getNumOfFeathers() == 10000);
		System.out.println(b.isEdible() == true);
	}
}
