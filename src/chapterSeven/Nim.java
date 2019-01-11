package chapterSeven;

import java.util.Scanner;

public class Nim {	
	static int stones =(int)( Math.random() * 15) + 15;
	static Scanner input = new Scanner(System.in);

	public static void main(String args[]) {
		
		
		while(stones > 0) {
			
			//boolean turn = false;// false = players turn, true = cpu turn
			System.out.println("There are " + stones + "stones left. How many would you like?");
			player();
			
			System.out.println("There are " + stones + "stones left. How many would you like?");
			cpu();
			
		}//
	}
	
	public static void drawStones() {
		//handles computer randoms
	}
	
	public static void isValidEntry() {
		//checks to make sure between 1-3 stones 
	}
	
	public static void player() {
		//handles players turn
		int takenStones = input.nextInt();
		stones = stones - takenStones;

	}
	
	public static void cpu() {
		//handles computers turn


	}
	
}