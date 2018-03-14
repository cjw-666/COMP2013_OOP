public class SumAndAverage {

	public static void main(String[] args) {
		System.out.println("---- Sum for odd number (For-loop):");
		int sum = 0; // Store the accumulated sum init to 0
		double average; // average in double
		int lowerbound = 1; // The lowerbound to sum
		int upperbound = 100; // The upperbound to sum
		// Use a for-loop to sum from lowerbound to upperbound
		// Only add odd number
		for (int number = lowerbound; number <= upperbound; number += 2) { /* Only add odd number(increase by two every time) */
			sum += number; // same as "sum = sum + number"
		}
		// Compute average in double. Beware that int/int produces int.
		average = (double) sum / (upperbound - lowerbound + 1);
		// Print sum and average
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
		// 6.1 while loop
		// sum only the numbers from 1 to 100 that are divisible by 7
		System.out.println("---- Sum for numbers are divisible by 7 (While-loop):");
		sum = 0;
		int number = lowerbound;
		int divisible = 0; // variable that store how many number is divisible by 7
		while (number <= upperbound) {
			if (number % 7 == 0) { // if the number is divisible by 7
				sum += number; // add to sum
				divisible++; // divisible number amount increase
			}
			number++;
		}
		// Compute average in double. Beware that int/int produces int.
		average = (double) sum / divisible;
		// Print sum and average
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
		// 6.2 do-while
		// sum of the squares
		System.out.println("---- Sum of the square (Do-while):");
		sum = 0; // Reset sum
		number = lowerbound;
		do {
			sum += number * number; // first calculate the square then add to sum
			number++;
		} while (number <= upperbound);
		// Compute average in double. Beware that int/int produces int.
		average = (double) sum / (upperbound - lowerbound + 1);
		// Print sum and average
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
	}

}
