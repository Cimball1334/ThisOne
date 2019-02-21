package chapterEight;

import java.util.Scanner;

public class Play21 {

	public static void main(String args[]) {
		
	 Scanner input = new Scanner(System.in);
	String stop = new String("stop") ;
	
	 GameOf21 test = new GameOf21();
	 do {
	
	 test.play(test);
	 }	
	 while(input.next().equals(stop) != true);
	 
	}
	
}
