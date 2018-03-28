
public class Chicken {
	private double weight;
	private boolean sleeping;
	
	public Chicken(double weight) { // Constructor, pass in a weight
		this.weight = weight;
		this.sleeping = true; // initially sleeping
	}
	
	public double getWeight() {
		return weight;
	}
	
	public boolean isSleeping() {
		return sleeping;
	}
	
	public void fallAsleep() {
		sleeping = true; // set sleeping value to true
	}
	
	public void wakeUp() {
		sleeping = false; // set sleeping value to false
	}
	
	public static void testChicken() {
		Chicken c = new Chicken(2.3);
		System.out.println(c.getWeight() == 2.3);
		System.out.println(c.isSleeping() == true);
		c.wakeUp();
		System.out.println(c.isSleeping() == false);
		c.wakeUp(); // should do nothing because the chicken is already awake
		System.out.println(c.isSleeping() == false);
		c.fallAsleep();
		System.out.println(c.isSleeping() == true);
		c.fallAsleep(); // should do nothing because the chicken is already sleeping
		System.out.println(c.isSleeping() == true);
	}
}
