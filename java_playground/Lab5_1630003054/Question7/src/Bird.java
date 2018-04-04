public class Bird extends Animal {
	private double altitude;
	
	public Bird(String name, double weight, double altitude) {
		super(name, weight);
		this.altitude = altitude;
	}
	
	public double getAltitude() {
		return altitude;
	}
	
	public static void testBird() {
		Bird b = new Bird("Tweet", 1.0, 1.0);
		System.out.println(b.getName() == "Tweet");
		System.out.println(b.getWeight() == 1.0);
		System.out.println(b.getAltitude() == 1.0);
	}
	
}
