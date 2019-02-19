package chapterEight;

import java.util.Scanner;

public class Play21 {

	public static void main(String args[]) {
		
	 Scanner input = new Scanner(System.in);
	 GameOf21 test = new GameOf21();
	 
	 int cpu = (int)(Math.random() * 19 + 2);
		test.giveCards();
		
		if(input.nextInt() == 1) {
			test.drawCard();
		}
		System.out.println("The CPU has " + cpu);
		if(test.getTotal() > 21 ) {
			System.out.println("You Lost!!");
		}else if( test.getTotal() > cpu) {
			System.out.println("You Won!!");
		}else {
			System.out.println("You Lost :'( ");
		}
		
	}
	
}
