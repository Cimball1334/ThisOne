package ChapterTen;

public class EvensAndOdds {

	public static void main(String args[]) {
		
		int[] all = new int[25];
		
		
		int evennumber = 0, oddnumber = 0;
		
		int number;
		
		for(int x = 0; x < 25; x++) {
			
			all[x] = (int)(Math.random() * 100 );
			
				if(all[x] % 2 == 0 ) {
					evennumber++;
				}else {
					oddnumber++;
				}
		}
	
		int[] evens = new int[evennumber];
		int[] odds = new int[oddnumber];
		
		int evenSpot = 0;
		int oddSpot = 0;
		for(int x = 0; x<25; x++) {
			number = all[x];
			if(number % 2 == 0 ) {
				evens[evenSpot] = number;
				evenSpot++;
				
			}else {
				odds[oddSpot] = number;
				oddSpot++;	
			}
		}
		
		System.out.println("Odds: ");
		for(int x = 0; x<oddnumber; x++) {
			System.out.print(odds[x] + " ");
			}
		System.out.println();
		System.out.println("Evens: ");
		for(int x = 0; x<evennumber; x++) {
			System.out.print(evens[x] + " ");
			}
		
		
		}
		
}
