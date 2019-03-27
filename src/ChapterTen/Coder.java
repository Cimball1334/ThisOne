package ChapterTen;

import java.util.Scanner;

public class Coder {

	  public static void main(String[] args)
	    {
	        Scanner input = new Scanner(System.in);

	        String sentence = "";
	        String code = "";
	        
	        System.out.println("Enter Text ");
	        sentence = input.nextLine();
	        sentence = sentence.toLowerCase();
	
	        for(int x = 0; x < sentence.length(); x++) {
	        	int letter = (int)(sentence.charAt(x));
	        	
	        	int coded = letter + 2;
	        	
	        	if(coded > 122) {
	        		coded -= 26;
	        	}
	        	
	        	if(letter == 32) {
	        		coded = 32;
	        	}
	        	char codes = (char) coded;
	        	
	          	code += codes;
	        	
	        }
	        
	        System.out.println(code);
	        
	    }
}