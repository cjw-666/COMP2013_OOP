
public class Dot extends Shape {

	public Dot(double x, double y) {
		super(x, y);
	}

	@Override
	public double area() {
		return 0; // a dot has no size
	}

	@Override
	public void resize(double newSize) throws Exception {
		throw new Exception("Cannot resize a dot!");
	}

	public static void testDot() {
		Dot d = new Dot(0, 0);
		System.out.println(d.getX() == 0);
		System.out.println(d.getY() == 0);
		System.out.println(d.area() == 0);
		try {
			d.resize(0);
		} catch (Exception e) {
			System.out.println(e.getMessage()); // catch the exception and print out the error message
		}
	}

}
