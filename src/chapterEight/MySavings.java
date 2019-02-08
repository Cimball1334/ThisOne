package chapterEight;

import java.util.Scanner;

public class MySavings {

	public static void main(String args[]) {
		int userChoice =99;
		
		PiggyBank piggyBank1 = new PiggyBank();
		
		Scanner input = new Scanner(System.in);
				while(userChoice != 0) {
					System.out.println("1. SHow total");
					System.out.println("2. Add a penny");
					System.out.println("3. Add a nickel");
					System.out.println("4. Add a dime");
					System.out.println("5. Add a quarter");
					System.out.println("6. Take money");
					System.out.println("Enter 0 to quit");
					System.out.println("Enter Choice:");
					
					userChoice = input.nextInt();
				
		if(userChoice == 1) {
			
		System.out.println("The total is: " + piggyBank1.getTotal());
		
		}
		if(userChoice == 2) {
			
			piggyBank1.addCoins(.01);
			
		}
		if(userChoice == 3) {
			
			piggyBank1.addCoins(.05);
			
		}
		if(userChoice == 4) {
			
			piggyBank1.addCoins(.1);
			
		}
		if(userChoice == 5) {
			
			piggyBank1.addCoins(.25);
			
		}
		if(userChoice == 6) {
			
			System.out.println("You now have " + piggyBank1.getTotal() + " and no money in the bank");
			userChoice = 0;
			}
		}
	
	}
	
}
