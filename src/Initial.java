import org.jointheleague.graphical.robot.Robot;

public class Initial {
public static void main(String[] args) {
	Robot aaron= new Robot("batman");
	aaron.moveTo(100, 375);
		aaron.penDown();
		aaron.setPenColor(0,250,0);
		aaron.setSpeed(10);
		aaron.move(250);
		aaron.turn(135);
		aaron.move(340);
		aaron.turn(-135);
		aaron.move(250);
		aaron.moveTo(500, 375);
		aaron.setSpeed(10);
		aaron.move(250);
		aaron.turn(180);
		aaron.move(125);
		aaron.turn(-135);
		aaron.move(170);
		aaron.turn(180);
		aaron.move(170);
		aaron.turn(-90);
		aaron.move(170);
}
}
