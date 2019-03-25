package ChapterTen;

public class RandomStats {

	public static void main(String args[]) {
		
		int[] occur = new int[10];
		int[] nums = new int[500];
		
		for(int x = 0; x < 500; x++) {
			
			nums[x] = (int)(Math.random() * 10 );
			
			if(nums[x] == 9){
				occur[9]++;
			}else if(nums[x] == 8){
				occur[8]++;
			}else if(nums[x] == 7){
				occur[7]++;
			}else if(nums[x] == 6){
				occur[6]++;
			}else if(nums[x] == 5){
				occur[5]++;
			}else if(nums[x] == 4){
				occur[4]++;
			}else if(nums[x] == 3){
				occur[3]++;
			}else if(nums[x] == 2){
				occur[2]++;
			}else if(nums[x] == 1){
				occur[1]++;
			}else if(nums[x] == 0)
				occur[0]++;
		}
			
		System.out.println("number \t occurrences" );
		for(int x = 0; x < 10; x++) {
			System.out.println(x + "\t" + occur[x]);
		}
		
		
		
	}
	
}
