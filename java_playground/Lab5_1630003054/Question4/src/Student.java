
public class Student {
	private String name;
	private Animal pet;
	
	public Student(String name, Animal pet) {
		this.name = name;
		this.pet = pet;
	}
	
	public String getName() {
		return name;
	}
	
	public Animal getPet() {
		return pet;
	}
	
	public static void testStudent() {
		Animal a = new Animal("Cute", 2.0);
		Student s1 = new Student("Alex", a); // A student name Alex with a pet name Meow
		System.out.println(s1.getName() == "Alex");
		System.out.println(s1.getPet() == a);
		Cat c = new Cat("Meow", 2.0);
		Student s2 = new Student("Bob", c); // A student name Alex with a pet name Meow
		System.out.println(s2.getName() == "Bob");
		System.out.println(s2.getPet() == c);
	}
}
