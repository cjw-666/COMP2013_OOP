
public class HoodedPitohui extends Bird {

	public HoodedPitohui() {
		super("orange-black", 4000); // Hooded Pitohui is orango-black bird with 4000 feather
	}

	@Override
	public boolean isEdible() {
		return false;
	}

	public static void testHoodedPitohui() {
		HoodedPitohui hp = new HoodedPitohui();
		System.out.println(hp.getColor().equals("orange-black"));
		System.out.println(hp.getNumOfFeathers() == 4000);
		System.out.println(hp.isEdible() == false);
	}
}
