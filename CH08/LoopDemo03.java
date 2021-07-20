import java.util.Scanner;

public class LoopDemo03 {

	public static void main(String[] args) {
		
		headsOrTails();
		
		System.out.println("GAME OVER MAN!!!");
	}

	public static void headsOrTails() {
		
		Scanner sc = new Scanner(System.in);
		
		int guessedRight = 0;
		int numberOfRounds = 0;
		
		int playAgain = -1;
		
		while (playAgain != 2) {
    		
    		int flip = (int)(Math.random()*2);
    		
    		System.out.println("0 is heads and 1 is tails.");
    		System.out.println("What is your guess (0 or 1)?");
    		int guess = sc.nextInt();
    		
    		System.out.println();
    		System.out.println("The computer got " + flip + ".");
    		
    		if(guess == flip) {
    			System.out.println("You guessed right!");
    			guessedRight++;
    		} else {
    			System.out.println("Sorry, try again next time!");
    		}
    		
    		numberOfRounds++;
    		
    		System.out.println("Would you like to play again (1 for YES, 2 for NO):");
    		playAgain = sc.nextInt();
    		
    		System.out.println();
    		
		}

        System.out.println("SCORE = " + guessedRight + " out of " + numberOfRounds);

	    sc.close();   

	}

}
