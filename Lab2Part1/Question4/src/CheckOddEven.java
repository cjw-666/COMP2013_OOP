import java.util.*; // import all packages under java.util (in order to use Scanner)
public class CheckOddEven {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in); // create a Scanner call inputs
		
		System.out.print("Please input an integer: ");
		int number = inputs.nextInt(); // read in an integer and assign it to number
		
		if (number % 2 == 0) { // if the input number can be divide by 2 with no remainder(even number)
			System.out.println("Even Number");
		}else { /* otherwise it is an odd number */
			System.out.println("Odd Number");
		}
		
		System.out.println("BYE!"); // this always execute no matter it is an odd number or even number
		inputs.close();
	}

}
