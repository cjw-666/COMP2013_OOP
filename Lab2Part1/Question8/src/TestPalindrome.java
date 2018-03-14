import java.util.*; // import all packages under java.util (in order to use Scanner)
public class TestPalindrome {

	public static void main(String[] args) {
		System.out.print("Please input a String: ");
		Scanner inputs = new Scanner(System.in); // create a Scanner call inputs
		
		String inStr = inputs.next();
		int strLength = inStr.length(); // get the String length
		String testStr = inStr.toLowerCase(); // convert the string to lowercase
		boolean isPalindrome = true; // consider the string is a palindrome at first
		// Declare two variable in for loop, use for check if the input String is a palindrome
		for (int forward = 0, backward = strLength - 1; forward < strLength; forward++, backward--) {
			if (testStr.charAt(forward) != testStr.charAt(backward)) { // if the char not match
				isPalindrome = false; // this string is not a palindrome
				break; // break from the loop, save some time
			}
		}
		if (isPalindrome) {
			System.out.print(inStr + " is a palindrome!");
		}else {
			System.out.print(inStr + " is not a palindrome!");
		}
		inputs.close();
	}
}
