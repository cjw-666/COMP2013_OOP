
public class Airplane implements Flyer {
	
	private String name;
	
	public Airplane(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean canFly() {
		return true;
	}
	
	public static void testAirplane() {
		Flyer a = new Airplane("Airplane");
		System.out.println(a.getName().equals("Airplane"));
		System.out.println(a.canFly() == true);
	}

}
