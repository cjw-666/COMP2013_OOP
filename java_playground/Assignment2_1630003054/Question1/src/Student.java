
public class Student {
	private String name;
	private Bag bag;

	public Student(String name, Bag bag) {
		this.name = name;
		this.bag = bag;
	}

	public String getName() {
		return name;
	}

	public Bag getBag() {
		return bag;
	}

	public void setBag(Bag bag) {
		this.bag = bag;
	}

	public String listPossessions() {
		return this.getName() + " has a " + this.bag.getDescr();
	}

	public static void testStudent() {
		String penColor = "blue";
		String bagOneColor = "green";
		String bagTwoColor = "red";
		String studentName = "Jack";
		Pen pen = new Pen(penColor); // new a blue pen that will put into the bag
		Bag bag1 = new Bag(bagOneColor, pen); // new a green bag and containing the blue pen
		Student student = new Student(studentName, bag1); // new a student name Jack
		System.out.println(student.getName().equals(studentName)); // check if the student name are equal
		System.out.println(student.getBag().equals(bag1)); // check if the bag object are equal
		Bag bag2 = new Bag(bagTwoColor, pen); // new a new red bag and containing the same red pen
		student.setBag(bag2); // change the student possession
		System.out.println(student.getBag().equals(bag2)); // check if the student's bag are the same
		System.out.println(student.listPossessions().equals("Jack has a red bag containing a blue pen")); // check the
																											// describe
																											// are the
																											// same
	}
}
