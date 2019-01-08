package chapterSeven;

import java.util.Scanner;

public class AddCoins {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your total coins");
		System.out.println("Quarters: ");
		int quarters = input.nextInt();
		
		System.out.println("Dimes: ");
		int dimes = input.nextInt();

		System.out.println("Nickels: ");
		int nickels = input.nextInt();

		System.out.println("Pennies: ");
		int pennies = input.nextInt();

		getDollarAmount(pennies, nickels, dimes, quarters);
		
	}
	
	public static void getDollarAmount(double pennies, double nickels, double dimes, double quarters) {
		System.out.println("Your total is: $" + (pennies + ( nickels * 5) + (dimes * 10) + (quarters * 25)) / 100);
		
	}
	//testing to see what breaks
	
	//testing to see what happens when someone else breaks thing 
	
	
}
