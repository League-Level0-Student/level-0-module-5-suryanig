package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

static	Robot rob = new Robot();

public static void main(String[] args) {
	
	
	rob.penDown();
	rob.setSpeed(10);
String color = JOptionPane.showInputDialog("Do you want black, blue, red, or yellow?");
if (color.equalsIgnoreCase("blue")){
	rob.setPenColor(Color.BLUE);
}
else if (color.equalsIgnoreCase("red")){
	rob.setPenColor(Color.RED);
}
else if (color.equalsIgnoreCase("yellow")){
	rob.setPenColor(Color.YELLOW);
}
else {
	rob.setPenColor(Color.BLACK);
}
	
String shape = JOptionPane.showInputDialog("Do you want to draw a square, triangle, or circle?");
	if (shape.equalsIgnoreCase("square")){
		drawSquare();
	}
	else if (shape.equalsIgnoreCase("triangle")) {
		drawTriangle();
	}
	else if (shape.equalsIgnoreCase("circle")) {
		drawCircle();
	}
	else {
		JOptionPane.showMessageDialog(null, "Did you not read the instructions! It said square, triangle, or circle. Not that.");
	}
		
}	
	
static void drawSquare() {	
	for (int i = 0; i<4; i++) {
		rob.move(100);
		rob.turn(90);
	}
}
static void drawTriangle() {
	for (int y = 0; y<3; y++) {
		rob.move(100);
		rob.turn(120);
	}
}
static void drawCircle() {
	for (int s = 0; s<360; s++) {
		rob.move(1);
		rob.turn(1);
	}
}
}
