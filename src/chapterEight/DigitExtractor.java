package chapterEight;

import java.util.Scanner;

public class DigitExtractor {

	private static boolean run = true;
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		
		Num first = new Num(input.nextInt());
		
		do {
		
		System.out.println("show (W)hole number");
		System.out.println("show (O)nes place number");
		System.out.println("show (T)ens place number");
		System.out.println("show (H)undreds place number");
		System.out.println("(Q)uit");
		
		System.out.println("Enter your choice: ");
		
		if(input.next().equalsIgnoreCase("W")) {
			first.Whole();
		}
		
		if (input.next().equalsIgnoreCase("O")) {
			first.Ones();
		}
		if (input.next().equalsIgnoreCase("T")) {
			first.Tens();
		}
		if(input.next().equalsIgnoreCase("H")) {
			first.Hundreds();
		}
		
		if(input.next().equalsIgnoreCase("Q")) {
			run = false;
		}
		
		
		}while(run);
		
	}
}
