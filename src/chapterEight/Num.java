package chapterEight;

public class Num {

	int number;
	
	public Num(int num) {
		setNumber(num);
	}
	
	
	public int Whole() {
		
		//return the whole number
		return number;
		
	}
	public int Hundreds() {
		
		
		return (int)(number / 100);
		
	}
	
	public int Tens() {
		
		return (int)( (number % 100)/10)   ;
		
	}

	public int Ones() {
	
		return (int)(number % 100 %10 );
		
	}
	
	public void setNumber(int num) {
		number = num;
	}
	
	public int getNumber() {
		return number;
	}
	
}
