
public class Jellyfish implements Swimmer{
	private String name;

	public Jellyfish(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Swimmer getFriend() {
		return this; // return itself
	}

	public static void testJellyfish() {
		Jellyfish j = new Jellyfish("Blob");
		System.out.println(j.getName() == "Blob");
		// The friend of the jellyfish is the jellyfish itself:
		System.out.println(j.getFriend() == j);
	}

}
