/**Defines the Fan class and its methods
 * 
 * @author Darryl Karney
 * @version 04Jul2018
 */

public class Fan {
	//Delcare and initialize attributes
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";
	
	//Constructor
	Fan() {
	}
	
	/**Getter for speed attribute
	 * 
	 * @return			Returns the value from the speed attribute
	 */
	public int getSpeed() {
		return speed;
	}
	
	/**Setter for speed attribute
	 * 
	 * @param speed		The new speed value
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	/**Checks if the fan is on
	 * 
	 * @return			Returns whether the fan is on or not
	 */
	public boolean isOn() {
		return on;
	}
	
	/**Setter for on attribute
	 * 
	 * @param on		The new on value
	 */
	public void setOn(boolean on) {
		this.on = on;
	}
	
	/**Getter for radius attribute
	 * 
	 * @return			Returns the value from the radius attribute
	 */
	public double getRadius() {
		return radius;
	}
	
	/**Setter for radius attribute
	 * 
	 * @param radius	The new radius value
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**Getter for color attribute
	 * 
	 * @return
	 */
	public String getColor() {
		return color;
	}
	
	/**Setter for color attribute
	 * 
	 * @param color		The new color value
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**Returns fan attribute data based on whether the fan is on or not
	 * 
	 */
	public String toString() {
		if (isOn()) {
			return "Speed: " + getSpeed() + " Color: " + getColor() + " Radius: " + getRadius();
		} else {
			return "Color: " + getColor() + " Radius: " + getRadius() + " fan is off";
		}
	}
}
