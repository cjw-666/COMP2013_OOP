
public class Rectangle extends Shape {

	private double width;
	private double length;

	public Rectangle(double x, double y, double width, double length) {
		super(x, y);
		this.width = width;
		this.length = length;
	}

	@Override
	public double area() {
		return width * length;
	}

	@Override
	public void resize(double newSize) {
		this.width = newSize;
		this.length = newSize;
	}
	
	public static void testRectangle() {
		Rectangle r = new Rectangle(0, 0, 4, 5);
		System.out.println(r.getX() == 0);
		System.out.println(r.getY() == 0);
		System.out.println(r.area() == 4*5);
		r.resize(5); // resize the width and length to 5
		System.out.println(r.area() == 5*5);
	}

}
