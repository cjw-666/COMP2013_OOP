
public class Chicken extends Bird {

	public Chicken(String color, int numOfFeathers) {
		super(color, numOfFeathers);
	}

	public Chicken(String color) {
		this(color, 8000); // this constructor use the first constructor
	}

	public static void testChicken() {
		Chicken c1 = new Chicken("Gray");
		System.out.println(c1.getColor().equals("Gray"));
		System.out.println(c1.isEdible() == true);
		System.out.println(c1.getNumOfFeathers() == 8000);

		Chicken c2 = new Chicken("blue", 1000); // use the second constructor to new a object
		System.out.println(c2.getColor().equals("blue"));
		System.out.println(c2.isEdible() == true);
		System.out.println(c2.getNumOfFeathers() == 1000);
	}
}
