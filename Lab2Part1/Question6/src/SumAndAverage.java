public class SumAndAverage {

	public static void main(String[] args) {
		
		int sum = 0; // define a integer variable for sum
		double average = 0.0; // define a double variable for average
		
		for (int i = 1; i <= 100; i++) { /* Use a for loop to sum the number from 1 to 100 */
			sum += i;
		}
		average = sum / 100.0; /* produce the average number */
		System.out.println("----------- For Statement:");
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
		
		
		int index = 1; // define a integer variable for sum
		sum = 0; // reset the sum to 0
		average = 0.0; // reset the average to 0.0
		
		while (index <= 100) { /* use a ¡°while¡± loop instead of ¡°for¡± loop. */
			sum += index;
			index++;
		}
		average = sum / 100.0; /* produce the average number */
		
		System.out.println("----------- While Statement:");
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
		
		
		index = 1; // reset the index to 1
		sum = 0; // reset the sum to 0
		average = 0.0; // reset the average to 0.0
		
		do {
			sum += index;
			index++;
		} while (index <= 100);
		average = sum / 100.0; /* produce the average number */
		
		System.out.println("----------- Do-While Statement:");
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
		
		
		sum = 0; // reset the sum to 0
		average = 0.0; // reset the average to 0.0
		int start = 111, end = 8899; // set the start and end separately
		
		for (int i = start; i <= end; i++) { /* Use a for loop to sum the number from start to end */
			sum += i;
		}
		average = sum / (double)(end - start + 1); /* produce the average number */
		
		System.out.println("----------- sum from 111 to 8899:");
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
	}

}
