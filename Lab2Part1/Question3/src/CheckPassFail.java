import java.util.*; // import all packages under java.util (in order to use Scanner)
public class CheckPassFail {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in); // create a Scanner call inputs
		
		System.out.print("Please input an integer: ");
		int mark = inputs.nextInt(); // read in an integer and assign it to mark
		
		if (mark >= 50) { // check if mark is greater than or equal to 50
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		System.out.println("DONE"); // This always execute after the if
		inputs.close();
	}

}
