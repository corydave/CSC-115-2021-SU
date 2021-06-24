import java.util.Scanner;
// Could use java.util.*
// That's a wildcard! It will import ALL classes in the util package:
// https://docs.oracle.com/javase/7/docs/api/

public class ScannerDemo {
    
    public static void main (String[] args) {
        
        scanDemo();

        System.out.println("\nGAME OVER MAN!!!"); // #BillPaxton
        
    }
    
    public static void scanDemo() {
        
        // System.out.println("test");
        
        // Create (instantiate) a scanner to get input from the user
        // ONCE PER PROGRAM!!!!
        Scanner scanner = new Scanner(System.in);
        
        // PROMPT the user
        System.out.println("😊  Enter your first name:");
        
        // GET what the user types in and store it
        String firstName = scanner.nextLine();
        
        // ECHO the value of 'firstName'
        // System.out.println(firstName);
        
        System.out.println("\nOkay, " + firstName + ", what is your last name?");
        String lastName = scanner.nextLine();
        
        // ECHO the value of 'lastName'
        // System.out.println(lastName);        
        
        System.out.println("\nWhat is your age?");
        int age = scanner.nextInt();
        
        // ECHO the value of 'int'
        // System.out.println(age);
        
        // Don't forget you can use scanner.nextDouble() for a decimal
        
        // Since the last time we used the scanner it read in an int (this is true for double, too)
        // We need to send it to the next line manually so it's positioned to read the next String
        // I know. It's dumb. By do we have to do this? Well, Java.
        // BTW, there _IS_ a good reason for this. You'll learn WHY later.
        scanner.nextLine();
        
        System.out.println("\nWhat is your middle name?");
        String middleName = scanner.nextLine();
        
        // System.out.println("DEBUG middleName = " + middleName);
        
        scanner.close();
        
    }
    
    
    
}



/*

TEXT FILE VISUAL

Enter your name:
DAVE

Enter your last name:
GHIDIU

Enter your age:
42

Enter your middle name:
RYAN

=============


️️DAVE
GHIDIU
42
➡RYAN


*/
