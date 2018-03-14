import java.util.*; // import all packages under java.util (in order to use Scanner)
import java.lang.Math; // import Math package for power function
public class SumOfDigits {
	
	public static void main(String[] args){
	Scanner inputs = new Scanner(System.in); // create a Scanner call inputs
	
	System.out.print("Input an integer between 0 and 1000: ");
	int userInput = inputs.nextInt();
	while (userInput > 1000 || userInput < 0) { // if the input is greater than 1000 or less than 0
		System.out.print("Input an integer between 0 and 1000: "); // require user to input again
		userInput = inputs.nextInt();
	}
	
	int digitsSum = 0; // Identifier to store the digits sum
	
	for(int i = 1; i <= 4; i++) { // extract every digit, and sum them up
		digitsSum += (userInput % Math.pow(10, i) - userInput % Math.pow(10, i - 1)) / Math.pow(10, i - 1);
	}
	
	System.out.println("The sum of all digits in " + userInput + " is " + digitsSum); // print out the result
	inputs.close();
	}
	
}