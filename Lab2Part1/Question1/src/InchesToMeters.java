import java.util.*; // import all packages under java.util (in order to use Scanner)
public class InchesToMeters {
	
	public static void main(String[] args){
		Scanner inputs = new Scanner(System.in); // create a Scanner call inputs
		
		System.out.print("Input a value for inches: ");
		double inches = inputs.nextDouble(); // read in a double (Inches)
		
		double convertor = 0.0254; // 1 inch is 0.0254 meter
		
		System.out.println(inches + " inches is " + inches * convertor  + " meters");
		// Print out the converted result
		
		inputs.close(); // close the scanner inputs
	}
	
}