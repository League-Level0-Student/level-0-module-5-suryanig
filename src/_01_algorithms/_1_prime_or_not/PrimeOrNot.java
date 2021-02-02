package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	
String answer = JOptionPane.showInputDialog("Choose any number you would like.");	

int num = Integer.parseInt(answer);

for (int i = 2; i < num/2; i++) {
	if (num % i == 0) {
		JOptionPane.showMessageDialog(null, "Your number is not prime.");
		System.exit(0);
	}
	
}
JOptionPane.showMessageDialog(null, "You number is prime!");
	
}
}
