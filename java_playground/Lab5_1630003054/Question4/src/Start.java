public class Start {
	public static void main(String[] args) {
		System.out.println("------> testAnimal <------");
		Animal.testAnimal();
		System.out.println("------> testStudent <------");
		Student.testStudent();
		System.out.println("------> System Test <------");
		Animal a = new Animal("Roar", 5.0);
		Student s = new Student("Marty", a); // A student name Marty own a animal call Roar
		System.out.println(s.getName() == "Marty");
		System.out.println(s.getPet() == a);
	}
}
