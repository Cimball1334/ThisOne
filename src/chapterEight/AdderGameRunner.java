package chapterEight;

import java.util.Scanner;

public class AdderGameRunner {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int answer = 0;
	
		Adder game = new Adder();
		
		game.question();
		game.answer(input.nextInt());

		//make this loop whenever i can
		
		
	}
	
}
