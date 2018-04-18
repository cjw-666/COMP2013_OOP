
public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public int getLegs() {
		return 4; // Dog have four legs
	}

	@Override
	public boolean canFly() {
		return false; // Dog cannot fly
	}
	
	public static void testDog() {
		Dog d = new Dog("Apple");
		System.out.println(d.getName().equals("Apple"));
		System.out.println(d.getLegs() == 4);
		System.out.println(d.canFly() == false);
	}

}
