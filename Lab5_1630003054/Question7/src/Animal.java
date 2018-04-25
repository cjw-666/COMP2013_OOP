public class Animal extends LivingThing {
	private double weight;
	
	public Animal(String name, double weight) {
		super(name);
		this.weight = weight;
	}
	
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public static void testAnimal() {
		Animal a = new Animal("Cute", 2.0);
		System.out.println(a.getName() == "Cute");
		System.out.println(a.getWeight() == 2.0);
		a.setWeight(3.0);
		// The name is still the same but the weight increased by 1.0:
		System.out.println(a.getName() == "Cute");
		System.out.println(a.getWeight() == 3.0);
	}
}
