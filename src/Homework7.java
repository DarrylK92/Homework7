/**Creates 2 fans, modifies their attributes and prints out the results
 * 
 * @author Darryl Karney
 * @version 04Jul2018
 */

public class Homework7 {

	public static void main(String[] args) {
		//Create fan1 and set attributes
		Fan fan1 = new Fan();
		fan1.setSpeed(3);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		
		//Create fan2 and set attributes
		Fan fan2 = new Fan();
		fan2.setSpeed(2);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);
		
		//Print results
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
	}

}
