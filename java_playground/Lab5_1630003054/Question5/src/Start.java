public class Start {
	public static void main(String[] args) {
		System.out.println("------> testBird <------");
		Bird.testBird();
		System.out.println("------> testStudent <------");
		Student.testStudent();
		System.out.println("------> System Test <------");
		Bird b = new Bird("Tweet", 1.0, 1.0);
		Student s = new Student("Marty", b); // A student name Marty own a Bird call Roar
		System.out.println(s.getName() == "Marty");
		System.out.println(s.getPet().getWeight() == 1.0);
	}
}
