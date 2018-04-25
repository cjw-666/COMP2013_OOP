public class Start {
	public static void main(String[] args) {
		Chicken.testChicken();
		Chicken chi = new Chicken(2.2); // new a chicken
		System.out.println(check(chi) == "sweet dreams"); // original status is sleeping
		chi.wakeUp(); // let it wake up
		System.out.println(check(chi) == "need coffee");
	}
	
	public static String check(Chicken chicken) { //  check must be static if you want to call it from a static method.
		// or you have to new a Start Object
		if(chicken.isSleeping()) { // return string according to sleeping status
			return "sweet dreams";
		}else {
			return "need coffee";
		}
	}
}
