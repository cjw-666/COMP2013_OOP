import java.util.Scanner;

public class TestPalindrome {
	public static void main(String[] args) {
		System.out.print("Enter a String: ");
		Scanner input = new Scanner(System.in);
		String inStr = input.nextLine(); // read string until '\n'
		String lowStr = inStr.toLowerCase(); // convert to lowercase
		String onlyChar = lowStr.replaceAll("[^A-Za-z]", ""); // delete all non letter characters using regular expression
		//[^A-Za-z]: Match any character is not in the set A-Z and a-z
		int fIdx = 0, bIdx = onlyChar.length() - 1; // forward & backward indexes
		char fChar, bChar; // forward & backward characters
		while (fIdx < bIdx) {
			fChar = onlyChar.charAt(fIdx);
			bChar = onlyChar.charAt(bIdx);
			if (fChar != bChar) {
				System.out.println("\"" + inStr + "\" is not a palindrome");
				return;
			} else { // match, change index
				fIdx++;
				bIdx--;
			}
		}
		System.out.println("\"" + inStr + "\" is a palindrome");
		input.close(); // close the Scanner
	}
}
