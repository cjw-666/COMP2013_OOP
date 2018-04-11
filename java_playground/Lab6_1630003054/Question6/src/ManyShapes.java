import java.util.ArrayList;

public class ManyShapes {
	private ArrayList<Shape> allShapes;

	public ManyShapes() {
		allShapes = new ArrayList<Shape>(); // new a ArrayList Object will containing Shape object
	}

	public void addShape(Shape s) {
		allShapes.add(s);
	}

	public void listAllShapes() {
		for (int i = 0; i < allShapes.size(); i++) { // for every shapes in allShapes array
			if (allShapes.get(i) instanceof Shape) { // Print the Shape type according to the class of the shape
				if ((allShapes.get(i) instanceof Dot)) {
					System.out.println("Dot has area " + allShapes.get(i).area()); // print out the area
				}else if ((allShapes.get(i) instanceof Circle)) {
					System.out.println("Circle has area " + allShapes.get(i).area()); // print out the area
				}else if ((allShapes.get(i) instanceof Rectangle)) {
					System.out.println("Rectangle has area " + allShapes.get(i).area()); // print out the area
				}else if((allShapes.get(i) instanceof Square)) {
					System.out.println("Square has area " + allShapes.get(i).area()); // print out the area
				}else {
					System.out.println("Shape has area " + allShapes.get(i).area()); // print out the area
				}
			}
		}
	}

	public static void testManyShapes() {
		ManyShapes m = new ManyShapes();
		m.addShape(new Circle(1.2, 3.4, 4.0)); // Upcast from Circle to Shape.
		m.addShape(new Dot(1.2, 3.4)); // Upcast from Dot to Shape.
		m.addShape(new Rectangle(1.2, 3.4, 4.0, 5.0)); // Upcast from Rectangle to Shape.
		m.addShape(new Shape(1.2, 3.4));
		m.addShape(new Square(1.2, 3.4, 5.0)); // Upcast from Square to Shape.
		m.listAllShapes();
	}

}
