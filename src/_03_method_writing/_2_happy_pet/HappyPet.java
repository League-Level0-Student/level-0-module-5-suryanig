package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	static int happinesLevel = 0;
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String choice = JOptionPane.showInputDialog("What kind of pet would you like to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
//while loop!!!!!!		
//methods clean and food and water
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet", "Happy Pet", 0, JOptionPane.QUESTION_MESSAGE, null,
					new String[] { "Food and Water", "Clean", "Play" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if (task == 2) {
	play(choice);
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
static void	play(String pet) {
	if (pet.equalsIgnoreCase("dog")) {
		happinesLevel += 5;
	}
	else if (pet.equalsIgnoreCase("cat")) {
		happinesLevel += 3;
	}
	else if (pet.equalsIgnoreCase("fish")) {
		happinesLevel += 1;
	}
	else if (pet.equalsIgnoreCase("bird")) {
		happinesLevel += 2;
	}
	else {
		JOptionPane.showMessageDialog(null, "I don't have that type of animal in store right now. Sorry!");
	}
System.out.println(happinesLevel);		
}
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}
