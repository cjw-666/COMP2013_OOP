
public class Fish implements Swimmer{

	private String name;
	private Swimmer friend;
	
	public Fish(String name, Swimmer friend) { // Fish's friend can be Jellyfish & Fish
		this.name = name;
		this.friend = friend;
	}
	
	public String getName() {
		return name;
	}
	
	public Swimmer getFriend() {
		return friend;
	}
	
	public static void testFish() {
		Jellyfish jf = new Jellyfish("Jelly");
		Fish f = new Fish("Fish", jf);
		System.out.println(f.getName().equals("Fish"));
		System.out.println(f.getFriend() == jf);
	}
}
