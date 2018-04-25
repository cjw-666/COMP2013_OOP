
public class Circle extends Shape {

	private double radius;

	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius; // A circle's area is Pi times radius squared
	}

	@Override
	public void resize(double newRadius) {
		this.radius = newRadius;
	}

	public static void testCircle() {
		Circle c = new Circle(0, 0, 5);
		System.out.println(c.getX() == 0);
		System.out.println(c.getY() == 0);
		System.out.println(c.area() == Math.PI * 5 * 5);
		c.resize(3); // change the radius to 3
		System.out.println(c.area() == Math.PI * 3 * 3);
	}

}
