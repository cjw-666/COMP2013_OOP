public class Ostrich extends Bird {

	public Ostrich(String name) {
		super(name, 10);
		// Ostriches always have 10 eggs
	}

	@Override
	public boolean canFly() {
		return false;
	}
	
	@Override
	public boolean isDangerous() {
		return true;
	}
	
	public static void testOstrich() {
		Flyer o = new Ostrich("Ostrich");
		System.out.println(o.getName().equals("Ostrich"));
		System.out.println(o.canFly() == false);
		System.out.println(o.isDangerous() == true);
	}

}
