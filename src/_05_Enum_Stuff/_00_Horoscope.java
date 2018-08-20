package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs. - given
	public static void enumDisplay(Zodiac z) {
		// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
		// to display
		// a different horoscope based on the Zodiac's state.
		switch (z) {
		// ARIES, TAURUS, GEMINI, CANCER, LEO, VIRGO, LIBRA
		case ARIES: {
			JOptionPane.showMessageDialog(null,
					"You are courageous, determined and confident. However, you can be impatient, moody and aggressive. You enjoy individual sports and comfortable clothes but despise inactivity and delays.");
			break;
		}
		case TAURUS: {
			JOptionPane.showMessageDialog(null,
					"You are reliable and patient but can be stubborn. You enjoy gardening, cooking and music. You strongly dislike sudden changes and synthetic fabrics.");
			break;
		}
		case GEMINI: {
			JOptionPane.showMessageDialog(null,
					"You are gentle and affectionate but can be nervous and inconsistent. You enjoy music, books and magazines. You dislike being alone and repetition.");
			break;
		}
		case CANCER: {
			JOptionPane.showMessageDialog(null,
					"You are tenacious and loyal but can be moody and pessimistic. You enjoy art and a good meal with friends. You dislike strangers.");
			break;
		}
		case LEO: {
			JOptionPane.showMessageDialog(null,
					"You are creative and passionate but can be arrogant and stubborn. You enjoy theater and taking holidays. You dislike being ignored and facing difficult realities.");
			break;
		}
		case VIRGO: {
			JOptionPane.showMessageDialog(null,
					"You are loyal and kind but can be shy. You enjoy aninmals and healthy food. You dislike rudeness.");
			break;
		}
		case LIBRA: {
			JOptionPane.showMessageDialog(null,
					"You are cooperative but can be indicisive. You enjoy harmony and the outdoors. You dislike injustice.");
			break;
		}
		// SCORPIO, SAGITTARIUS,CAPRICORN, AQUARIUS, PISCES
		case SCORPIO: {
			JOptionPane.showMessageDialog(null,
					"You are resourceful but can be distrusting. You enjoy being right and facts. You dislike passive people.");
			break;
		}
		case SAGITTARIUS: {
			JOptionPane.showMessageDialog(null,
					"You are generous and idealistic but make more promises than you can deliver. You enjoy freedom. You dislike details.");
			break;
		}
		case CAPRICORN: {
			JOptionPane.showMessageDialog(null,
					"You are responsible and disciplined but can be unforgiving. You enjoy family and tradition. You dislike almost everything at some point.");
			break;
		}
		case AQUARIUS: {
			JOptionPane.showMessageDialog(null,
					"You are progressive and original but can be tempermental. You enjoy helping others and fun with friends. You dislike limitations and broken promises.");
			break;
		}
		case PISCES: {
			JOptionPane.showMessageDialog(null,
					"You are compassionate, artistic and gentle. However, you can also be fearful and overly trusting at times. You enjoy being alone and swimming. You dislike any cruelty.");
			break;
		}
		}
	}

	// 3. Make a main method to test your method
	public static void main(String[] args) {
		enumDisplay(Zodiac.PISCES);
		//Checked all.
	}
}
