
public class Food {
	private String name;
	private int amount;

	public Food(String name, int amount) {
		this.name = name;
		if (amount > 0) { // must be positive
			this.amount = amount;
		} else {
			this.amount = 5; // negative amount will consider as 5 Kg
		}

	}

	public int getAmount() {
		return amount;
	}

	public void addAmount(int amount) {
		if (this.amount + amount <= 0) {
			this.amount = 0; // never go below zero
		} else {
			this.amount += amount;
		}
	}

	public String getName() {
		return name;
	}

	public static void testFood() {
		String foodName1 = "cake";
		String foodName2 = "cookie";
		Food food1 = new Food(foodName1, 3); // new a food call cake, amount is 3
		System.out.println(food1.getName().equals(foodName1)); // check if the name are equal
		System.out.println(food1.getAmount() == 3); // get the food amount
		food1.addAmount(2); // add 2 Kg to the amount
		System.out.println(food1.getAmount() == 5);
		food1.addAmount(-6); // add -6 Kg to the amount
		System.out.println(food1.getAmount() == 0); // should go to 0 Kg
		Food food2 = new Food(foodName2, -2); // new a food call cookie, amount is -2 (invalid)
		System.out.println(food2.getName().equals(foodName2));
		System.out.println(food2.getAmount() == 5); // check if the amount will set to 5 or not
	}
}
