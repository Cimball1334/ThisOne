package ChapterTen;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)  
    { 
    	Scanner input = new Scanner(System.in);
    			
    	
    	System.out.println("Enter a string");
    	
        String str = input.next(); 
        
        int h = str.length()-1; 
          

        str = str.toLowerCase(); 
        String reverse = "";
        
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

