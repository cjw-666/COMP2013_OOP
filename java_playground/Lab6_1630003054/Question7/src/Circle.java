
public class Circle extends Shape {

	private double radius;
	
	// constructor for circle
	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	// Override area function to return the area of the circle
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2); // circle's area pi*r^2
	}
	
	@Override
	public String toString() { // method to return the Shape name
		return "Circle";
	}
	
	public static void testCircle() {
		Circle c = new Circle(0, 0, 1);
		System.out.println(c.getX() == 0.0);
		System.out.println(c.getY() == 0.0);
		System.out.println(c.area() == Math.PI);
	}
}
