
public class GoldenDartFrog extends Animal {

	public GoldenDartFrog() {
		super("gold");
	}

	@Override
	public boolean isEdible() {
		return false; // GoldenDartFrog is not edible
	}

	public static void testGoldenDartFrog() {
		GoldenDartFrog g = new GoldenDartFrog();
		System.out.println(g.getColor().equals("gold"));
		System.out.println(g.isEdible() == false);
	}
}
