package chapterSeven;

import java.util.Scanner;

public class IsoTriangle {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
	//this needs to call add spaces then call draw bar
		System.out.println("What is your number?");
	
		int size = input.nextInt();
System.out.println("" + size);
		
//for(int x = size; x > 0; x-=1) {
//			addSpaces(size);
//			drawBar(size - x);
//		}

addSpaces(size -1);
drawBar(1);
	
	}


	
	
	
	
	public static void drawBar (int length) {
	//length is how many it will print out
		//length 2 prints 2 *
		for(int i = 0; i < length; i++) {
			
			System.out.print("*");
		
		}
		
		System.out.println();
	}
	
	public static void addSpaces(int iteration) {
		for (int iterations = iteration; iterations > 0; iteration-- ) {
			System.out.print("");
		}
	}
}
