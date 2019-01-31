package chapterEight;

public class Circle {

	private double radius;//instance variable
	
	private static final  double PI = 3.1415926535;//class variable, shared among all instances of this class
	/*
	 * Constructers
	 */
	public Circle(){
		//constructor for the class
		
		//this is a default constructer, this takes no arguments
		setRadius(1);
		
	}
	
	public Circle(double r) {
		
		setRadius(r);
		
	}
	
	/*
	 * Methods 
	 */
	
	public static void Main(String[] args) {
		
		
	}
	
	
	public double getArea() {
		return PI *	(radius * radius);
	}

	
	public double getCircumferance() {
		return 2 * PI * radius;
	}
	
	
	public static void joke() {
		System.out.println("REEEEEEEEEEE");
	}
	
	
	
	
	/*
	 * Getters And Setters
	 */
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/*
	 * Constants
	 */
	
}
