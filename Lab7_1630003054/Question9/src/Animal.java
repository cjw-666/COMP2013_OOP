public abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract int getLegs(); // leg number depending on animal

	public abstract boolean canFly(); // canFly depending on animal

	public static void testAnimal() {
		// You can't Instantiate the abstract class Animal, so no test can do.
		System.out.println("You can't instantiate the abstract class Animal");
	}
}
