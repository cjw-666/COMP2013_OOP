import java.util.*; // import all packages under java.util (in order to use Scanner)
public class ReverseString {

	public static void main(String[] args) {
		System.out.print("Please input a String: ");
		Scanner inputs = new Scanner(System.in); // create a Scanner call inputs
		
		String inStr = inputs.next();
		String inversedStr = ""; // a String to store inverse String
		
		int strLength = inStr.length(); // get the String length using the build in method
		
		for (int i = strLength; i > 0; i--) { // from the end of original String
			inversedStr = inversedStr + inStr.charAt(i - 1); // save the char to the new string
		}
		
		System.out.println(inversedStr); // print out the reverse String
		
		inputs.close();
	}
	
}
