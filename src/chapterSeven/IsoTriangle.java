package chapterSeven;

import java.util.Scanner;

public class IsoTriangle {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
	//this needs to call add spaces then call draw bar
		System.out.println("What is your number?");
	
		int size = input.nextInt();
System.out.println("" + size);
		
addSpaces(3);
drawBar(1);
	}

	
	public static void drawBar (int length) {

		for(int i = 0; i < length; i++) {
			
			System.out.print("*");
		
		}
		
		System.out.println();
	}
	
	public static void addSpaces(int iteration) {
		for (int iterations = iteration; iterations > 0; iteration-- ) {
			System.out.print("-");
		}
	}
}
