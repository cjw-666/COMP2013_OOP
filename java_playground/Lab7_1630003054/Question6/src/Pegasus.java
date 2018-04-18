
public class Pegasus extends Bird {

	public Pegasus(String name) {
		super(name, 0);
	}
	
	@Override
	public int getNumOfEggs() {
		System.out.println("Pegasi do not lay eggs!");
		return 0;
	}
	
	@Override
	public int getLegs() {
		return 4; // Pegasus have 4 legs
	}

	@Override
	public boolean canFly() {
		return true; // Pegasi can fly
	}
	
	public static void testPegasus() {
		Pegasus p = new Pegasus("Pegasus");
		System.out.println(p.getName().equals("Pegasus"));
		System.out.println(p.getLegs() == 4);
		System.out.println(p.getNumOfEggs() == 0);
		System.out.println(p.canFly() == true);
	}

}
