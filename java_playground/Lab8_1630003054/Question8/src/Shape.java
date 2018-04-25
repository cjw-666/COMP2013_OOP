
public abstract class Shape {

	private double x;
	private double y;

	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void move(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}

	public abstract double area();

	public abstract void resize(double newSize) throws CannotResizeException, BadRadiusException; // use new custom exception

	public static void testShape() {
		// nothing can do with the abstract class
	}
}
