package stevens.week.six.assignment.seven;

/**
 * Create an abstract class to make adding additional shapes easier
 * These methods are inherited by every new extended Shape class created (Circle, Triangle, etc.)
 * Maintains a common factor between all extended Shapes
 * @author Kyle Stevens
 *
 */
abstract class Shape {
	
	/**
	 * Abstract calculateArea() to use to calculate area of different shapes
	 * @return
	 */
	abstract float calculateArea();
	
	/**
	 * Abstract calculatePerimeter() to use to calculate perimeter of different shapes
	 * @return
	 */
	abstract float calculatePerimeter();

}