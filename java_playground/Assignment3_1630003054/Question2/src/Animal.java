
public class Animal {
	private String color;

	public Animal(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public boolean isEdible() {
		System.out.println("Do not eat this!"); // default message
		return false;
	}

	public static void testAnimal() {
		Animal a = new Animal("Black");
		System.out.println(a.getColor().equals("Black"));
		System.out.println(a.isEdible() == false);
	}
}
