
public class Rectangle extends Shape {

	private double width;
	private double length;

	// Constructor for Rectangle
	public Rectangle(double x, double y, double width, double length) {
		super(x, y);
		this.length = length;
		this.width = width;
	}
	
	// area function for rectangle
	@Override
	public double area() {
		return width * length;
	}

	public static void testRectangle() {
		Rectangle r = new Rectangle(0, 0, 5, 10);
		System.out.println(r.getX() == 0);
		System.out.println(r.getY() == 0);
		System.out.println(r.area() == 5 * 10);
	}
}
