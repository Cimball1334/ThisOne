package ChapterTen;

public class EvensAndOdds {

	public static void main(String args[]) {
		
		int[] all = new int[25];
		
		
		int evennumber = 0, oddnumber = 0;
		
		for(int x = 0; x<25; x++) {
			all[x] = (int)(Math.random() * 100 );
			
			if(all[x] % 2 == 0 ) {
				evennumber++;
			}else {
				oddnumber++;
			}
		}
	
		int[] evens = new int[evennumber], odds = new int[oddnumber];
		
		for(int x = 0; x<25; x++) {
			if(all[x] % 2 == 0 ) {
				evens[x] = all[x];
			}else {
				odds[x] = all[x];
			}
		}
		
		for(int x = 0; x<25; x++) {
		
			System.out.println("Odds: ");
	
			System.out.print(odds[x]);
		
		}
		
		}
		
}
