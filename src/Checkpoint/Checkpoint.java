package Checkpoint;

import java.util.Random;

import javax.swing.JOptionPane;

public class Checkpoint {
	// 1. Create an integer variable and initialize it to a random number between
	// 0-4.
	// 2. Use a switch statement to print a different response based on the value of
	// the integer created in step 1.
	public static void main(String[] args) {
		Random rand = new Random();
		int randnum = rand.nextInt(5);

		switch (randnum) {
		case 0: {
			System.out.println("You have 0 rats in your home! Yay!");
			break;
		}
		case 1: {
			System.out.println("You have 1 mouse in your home!");
			break;
		}
		case 2: {
			System.out.println("You have 2 skunks in your home!");
			break;
		}
		case 3: {
			System.out.println("You have 3 beetles in your home!");
			break;
		}
		case 4: {
			System.out.println("You have 4 ants in your home!");
			break;
		}
		default: {
			System.out.println("Something went wrong... :-(");
			break;
		}
		}
	}
}