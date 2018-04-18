
public class Fish {

	private String name;
	private Fish friend;
	
	public Fish(String name, Fish friend) {
		this.name = name;
		this.friend = friend;
	}
	
	public String getName() {
		return name;
	}
	
	public Fish getFriend() {
		return friend;
	}
	
	public static void testFish() {
		// No fish object can be create
	}
}
