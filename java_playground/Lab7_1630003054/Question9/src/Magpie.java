
public class Magpie extends Bird {
	
	public Magpie(String name) {
		super(name, 6);
		// Magpies always have 6 eggs
	}

	@Override
	public boolean canFly() {
		return true;
	}
	
	@Override
	public boolean isDangerous() {
		return false;
	}
	
	public static void testMagpie() {
		Flyer m = new Magpie("Magpie");
		System.out.println(m.getName().equals("Magpie"));
		System.out.println(m.canFly() == true);
		System.out.println(m.isDangerous() == false);
	}

}
