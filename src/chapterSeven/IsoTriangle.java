package chapterSeven;

import java.util.Scanner;

public class IsoTriangle {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("What is your number?");
	
			int userNum = input.nextInt();
		
			for(int x = 0; x < userNum; x++) {
				addSpaces(userNum - x - 1);
				drawBar(x*2 + 1);
			}
		}

	
	public static void drawBar (int length) {

		for(int i = 0; i < length; i++) {
			
			System.out.print("*");
		
		}
		
		System.out.println();
	}
	
	
	public static void addSpaces(int iteration) {
		for(int i = 0; i < iteration; i++) {
			
			System.out.print(" ");
		
		}
			
	}
} 
