package chapterEight;

import java.util.Scanner;

public class Play21 {

	public static void main(String args[]) {
		
	 Scanner input = new Scanner(System.in);
	
	 GameOf21 test = new GameOf21();
	 
	
	while(test.isRun()){
	
	 test.play(test);
	 	}
	
	}
	
}
