public class Start {
	public static void main(String[] args) {
		System.out.println("------> testBird <------");
		Chicken.testChicken();
		System.out.println("------> System Test <------");
		Chicken c = new Chicken("Apple");
		Student s = new Student("Marty", c); // A student name Marty own a Chicken call Apple
		System.out.println(s.getName() == "Marty");
		System.out.println(s.getPet().getWeight() == 5.0);
	}
}
