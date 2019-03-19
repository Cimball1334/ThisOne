package ChapterTen;

public class EvensAndOdds {

	public static void main(String args[]) {
		
		int[] odds = new int[25];
		int[] evens = new int[25];
		
		int number = 0, spot;
		
		
		for(spot = 0; spot < 25; spot ++) {
		
			number = (int)(Math.random() * 100);
			
			if( number % 2 == 0) {
			
				evens[spot] = number;

			}else {
				
				odds[spot] = number;
				
			}
		
			
		
		}
		
		
		
		System.out.println("Odds: " + odds);
		System.out.println("Evens: " + evens);

	}
	
}
