package chapterSeven;

import java.util.Scanner;

public class Nim {	
	static Scanner input = new Scanner(System.in);

	public static void main(String args[]) {
		  int totalStones =(int)( Math.random() * 15) + 15;
		
		while(totalStones > 0) {
			
			//boolean turn = false;// false = players turn, true = cpu turn
			System.out.println("There are " + totalStones + "stones left. How many would you like?");
			player(totalStones);
			totalStones = totalStones ;
			System.out.println("There are " + totalStones + "stones left. How many would you like?");
			cpu(totalStones);
			
		}
	}
	public static int player(int stones) {
		//handles players turn
		int takenStones = input.nextInt();
		return takenStones;

	}
	public static void cpu(int stones) {
		//handles computers turn


	}
	public static void drawStones( ) {
		
		//handles computer randoms
		
	}
	
	public static void isValidEntry() {
		//checks to make sure between 1-3 stones 
	}
	
	
	
	
	
}