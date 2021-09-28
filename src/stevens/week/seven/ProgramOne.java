package stevens.week.seven;

/**
 * Program One - Exercise 8.4 JHTP (Rectangle Class): Create a class Rectangle with attributes length and 
 * width, each of which defaults to 1. Provide methods that calculate the rectangle's perimeter and 
 * area. Use set and get methods for both length and width. The set methods will verify that length 
 * and width are each floating-point numbers larger than 0.0 and less than 20.0. Write a program to 
 * test class Rectangle. 
 * CSIS-212B02
 * Week 6 Assignment Chapter 7
 * Program 1
 * @author Kyle Stevens
 *
 */
public class ProgramOne {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle((float) 3.123456, (float) 4.654321);
		
		System.out.println(rectangle.calculateArea());
		System.out.println(rectangle.calculatePerimeter());
	}

}


class Rectangle extends Shape {
	
	private float length = 1;
	private float width = 1;
	
	private void setLength(float length) {
		this.length = length;
	}
	
	private float getLength() {
		return this.length;
	}
	
	private void setWidth(float width) {
		this.width = width;
	}
	
	private float getWidth() {
		return this.width;
	}
	
	public Rectangle(float length, float width) {
		setLength(length);
		setWidth(width);
	}
	
	@Override
	float calculateArea() {
		float area = getLength() * getWidth(); 
		return area;
	}

	@Override
	float calculatePerimeter() {
		float perimeter = (getLength() * 2) + (getWidth() * 2);
		return perimeter;
	}
	
}

abstract class Shape {
	
	abstract float calculateArea();
	
	abstract float calculatePerimeter();

}