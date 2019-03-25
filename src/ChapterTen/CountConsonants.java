package ChapterTen;
import java.util.Scanner;

public class CountConsonants {
	



	
	    public static void main(String[] args)
	    {
	        Scanner input = new Scanner(System.in);

	        String sentence = "";

	        System.out.println("Enter Text ");
	        sentence = input.nextLine();
	        sentence = sentence.toLowerCase();
	        int count = 0;
	        for(int i = 0; i < sentence.length(); i++)
	        {
	            if(sentence.charAt(i) != 'a' && 
	            sentence.charAt(i) != 'e' && 
	            sentence.charAt(i) != 'i' && 
	            sentence.charAt(i) != 'o' && 
	            sentence.charAt(i) != 'u' &&
	            sentence.charAt(i) != ' ')
	            {
	                count++;  
	            }

	        }

	        System.out.println("The number of Consonants is " + count);

	    } 
	}
