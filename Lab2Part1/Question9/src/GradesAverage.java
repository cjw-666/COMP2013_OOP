import java.util.*; // import all packages under java.util (in order to use Scanner)
public class GradesAverage {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in); // create a Scanner call inputs
		
		System.out.print("Enter the number of students: ");
		
		int studentNumber = inputs.nextInt();
		int[] studentsScore = new int[studentNumber]; // Create a int array according to user inputs
		
		int sum = 0;
		
		for (int i = 0; i < studentNumber; i++) { /* read every score from user */
			System.out.print("Enter the grade for student " + (i + 1) + ": ");
			studentsScore[i] = inputs.nextInt();
			if (studentsScore[i] > 100 || studentsScore[i] < 0) { // if the input is invalid
				System.out.println("Invalid grade, try again...");
				i--; // index back to last position
			}
		}
		
		for (int i = 0; i < studentNumber; i++) {
			sum += studentsScore[i]; // sum all score up
		}
		
		System.out.println("The average is: " + (double)(sum / studentNumber)); // print out the average
		
	}
	
}
