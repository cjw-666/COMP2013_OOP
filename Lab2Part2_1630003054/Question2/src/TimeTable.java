// prints the multiplication table of 1 to 9
public class TimeTable {

	public static void main(String[] args) {
		System.out.println("*\t|\t1\t2\t3\t4\t5\t6\t7\t8\t9");
		System.out.println("----------------------------------------------------------------------------------");
		// Print out first two lines directly
		
		for (int i = 1; i <= 9; i++) {
			// loop for row number
			System.out.print(i + "\t|\t");
			for (int j = 1; j <= 9; j++) {
				// loop for col number
				System.out.print(i*j + "\t"); // times and print out
			}
			System.out.print("\n"); // print an line feed at the end of every row
		}

	}

}
