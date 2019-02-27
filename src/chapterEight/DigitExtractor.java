package chapterEight;

import java.util.Scanner;

public class DigitExtractor {

	
	private static boolean run = true;
	
	private static String W = new String("W");
	private static String O = new String("O");
	private static String T = new String("T");
	private static String H = new String("H");
	
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
		
		String answer = input.next();
		
		if(answer.equalsIgnoreCase(W)) {
			System.out.println("Your hundreds place digit is: " + first.Whole());
		}
		
		if (input.next().equalsIgnoreCase(O)) {
			System.out.println("Your hundreds place digit is: " + first.Ones());
		}
		if (input.next().equalsIgnoreCase(T)) {
			System.out.println("Your hundreds place digit is: " + first.Tens());
		}
		if(input.next().equalsIgnoreCase(H)) {
			System.out.println("Your hundreds place digit is: " +first.Hundreds());
		}
		
		if(input.next().equalsIgnoreCase("Q")) {
			run = false;
		}
		
		
		}while(run);
		
	}
}
