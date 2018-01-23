import java.util.Scanner;

public class IntegerLabels {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String userName;
		int userNum = 0;

		// Get input

		System.out.println("What is your name? ");
		userName = scnr.nextLine();

		System.out.println("Ok " + userName + ", enter a whole number between 1 and 100");
		userNum = scnr.nextInt();

		// Validate 1-100

		if (userNum < 1 || userNum > 100) {
			System.out.println("Sorry, I only work with numbers between 1 and 100.");
		
		} else {

			if ((userNum % 2) != 0) {
				System.out.print("Thanks " + userName + "\n" + userNum + " is Odd");
				if (userNum > 60) {
					System.out.println(" and over 60");
				}
			} else if (userNum < 25) {
				System.out.println("Thanks " + userName + "\n" + userNum + " is Even and less than 25");
			} else if (userNum > 25 && userNum < 61) {
				System.out.println("Even\nThanks " + userName + ".");
			} else {
				System.out.println("Thanks " + userName + "\n" + userNum + " is Even");
			}
		}
		System.out.println("End of program.");
	}
}
