package stevens.week.seven;

class Rectangle extends Shape {
	
	private float length = 1;
	private float width = 1;
	
	private void setLength(float length) {
		this.length = length;
		if(length < 0.0 || length > 20.0) {
			System.out.println("Length is less than 0.0 or greater than 20.0");
			System.out.println("Please eneter a valid length.");
			this.length = 0;
		}
	}
	
	private float getLength() {
		return this.length;
	}
	
	private void setWidth(float width) {
		this.width = width;
		if(width < 0.0 || width > 20.0) {
			System.out.println("Width is less than 0.0 or greater than 20.0");
			System.out.println("Please eneter a valid width.");
			this.width = 0;
		}
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