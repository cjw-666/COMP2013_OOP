
public class Square extends Rectangle {

	public Square(double x, double y, double size) {
		super(x, y, size, size);
	}
	
	@Override
	public void resize(double width, double length) throws CannotResizeException {
		if (width == length) {
			super.resize(width);
		}else {
			throw new CannotResizeException("Cannot resize a square into a rectangle!");
		}
	}
	
	public static void testSquare() {
		Square s = new Square(0, 0, 5);
		System.out.println(s.getX() == 0);
		System.out.println(s.getY() == 0);
		System.out.println(s.area() == 5 * 5);
		s.resize(3); // resize the size to 3
		System.out.println(s.area() == 3 * 3);
		try {
			s.resize(1, 3); // try to change the size to a not equal value
		}catch(CannotResizeException e) {
			System.out.println(e.getMessage());
		}
		try {
			s.resize(1, 1); // try to change the size to a equal value
		}catch(CannotResizeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(s.area() == 1 * 1);
	}

}
