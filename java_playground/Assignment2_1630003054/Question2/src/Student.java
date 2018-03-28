
public class Student {
	private String name;
	private Bag bag;
	private Cat cat;

	public Student(String name, Bag bag, Cat cat) {
		this.name = name;
		this.bag = bag;
		this.cat = cat;
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
	
	public void feedCat() {
		if (bag.getFood().getAmount() > 0) {
			bag.getFood().addAmount(-1); // feed the cat the food (1 Kg per time)
			cat.setWeight(cat.getWeight() + 1); // cat's weight are increasing
		}
	}

	public String listPossessions() {
		return this.getName() + " has a " + this.cat.getDescr() + " and a " + this.bag.getDescr();
	}

	public static void testStudent() {
		String penColor = "blue";
		String bagOneColor = "green";
		String bagTwoColor = "red";
		String studentName = "Jack";
		Pen pen = new Pen(penColor); // new a blue pen that will put into the bag
		Bag bag1 = new Bag(bagOneColor, pen); // new a green bag and containing the blue pen
		Cat cat = new Cat("black", 2); // new a black 2 Kg cat
		Student student = new Student(studentName, bag1, cat); // new a student name Jack
		System.out.println(student.getName().equals(studentName)); // check if the student name are equal
		System.out.println(student.getBag().equals(bag1)); // check if the bag object are equal
		Bag bag2 = new Bag(bagTwoColor, pen); // new a new red bag and containing the same red pen
		student.setBag(bag2); // change the student possession
		System.out.println(student.getBag().equals(bag2)); // check if the student's bag are the same
		System.out.println(student.listPossessions()
				.equals("Jack has a black cat weighing 2 Kg and a red bag containing a blue pen and 3 Kg of cookies"));
		student.feedCat(); // feed the Cat
		System.out.println(student.bag.getFood().getAmount() == 2); // check if the food amount is correct
		System.out.println(student.cat.getWeight() == 3); // check if the cat weight is correct
		// check if the describe are the same
	}
}
