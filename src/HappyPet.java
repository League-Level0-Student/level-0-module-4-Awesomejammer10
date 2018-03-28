import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable

		String wantedPet = JOptionPane.showInputDialog("What kind of pet do you want? Dog or Cat");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "What do you want to make your pet happy?", "Happiness of Pets",
				0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "cuddle", "feed", "walk" }, null);

		// 5. Use user input to call the appropriate method created in step 4.

		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	static void walkPet(String wantedPet) {

		if (wantedPet.equals("cat")) {
			happinessLevel -= 1;
			JOptionPane.showMessageDialog(null,
					"Your pet is tired and mad and their happiness level is " + happinessLevel);

		}

		else if (wantedPet.equals("dog")) {
			happinessLevel += 1;
			JOptionPane.showMessageDialog(null,
					"Your pet is tired but happy and their happiness level is " + happinessLevel);
		}

	}

	static void cuddlePet(String wantedPet) {
		if (wantedPet.equals("cat")) {
			happinessLevel -= 1;
			JOptionPane.showMessageDialog(null, "Your cat liked it and her happiness level is " + happinessLevel);

		}

		else if (wantedPet.equals("dog")) {
			happinessLevel += 1;
			JOptionPane.showMessageDialog(null, "Your dog is happy and their happiness level is " + happinessLevel);

		}
	}
}
