import javax.swing.JOptionPane;

public class ChooseYourAdventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"You are trapped in an abandoned prison.\n The Warden has left all the prisoners to die and rot in their cells.\n The prison is on a volcano in the middle of the ocean and the volcano is expected to erupt in 3 weeks.\n Find your way out. ;)");
		int firstchoice = JOptionPane.showOptionDialog(null,
				"You see three weaknesses.\n There is a hole under the bed, a crack in the back wall, and a bent metal bar you could probably squeeze through.\n What option do you choose?",
				"Abandoned Prison Escape", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Hole under the bed", "Crack in the back wall", "Bent bar" }, null);
		if (firstchoice == 0) {
			holeunderbed();
		}
		if (firstchoice == 1) {

		}
	}

	public static void holeunderbed() {
		int holeunderbed = JOptionPane.showOptionDialog(null,
				"You go through the hole under the bed.\n You find yourself under the whole prison. There is another hole, or there is a wooden door. Which one do you go through? ",
				"Abandoned Prison Escape", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "hole", "door" },
				null);
		if (holeunderbed == 0) {
			 JOptionPane.showMessageDialog(null,
					"You fall through the hole, and it leads to the Earth's core, and you die.");

		}
		if (holeunderbed == 1) {
			gothroughdoor();
		}
	}

	public static void gothroughdoor() {
		int gothroughdoor = JOptionPane.showOptionDialog(null,
				"You find a metal shovel but it is half underground. \n You quickly realize you can't pull it out. \n You notice a shiny key on the bottom you assume are jail keys.\n but you also see a passageway leading who knows where. \n Do you go back or go through the passageway? ",
				"Abandoned Prison Escape", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "passageway", "go back" }, null);
		if (gothroughdoor == 0) {
			JOptionPane.showMessageDialog(null, "You go on forever until you die of hunger.");
		}

		if (gothroughdoor == 1) {
goback();
		}
	}
	public static void goback() {
		JOptionPane.showMessageDialog(null, "You go back, try to climb up, but you slip. then you fall through the hole, and it leads to the Earth's core, and you die.");
	}
	}



















