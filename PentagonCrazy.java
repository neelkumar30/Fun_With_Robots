import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class PentagonCrazy {

	private void makePrettyThings() {
		// 1. Create a new Robot
		Robot Aaron = new Robot();
 
		// 3. Put the robot's pen down
		Aaron.penDown();
 
		// 8. Make the robot go at maximum speed (10)
		Aaron.setSpeed(10);
 
		// 9. Set the pen to a color that you like for the shape
		Aaron.setPenColor(0,250,0);
 
		// 4. Make a variable for the number of sides you want (can’t test this one)
		int sides = 5;
 
		// 5. Make a variable for the angle you want the robot to turn. Hint: you can divide in Java using "/". Can’t test until step 6.
		int angle = 360/sides;
 
		// 7. Do steps #2 to #11, 200 times. When this is done you should see a pentagon.
				for (int i = 0; i < 200; i++) {
 
			// 2. Move the robot 200 pixels
				Aaron.move(i);
	
			// 10. Make the robot move "i" pixels instead of 200 (don’t need new line of code for this, just change previous one)
	
			// 6. Turn the robot the amount in your angle variable
				Aaron.turn(angle);
	
			// 11. Turn the robot one more degree
				Aaron.turn(1);
				}
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}
