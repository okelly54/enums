package rock;

import java.util.Random;
import java.util.Scanner;

public class RockPaper {

	enum RPS {
		ROCK, PAPER, SCISSORS;
	}

	public static void main(String[] args) {
		// output results
	}

	public RPS randomMethod() {
		int rand = new Random().nextInt(3);
		if (rand == 0) {

		}
		return null;
	}

	public String rockpaper() {
		boolean rock = false;
		boolean paper = false;
		boolean scissors = false;

		Random rand = new Random();
		int num = rand.nextInt(3); // 0, 1, 2

		if (num == 0) {
			rock = true;
		} else if (num == 1) {
			paper = true;
		} else {
			scissors = true;
		}

		Scanner userInput = new Scanner(System.in);
		String userAnswer = userInput.nextLine();
		String results = "";

		return results;
	}

}
