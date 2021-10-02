package stevens.week.seven;

/**
 * Rectangle class that extends the abstract class Shape.
 * Rectangle must define all methods within abstract class Shape.
 * This keeps all shapes grouped together and similarly defined
 * @author Kyle Stevens
 *
 */
class Rectangle extends Shape {
	
	private float length = 1;
	private float width = 1;
	private static boolean isValidDimensions = true;
	
	
	/**
	 * setter to store if dimensions are valid values
	 * @param boolen isValid
	 */
	private void setIsValidDimensions(boolean isValid) {
		isValidDimensions = isValid;
	}
	
	/**
	 * getter to return if dimensions are valid values
	 * @return boolean
	 */
	static boolean getIsValidDimensions() {
		return isValidDimensions;
	}
	
	/**
	 * setter to store length value and check if the value is valid
	 * @param float length
	 */
	private void setLength(float length) {
		this.length = length;
		if(length < 0.0 || length > 20.0) {
			setIsValidDimensions(false);
			System.out.println("\nLength is less than 0.0 or greater than 20.0");
			System.out.println("Please eneter valid values.");
			this.length = 0;
		}
	}
	
	/**
	 * getter to return length
	 * @return float length
	 */
	private float getLength() {
		return this.length;
	}
	
	/**
	 * setter to store width value and check if the value is valid
	 * @param float width
	 */

	private void setWidth(float width) {
		this.width = width;
		if(width < 0.0 || width > 20.0) {
			setIsValidDimensions(false);
			System.out.println("\nWidth is less than 0.0 or greater than 20.0");
			System.out.println("Please eneter valid values.");
			this.width = 0;
		}
	}
	
	/**
	 * getter to return width
	 * @return float width
	 */
	private float getWidth() {
		return this.width;
	}
	
	/**
	 * Constructor to only have one access point to set length and width
	 * @param length
	 * @param width
	 */
	public Rectangle(float length, float width) {
		setIsValidDimensions(true);
		setLength(length);
		setWidth(width);
	}
	
	/**
	 * Override method of class Shape.
	 * Defines how the area of a rectangle is calculated and returns the area
	 */
	@Override
	float calculateArea() {
		float area = getLength() * getWidth(); 
		return area;
	}

	/**
	 * Override method of class Shape.
	 * Defines how the perimeter of a rectangle is calculated and returns the perimeter
	 */
	@Override
	float calculatePerimeter() {
		float perimeter = (getLength() * 2) + (getWidth() * 2);
		return perimeter;
	}
	
}