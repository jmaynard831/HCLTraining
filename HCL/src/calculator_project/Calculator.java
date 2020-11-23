package calculator_project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		// Set initial variables
		boolean endFlag = false;
		String controlChar;
		Scanner getControlChar = new Scanner(System.in);
		double[] numbers;

		System.out.println("WELCOME TO MY CALCULATOR!");

		// Main loop for calculator
		do {
			System.out.println("Please make a selection:");
			System.out.println("A. Add Numbers\nB. Subtract Numbers\nC. Multiply Numbers\nD. Divide Numbers\nE. End\n");

			// this String navigates the menu
			controlChar = getControlChar.next();

			// Switch on the input character
			switch (controlChar.toLowerCase().charAt(0)) {
			// Addition
			case 'a':
				System.out.println("Adding Mode");
				// Returns two doubles in an array
				numbers = takeNumbers(getControlChar);
				// formats and processes the nums
				System.out.println(numbers[0] + " + " + numbers[1] + " =\n" + (numbers[0] + numbers[1]));
				break;
			// Subtraction, works the same as Addition
			case 'b':
				System.out.println("Subtraction Mode");
				numbers = takeNumbers(getControlChar);
				System.out.println(numbers[0] + " - " + numbers[1] + " =\n" + (numbers[0] - numbers[1]));
				break;
			// Multiplication, works the same as Addition
			case 'c':
				System.out.println("Multiplication Mode");
				numbers = takeNumbers(getControlChar);
				System.out.println(numbers[0] + " * " + numbers[1] + " =\n" + (numbers[0] * numbers[1]));
				break;
			// Division, works the same as Addition
			// Note the prevention of 0 division.
			case 'd':
				System.out.println("Dividing Mode");
				numbers = takeNumbers(getControlChar);
				if (numbers[1] == 0) {
					System.out.println("Cannot Divide by zero.");
				} else {
					System.out.println(numbers[0] + " / " + numbers[1] + " =\n" + (numbers[0] / numbers[1]));
				}
				break;
			// Escape option
			case 'e':
				System.out.println("The program will end.");
				endFlag = !endFlag;
				break;
			// Default error handling.
			default:
				System.out.println("Please enter a valid option.");
				break;
			}

			System.out.println();

			// Now make the numbers touch.

		} while (!endFlag);

		// Close scanner
		getControlChar.close();

	}

	// Ask the user for two numbers.
	static public double[] takeNumbers(Scanner getTwoNums) {

		// Var inits
		double a = 0, b = 0;
		boolean endFlag = true;

		// Loop until valid input is given.
		while (endFlag) {
			try {

				System.out.println("Please enter first number:");
				a = getTwoNums.nextDouble();
				// Clear scanner buffer after next<val>
				getTwoNums.nextLine();

				System.out.println("Please enter second number:");
				b = getTwoNums.nextDouble();
				// Clear scanner buffer after next<val>
				getTwoNums.nextLine();

				endFlag = false;

				// Catch statement handles non numeric input
			} catch (InputMismatchException e) {
				System.out.println("Please input only numbers.");
				// Clear scanner buffer after next<val>
				getTwoNums.nextLine();
			}
		}
		// Return both nums
		return new double[] { a, b };
	}

}
