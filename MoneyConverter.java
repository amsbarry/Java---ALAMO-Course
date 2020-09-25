////-------------------------------------------------------------------
			// Programmer: 	Amadou Barry
			// Course: 		COSC 1336 Sections 011/015
			// Semester: 	Spring 2019
			// Assignment#: 2
			// Due Date: 	February 13, 2019 @ 11:59 pm
////-------------------------------------------------------------------
package assignment02;
			// import the scanner class to enable
			// reading in from the keyboard
import java.util.Scanner;
public class MoneyConverter {

	public static void main(String[] args) {
			// declare constants to be used
		final int TEN_DOLLARS = 1000;
		final int FIVE_DOLLARS = 500;
		final int ONE_DOLLARS = 100;
		final int QUARTER = 25;
		final int DIME = 10;
		final int NICKEL = 5;
		final int HUNDRED = 100;
			// declare variables to be used
		int tens, fives, ones, quarters, dimes, nickels;
		int remainingCents;
		double total, twiceAmount, halfAmount;
		double addTwoDollars, subtractOneDollar;
		char dollarSign, cents;
		String prefix, firstName, lastName;
		
			// assign variables
		dollarSign = '$';
		cents = 162; // this is used to assigned the cents symbol and unicode is 162
		
		prefix = "Sir";
		firstName = "Amadou";
		lastName = "Barry";
		
			// instantiate an object from the
			// Scanner class to enable reading
			// in from the keyboard
		Scanner keyboard = new Scanner(System.in);
		
			// prompt the user to enter a money
			// amount then read it in
		System.out.println("Enter the monetary amount:");
		total = keyboard.nextDouble();

			// calculate twice, half, adding two dollars
			// and subtracting one dollar from the
			// amount entered
		twiceAmount = total * 2.0;
		halfAmount = total / 2.0;
		addTwoDollars = total + 2.0;
		subtractOneDollar = total - 1.0;
		
			// convert the amount of money read into cents
		remainingCents = (int) (total * HUNDRED);
		
			// print out current calculations
		System.out.println("\nThe amount of " + dollarSign + total + 
				" is equalent to " + 
				remainingCents + cents + 
				" " + "(cents)");
		
		System.out.println("Twice the amount is " +
				dollarSign + 
				twiceAmount + "!");
		
		System.out.println("Half the amount is " +
				dollarSign + 
				halfAmount + "!");
		
		System.out.println("Adding two dollars is " +
				dollarSign +
				addTwoDollars + "!");
		
		System.out.println("Subtracting one dollar is " +
				dollarSign +
				subtractOneDollar + "!");
		
			// calculate how many ten dollar bills there are
		tens = remainingCents / TEN_DOLLARS;
			//remainingCents = remainingCents % TEN_DOLLARS;
		remainingCents %= TEN_DOLLARS;
		
			// repeat procedure for five dollar bills,
			// one dollar bill, quarters, dimes, nickels, and
			// pennies using appropriate variables and
			// constants; note: at the end, the last value of
			// remaingCents will be the value for pennies
		fives = remainingCents / FIVE_DOLLARS;
		remainingCents %= FIVE_DOLLARS;

		ones = remainingCents / ONE_DOLLARS;
		remainingCents %= ONE_DOLLARS;
		
		quarters = remainingCents / QUARTER;
		remainingCents %= QUARTER;
		
		dimes = remainingCents / DIME;
		remainingCents %= DIME;
		
		nickels = remainingCents / NICKEL;
		remainingCents %= NICKEL;

			// print out information accordingly
		System.out.println("\nThat's equivalent to:\n");
		
		System.out.println(tens
				+ " ten dollar bills");
		
		System.out.println(fives
				+ " five dollar bills");
		
		System.out.println(ones
				+ " one dollar bill");
		
		System.out.println(quarters
				+ " quarters");
		
		System.out.println(dimes
				+ " dimes");
		
		System.out.println(nickels
				+ " nickels");
		
		System.out.println(remainingCents
				+ " pennies");
		
		System.out.println( "\nThis program was written by " + 
					prefix + " " + firstName + " " + 
					lastName);
		
		System.out.println("End of program.");
		
	} //End method main

} // end class MoneyConverter
