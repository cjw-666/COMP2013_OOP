
public class Student {
	private String name;
	private Cat pet;
	
	public Student(String name, Cat pet) {
		this.name = name;
		this.pet = pet;
	}
	
	public String getName() {
		return name;
	}
	
	public Cat getPet() {
		return pet;
	}
	
	public static void testStudent() {
		Cat c = new Cat("Meow", 2.0);
		Student s = new Student("Alex", c); // A student name Alex with a pet name Meow
		System.out.println(s.getName() == "Alex");
		System.out.println(s.getPet() == c);
	}
}
