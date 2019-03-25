package ChapterTen;

public class GeneratedNumbs {

	public static void main(String args[]) {
		/*
		 * generate number
		 * add number and its digits
		 * save final number
		 */
		
		 int[] nums = new int[101];
	
		 
		
		 for(int number = 0; number < 101; number++) {
	
	   	 nums[number] = number + number % 10 + number % 100 / 10 + number % 1000 / 100;
			 
		 }
		
		 System.out.println("Index \t Generated Numbers");
		 for(int x = 0; x < 101; x++) {
				System.out.println(x + "\t" + nums[x] );
				
		 }
		 
	}
	
}
