package chapterEight;

public class Num {

	int number;
	
	public Num(int num) {
		setNumber(num);
	}
	
	
	public void Whole() {
		
		//return the whole number
		System.out.println("Your number is:  " + number);
		
	}
	public void Hundreds() {
		
		
		System.out.println("Your hundreds place digit is: " + (int)(number / 100));
		
	}
	
	public void Tens() {
		
		System.out.println("Your tens place digit is: " + (int)( (number % 100)/10)   );
		
	}

	public void Ones() {
	
		System.out.println("Your ones place digit is: " + (int)(number % 100 %10 ));
		
	}
	
	public void setNumber(int num) {
		number = num;
	}
	
	public int getNumber() {
		return number;
	}
	
}
