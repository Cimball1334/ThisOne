package ChapterTen;

public class GeneratedNumbs {

	public static void main(String args[]) {
		/*
		 * generate number
		 * add number and its digits
		 * save final number
		 */
		
		 int[] nums = new int[101];
	
		 
		 int number;
		 for(int x = 0; x < 101; x++) {
		System.out.println(x + "zzzzzzzzzzzz");
		System.out.println(nums[x] % 10);
		System.out.println(nums[x] % 100 / 10 );
		System.out.println(nums[x] % 1000 / 100 );
		
		//number = (int)((nums[x] % 10) + (nums[x] % 100 / 10 ) + (nums[x] % 1000 / 100));
		// nums[x] = number;
		 }
		
		 System.out.println("Index \t Generated Numbers");
//		 for(int x = 0; x < 101; x++) {
//				System.out.println(x + "\t" + nums[x] );
//				
//		 }
		 
	}
	
}
