package _03_Switch_Statement_Practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		// use a switch statement to do something cool for each option

	switch (input) {
		case 0:
			//Sunday
			JOptionPane.showMessageDialog(null, "Oh no! School starts tomorrow! :(");
			break;
		case 1:
			//Monday
			JOptionPane.showMessageDialog(null, "Welcome to the worst day of the week.");
			break;
		case 2:
			//Tuesday
			JOptionPane.showMessageDialog(null, "Can we eat tacos today?");
			break;
		case 3:
			//Wednesday
			JOptionPane.showMessageDialog(null, "So close. Yet so far. 2 days of school until the weekend!");
			break;
		case 4:
			//Thursday
			JOptionPane.showMessageDialog(null, "Time to code something!");
			break;
		case 5:
			//Friday
			JOptionPane.showMessageDialog(null, "Last day of school for this week!");
			break;
		case 6:
			//Saturday
			JOptionPane.showMessageDialog(null, "It's the weekend!");
			break;
		default:
			System.out.println("Something went wrong :(");
			break;
		}
	}
}
