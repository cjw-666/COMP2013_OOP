public class Ostrich extends Bird {

	public Ostrich(String name) {
		super(name, 10);
		// Ostriches always have 10 eggs
	}

	@Override
	public boolean canFly() {
		return false;
	}
	
	public static void testOstrich() {
		Ostrich o = new Ostrich("Ostrich");
		System.out.println(o.getName().equals("Ostrich"));
		System.out.println(o.getLegs() == 2);
		System.out.println(o.getNumOfEggs() == 10);
		System.out.println(o.canFly() == false);
	}

}
