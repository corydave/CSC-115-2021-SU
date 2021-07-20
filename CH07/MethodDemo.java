import java.util.Scanner;
import java.util.Random;


public class MethodDemo {

	// Global variable
	static Random random = new Random();
	
	public static void main(String[] args) {

		System.out.println("HI! Welcome to the program!");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = scanner.nextLine();
		
		int userChoice = displayMenu(name, scanner);
		
//		System.out.println("choice = " + choice);
		System.out.println("DEBUG: choice = " + userChoice);
		System.out.println("\nTEST: " + random.nextInt());
		
		System.out.println("\nGAME OVER MAN!!!");
		
		scanner.close();
		
	}
	
	public static int displayMenu(String name, Scanner sc) {
		
		System.out.println("\n" + name + ", please select from the following menu:");
		System.out.println("   1. Name Game");
		System.out.println("   2. Age Game");
		System.out.println("   3. Birthday Game");
		
		System.out.println();
		
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		
		System.out.println("\nTEST: " + random.nextInt());

		
		return choice;
		
	}
	
	// Method overloading
	// Two methods with the same name BUT different parameter lists
	public static void displayMenu(Scanner sc, String name) {
		System.out.println("Blergh!");
	}

}
















