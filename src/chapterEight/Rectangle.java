package chapterEight;

public class Rectangle {
	public double length;
	public double width;
	public Rectangle() {
		setLength(1);
		setWidth(1);
	}
	
	public Rectangle(double newLength, double newWidth) {
		length = newLength;
		width = newWidth;
	}

	
	public double area() {
		
		return length * width;
	}
	
	public static String displayAreaFormula(double length, double width) {
		return "The formula is  " + length + " * " + width;
	
	}
	
	public double perimeter() {
		return 2 * (length + width);
		
	}
	
	
	public String toString() {
		return "The Area is " + length * width;
	}
	


	
	public boolean equals(Object c) {
		Rectangle testObj = (Rectangle) c;

		if(testObj.getWidth() == width && testObj.getLength() == length) {
			return true;
		}
			return false;
				
	
	}
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
