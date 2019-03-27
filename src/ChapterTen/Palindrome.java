package ChapterTen;

import java.util.Scanner;

public class Palindrome {

public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
	//enter string
	System.out.println("Enter a thing:");
	
	String thing = new String(input.next());
    String reverse = "";
    
    
    for(int i = thing.length() - 1; i >= 0; i--)
    {
        reverse = reverse + thing.charAt(i);
    }
    
    if(thing.equalsIgnoreCase(reverse)) {
    	System.out.println("this is a palindrome");
    }
	
	
	
}
}
