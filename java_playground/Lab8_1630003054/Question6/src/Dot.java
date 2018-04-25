
public class Dot extends Shape {

	public Dot(double x, double y) {
		super(x, y);
	}

	@Override
	public double area() {
		return 0; // a dot has no size
	}

	@Override
	public void resize(double newSize) throws CannotResizeException {
		throw new CannotResizeException("Cannot resize a dot!"); // throw new custom exception
	}

	public static void testDot() {
		Dot d = new Dot(0, 0);
		System.out.println(d.getX() == 0);
		System.out.println(d.getY() == 0);
		System.out.println(d.area() == 0);
		try {
			d.resize(0);
		} catch (CannotResizeException e) {
			System.out.println(e.getMessage()); // catch the new custom exception
		}
	}

}
