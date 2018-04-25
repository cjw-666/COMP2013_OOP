
public class Square extends Rectangle {

	public Square(double x, double y, double size) {
		super(x, y, size, size);
		// TODO Auto-generated constructor stub
	}

	// no need for new area method
	
	public static void testSquare() {
		Square s = new Square(0, 0, 5);
		System.out.println(s.getX() == 0);
		System.out.println(s.getY() == 0);
		System.out.println(s.area() == 5 * 5);
	}
}
