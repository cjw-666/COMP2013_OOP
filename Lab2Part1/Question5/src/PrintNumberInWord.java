import java.util.*; // import all packages under java.util (in order to use Scanner)
public class PrintNumberInWord {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in); // create a Scanner call inputs
		
		System.out.print("Please input an integer: ");
		int number = inputs.nextInt(); // read in an integer and assign it to number
		
		// nested-if statement
		
		if (number == 1) {
			System.out.println("ONE");
		}else {
			if (number == 2) {
				System.out.println("TWO");
			}else {
				if (number == 3) {
					System.out.println("THREE");
				}else {
					if (number == 4) {
						System.out.println("FOUR");
					}else {
						if (number == 5) {
							System.out.println("FIVE");
						}else {
							if (number == 6) {
								System.out.println("SIX");
							}else {
								if (number == 7) {
									System.out.println("SEVEN");
								}else {
									if (number == 8) {
										System.out.println("EIGHT");
									}else {
										if (number == 9) {
											System.out.println("NINE");
										}else {
											System.out.println("OTHER");
										}
									}
								}
							}
						}
					}
				}
			}
		} // End of the nested-if statement
		
		// switch-case statement
		switch(number) { /* go to a case base on input number */
			case 1:
				System.out.println("ONE");
				break;
			case 2:
				System.out.println("TWO");
				break;
			case 3:
				System.out.println("THREE");
				break;
			case 4:
				System.out.println("FOUR");
				break;
			case 5:
				System.out.println("FIVE");
				break;
			case 6:
				System.out.println("SIX");
				break;
			case 7:
				System.out.println("SEVEN");
				break;
			case 8:
				System.out.println("EIGHT");
				break;
			case 9:
				System.out.println("NINE");
				break;
			default: /* if the input number not assign to a case */
				System.out.println("OTHER");
				break;
		} // End of the switch statement
		
		inputs.close();
	}

}
