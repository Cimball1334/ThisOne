package chapterEight;

import java.util.Scanner;

public class GameOf21 {

	Scanner input = new Scanner(System.in);
	
	private int total;
	
	
	public GameOf21() {
		setTotal(0);
	
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
			System.out.println("You pulled an Ace, do you want it to be 1 or 11?");
			if(input.nextInt() == 1) {
				setTotal(total + 1);
				
			}else {
				setTotal(total + 11);
				
			}
		}
		else if(card < 11) {
			setTotal(total + card);
			System.out.println("You pulled a " + card);
		}else {
			setTotal(total + 10);
			System.out.println("You pulled a " + card);
		}
		System.out.println("You have: " + total);
	
	}
	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}

	
}
