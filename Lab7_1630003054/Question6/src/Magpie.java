
public class Magpie extends Bird {
	
	public Magpie(String name) {
		super(name, 6);
		// Magpies always have 6 eggs
	}

	@Override
	public boolean canFly() {
		return true;
	}
	
	public static void testMagpie() {
		Magpie m = new Magpie("Magpie");
		System.out.println(m.getName().equals("Magpie"));
		System.out.println(m.getLegs() == 2);
		System.out.println(m.getNumOfEggs() == 6);
		System.out.println(m.canFly() == true);
	}

}
