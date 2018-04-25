
public class Pen {
	String color;

	public Pen(String color) {
		this.color = color;
	}

	public String getDescr() {
		return this.color + " pen";
	}

	public static void testPen() {
		String penColor = "blue";
		Pen pen = new Pen(penColor);
		System.out.println(pen.getDescr().equals("blue pen"));
		// check if the getDescr result is correct
	}
}
