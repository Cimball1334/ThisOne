package chapterEight;

public class CircleTester {
	
	public static void main(String args[]) {
		
		Circle efe = new Circle(42);
		Circle mete = new Circle(2);
		Circle fatma = new Circle(3);
		
		System.out.println("efe " +efe.getRadius());
		System.out.println("mete " + mete.getRadius());
		System.out.println("fatma " + fatma.getRadius());
		
		
		System.out.println("mete area " + mete.getArea());
		System.out.println("mete circumference" + mete.getCircumferance()); 
		
		System.out.println("efe area " + efe.getArea());
		System.out.println("efe circumference" + efe.getCircumferance());
		
		Circle.joke();
		
		}

}
