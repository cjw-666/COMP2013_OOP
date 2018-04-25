
public class Square extends Rectangle {

	public Square(double x, double y, double size) {
		super(x, y, size, size);
	}
	
	public static void testSquare() {
		Square s = new Square(0, 0, 5);
		System.out.println(s.getX() == 0);
		System.out.println(s.getY() == 0);
		System.out.println(s.area() == 5 * 5);
		s.resize(3); // resize the size to 3
		System.out.println(s.area() == 3 * 3);
	}

}
