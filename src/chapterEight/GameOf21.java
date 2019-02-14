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
		int card = (int)(Math.random() * 13);
		if(card == 1){
			System.out.println("You have an Ace, do you want it to be 1 or 11?");
			if(input.nextInt() == 1) {
				setTotal(1);
			}else {
				setTotal(11);
			}
		}
		else if(card < 11) {
			setTotal(card);
		}else {
			setTotal(10);
		}
	}

	public void drawCard() {
	
		int card = (int)(Math.random() * 13);
		
		if(card == 1){
			System.out.println("You pulled an Ace, do you want it to be 1 or 11?");
			if(input.nextInt() == 1) {
				setTotal(1);
			}else {
				setTotal(11);
			}
		}
		else if(card < 11) {
			setTotal(card);
		}else {
			setTotal(10);
		}
		
	
	}
	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}

	
}
