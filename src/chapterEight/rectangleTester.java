package chapterEight;

public class rectangleTester {

	public static void main(String args[]) {
		
		Rectangle nadide = new Rectangle(4,4);
		Rectangle tom = new Rectangle(4,4);
		

//	System.out.println(tom.area());
 System.out.println(Rectangle.displayAreaFormula(4,4));
//		
		System.out.println(tom);
		
		
		if( nadide.equals(tom) ){
			System.out.println("Same Widht and Length");
		}else {
			System.out.println("Different Width and Length");
		}
	}
	
}
