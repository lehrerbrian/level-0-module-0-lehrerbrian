import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {

String color=JOptionPane.showInputDialog("what is your favorite color");
JOptionPane.showMessageDialog(null, "wow "+color+" is my favoite too");
Robot robot485=new Robot();
robot485.setAngle(90);
robot485.setSpeed(20);
robot485.penDown();
robot485.move(150);
robot485.setAngle(210);
robot485.move(150);
robot485.setAngle(-30);
robot485.move(150);
robot485.hide();
}

}
