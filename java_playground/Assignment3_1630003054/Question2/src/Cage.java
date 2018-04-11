
public class Cage {
	private Bird bird;
	
	public Cage(Bird bird) {
		this.bird = bird;
	}
	
	public Bird getBird() {
		return bird; // return the bird object
	}
	
	public static void testCage() {
		HoodedPitohui h1 = new HoodedPitohui();
		Cage c1 = new Cage(h1);
		HoodedPitohui h2 = (HoodedPitohui) c1.getBird();
		System.out.println(h1 == h2); // check if the objects are the same
	}
}
