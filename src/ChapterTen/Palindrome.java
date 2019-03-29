package ChapterTen;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)  
    { 
    	Scanner input = new Scanner(System.in);
    			
    	
    	System.out.println("Enter a string");
    	
        String str = input.nextLine();
        System.out.println(str);
        String reverse = "";


 
        
        //remove spaces
        //look through the letters, if char = space ascii/ substring from 1 before to 1 after/ repeat    	
        	for(int x = 0; x < str.length(); x++) {
        		
        		if(str.charAt(x) == 32 ) {
           			str = str.substring(0, x) + str.substring(x+1);
        			System.out.println(str);
        		}
        		
        	}
        	
        int h = str.length() - 1;
        
        //flip
        for(int i = 0; i < str.length(); i++) {
        	char aaaa = (char)str.charAt(h-i);
        	reverse+= aaaa;
        }
        
        // Compares character until they are equal 
      System.out.println(str);
      System.out.println(reverse);
    
      if(str.equals(reverse)) {
    	  System.out.println("This is a palindrome");
      }else {
    	  System.out.println("This is not a palindrome");
      }
    }
}

