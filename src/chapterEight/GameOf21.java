package chapterEight;

import java.util.Scanner;

public class GameOf21 {

	Scanner input = new Scanner(System.in);
	
	private boolean run;
	private int total;
	private static String stop = new String("stop");
	
	public GameOf21() {
		setTotal(0);
		setRun(true);
	
	}
	
	public void play(Object c) {
		
		
		GameOf21 test = (GameOf21) c;
		test.setTotal(0);
	
	
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
			
			System.out.println("Type stop to Stop playing or go to play again \n");
			
			if(input.next().equalsIgnoreCase("stop")) {
				setRun(false);
				System.out.println("Thank You For Playing! \n\n");
			}
	
			
	}
			
	public void giveCards() {
		//give them the two cards off the start
				int card = (int)(Math.random() * 12 + 1);
		if(card == 1){
			System.out.println("You have an Ace, do you want it to be 1 or 11?");
			if(input.nextInt() == 1) {
				setTotal(total + 1);
			}else {
				setTotal(total + 11);
			}
		}
		else if(card < 11) {
			setTotal(total + card);
		}else {
			setTotal(total + 10);
		
		}
		if(card < 11) {
		System.out.println("You pulled a: " + card);
		}else {
			System.out.println("You pulled a face card, you have 10");
		}
		
		card = (int)(Math.random() * 12 + 1);
		if(card == 1){
			System.out.println("You have an Ace, do you want it to be 1 or 11?");
			if(input.nextInt() == 1) {
				setTotal(total + 1);
			}else {
				setTotal(total + 11);
			}
		}
		else if(card < 11) {
			setTotal(total + card);
		}else {
			setTotal(total + 10);
		
		}
		if(card < 11) {
			System.out.println("You pulled a: " + card);
			}else {
				System.out.println("You pulled a face card, you have 10");
			}
	
		System.out.println("You have: " + total + ", do you want to pull another card (1/0)");
	}

	public void drawCard() {
		System.out.println("Drawing a card");
		int card = (int)(Math.random() * 12 + 1);
		
		if(card == 1){
			System.out.println("You have an Ace, do you want it to be 1 or 11?");
			if(input.nextInt() == 1) {
				setTotal(total + 1);
			}else {
				setTotal(total + 11);
			}
		}
		else if(card < 11) {
			setTotal(total + card);
		}else {
			setTotal(total + 10);
		
		}
		if(card < 11) {
			System.out.println("You pulled a: " + card);
			}else {
				System.out.println("You pulled a face card, you have 10");
			}
		System.out.println("You have: " + total);
	
	}
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public boolean isRun() {
		return run;
	}
	
	public void setRun(boolean run) {
		this.run = run;
	}
	
	public static String getStop() {
		return stop;
	}
	
	public static void setStop(String stop) {
		GameOf21.stop = stop;
	}
	

	
}
