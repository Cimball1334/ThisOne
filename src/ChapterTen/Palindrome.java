package ChapterTen;

import java.util.Scanner;

public class Palindrome {

public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
	//enter string
	System.out.println("Enter a thing:");
	
	String thing = new String(input.next());
	//find first number and find last number
	//x is starting ;;;;;  length - x is last
	for(int x =0; x <= thing.length(); x++){
		if(thing.charAt(x) != thing.charAt(thing.length() - 1 - x)) {
			System.out.println("This is not a Palindrome");
			x = 200000;
		}
	}
	System.out.println("This is a palindrome");
	//discover if they are the same dec ascii 
	
	//if they are continue to the next one subractnig the number we are on (now 2) from the final number to get the second to last number
	
	//diddo 
	
	// i want a fucking taco
	
	// done;
}
}
