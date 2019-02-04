package chapterEight;

public class Rectangle {
	public double length;
	public double width;
	public Rectangle() {
		setLength(1);
		setWidth(2);
	}
	
	public Rectangle(double length, double width) {
		setLength(length);
		setWidth(width);
	}

	
	public double area() {
		
		return length * width;
	
	}
	
	public double perimeter() {
		return 2 * (length + width);
	}
	
	public static void main(String args[]) {
		
	}
	
	public void setLength(double newLength) {
		length = newLength;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setWidth(double newWidth) {
		length = newWidth;
	}
	
	public double getWidth() {
		return length;
	}
	
}
