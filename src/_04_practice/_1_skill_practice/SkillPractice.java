package _04_practice._1_skill_practice;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {
	
	SkillPractice skills = new SkillPractice();
    skills.skill1();
    skills.skill2();
    skills.skill3();
    skills.skill4();
    skills.skill5();
}

void skill1() {

String dimes = JOptionPane.showInputDialog("How many dimes do you have?");

int numdime = Integer.parseInt(dimes);

double dime = 0.0;
dime = numdime * 0.10;	

JOptionPane.showMessageDialog(null, dime);
String height = JOptionPane.showInputDialog("How tall are you?");

double checkheight = Double.parseDouble(height);

if (checkheight < 36) {
JOptionPane.showMessageDialog(null, "Eat your Wheatie's!");	

}
}
void skill2() {
	

	
	
}
void skill3() {
	

	
	
}
void skill4() {
String city = JOptionPane.showInputDialog("What city do you live in?");
if (city.equalsIgnoreCase("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in America's Finest City.");
}
else {
	JOptionPane.showMessageDialog(null, "Move to San Diego.");
}


}
void skill5() {
String school = JOptionPane.showInputDialog("What's the name of your school?");	
JOptionPane.showMessageDialog(null, school + " is a fantastic school!");
	
	
}
}

