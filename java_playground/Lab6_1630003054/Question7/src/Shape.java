
public class Shape {
	private double x;
	private double y;
	
	// Constructor
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
	
	public double area() {
		// an unknown shape has an unknown area
		System.out.println("An unknown shape has an unknown area!");
		return -1.0;
	}
	
	public String toString() { // method to return the Shape name
		return "Shape";
	}
	
	public static void testShape() {
		Shape s = new Shape(1.0, 2.0);
		System.out.println(s.getX() == 1.0);
		System.out.println(s.getY() == 2.0);
		System.out.println(s.area() == -1.0);
	}
}
