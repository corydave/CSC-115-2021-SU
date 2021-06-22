import java.util.Scanner;
import java.util.Random;
// Could use java.util.*
// That's a wildcard! It will import ALL classes in the util package:
// https://docs.oracle.com/javase/7/docs/api/

public class ScannerDemo {
    public static void main (String[] args) {
        
        // Create (instantiate) a scanner to get input
        // Once per program!!!!
        Scanner scanner = new Scanner(System.in);
        
        // PROMPT the user
        System.out.println("😊 Enter your first name:");
        
        // GET what the user types in and store it
        String firstName = scanner.nextLine();
        
        // ECHO the value of 'firstName'
        // System.out.println(firstName);
        
        System.out.println("Okay, " + firstName + ", what is your last name?");
        String lastName = scanner.nextLine();
        
        // ECHO the value of 'lastName'
        // System.out.println(lastName);
        
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        
        // ECHO the value of 'favoriteNumber'
        // System.out.println(favoriteNumber);
        
        // Since the last time we used the scanner it read in an int (this is true for double, too)
        // we need to send it to the next line manually so it's positioned to read the next String
        // I know. It's dumb. Why do we have to do this? Well, Java. 
        scanner.nextLine();
        
        System.out.println("What is your middle name?");
        String middleName = scanner.nextLine();
        
        
        
        System.out.println("GAME OVER MAN!!!"); // #BillPaxton
        
    }
}
