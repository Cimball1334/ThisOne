package chapterEight;

public class Rectangle {
	public double length;
	public double width;
	public Rectangle() {
		setLength(1);
		setWidth(1);
	}
	
	public Rectangle(double length, double width) {
		setLength(length);
		setWidth(width);
	}

	
	public double area() {
		
		return length * width;
	}
	
	public String displayAreaFormula() {
		return "The formula is  " + length + " * " + width + " = " + area();
	
	}
	
	public double perimeter() {
		return 2 * (length + width);
	}
	
	public static void main(String args[]) {
		
	}
	
	public String toString() {
		return "The Area is " + length * width;
	}
	
//	public boolean equals(Object c) {
//		Rectangle test = (Circle) c;
//		
//		if(t
//	}
//	
	public void setLength(double newLength) {
		length = newLength;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setWidth(double newWidth) {
		width = newWidth;
	}
	
	public double getWidth() {
		return length;
	}
	
}
