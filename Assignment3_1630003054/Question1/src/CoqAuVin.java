
public class CoqAuVin extends Chicken {

	public CoqAuVin() {
		super("brown", 0); // CoqAuVin is brown no feather chicken
	}

	public static void testCoqAuVin() {
		CoqAuVin cav = new CoqAuVin();
		System.out.println(cav.getColor().equals("brown"));
		System.out.println(cav.getNumOfFeathers() == 0);
		System.out.println(cav.isEdible() == true);
	}
}
