
public class Cat {
	private String color;
	private int weight;

	public Cat(String color, int weight) {
		this.color = color;
		if (weight > 0) { // weight must be strictly positive
			this.weight = weight;
		} else {
			this.weight = 1;
		}
	}

	public int getWeight() {
		return weight;
	}

	public boolean setWeight(int weight) {
		if (weight > 0) { // weight must be strictly positive
			this.weight = weight;
			return true;
		} else { // or nothing will be change
			return false;
		}
	}

	public String getDescr() {
		return color + " cat weighing " + weight + " Kg";
	}

	public static void testCat() {
		String catColor = "black";
		int catWeight1 = 2;
		int catWeight2 = 3;
		int invalidCatWeight = -1; // this is a invalid weight
		Cat cat1 = new Cat(catColor, catWeight1); // new a black cat weight 2 Kg
		System.out.println(cat1.getDescr().equals("black cat weighing 2 Kg"));
		System.out.println(cat1.getWeight() == catWeight1); // check if the init weight is correct
		System.out.println(cat1.setWeight(catWeight2) == true); // change the weight to 3 Kg
		System.out.println(cat1.getWeight() == catWeight2); // check if the new weight is correct
		System.out.println(cat1.setWeight(invalidCatWeight) == false); // change the weight to -1 Kg (Invalid)
		System.out.println(cat1.getWeight() != invalidCatWeight); // the weight should not be changed
		Cat cat2 = new Cat(catColor, invalidCatWeight); // new cat should be a black cat and weight 1 Kg
		System.out.println(cat2.getDescr().equals("black cat weighing 1 Kg"));
	}
}
