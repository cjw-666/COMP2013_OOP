
public abstract class Bird extends Animal {

	private int numOfEggs;

	public Bird(String name, int numOfEggs) {
		super(name);
		this.numOfEggs = numOfEggs;
	}

	public int getNumOfEggs() {
		return numOfEggs;
	}

	@Override
	public int getLegs() {
		return 2; // All birds have two legs
	}

	@Override
	public abstract boolean canFly();

	public static void testBird() {
		// no test for bird class, because you can't Instantiate this class
	}

}
