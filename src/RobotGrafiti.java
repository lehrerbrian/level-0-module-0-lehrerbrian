import org.jointheleague.graphical.robot.Robot;

public class RobotGrafiti {

	    public static void main(String[] args) throws Exception {
	 
		

	    	// 1. Make a new Robot
	Robot r = new Robot();
	r.penDown();
	r.setSpeed(100);
	r.setPenWidth(10);
		for (int i = 0; i < 230.; i++) {
			r.move(1);
			r.setRandomPenColor();	
		} 
	r.turn(90);
	for (int i = 0; i < 180; i++) {	
r.move(1);
r.setRandomPenColor();
r.turn(1);
	}
	r.turn(180);
	for (int i = 0; i < 180; i++) {	
r.move(1);
r.setRandomPenColor();
r.turn(1);
	}
	r.hide();
}}
