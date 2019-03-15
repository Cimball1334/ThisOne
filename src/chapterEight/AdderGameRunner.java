package chapterEight;

import java.util.Scanner;

public class AdderGameRunner {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int answer = 0;
	
		Adder game = new Adder();
		while(answer != 999) {
		game.question();
		answer = input.nextInt();
		game.answer(answer);
//ahwbeokfjbqw
		
		
	}
		
	}
	
}
