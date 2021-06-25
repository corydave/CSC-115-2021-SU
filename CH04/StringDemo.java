import java.util.Scanner;

//  String =, +=, .equals, .charAt, .indexOf, .length, .substringx2
//  https://docs.oracle.com/javase/7/docs/api/index.html?java/lang/String.html

public class StringDemo {
    
    public static void main (String[] args) {
        
        // stringDemo();
        stringDemo2();
        
        System.out.println("\nGAME OVER MAN!!!");
        
    }
    
    public static void stringDemo2() {
        
        Scanner scanner = new Scanner(System.in);
        
        String fullName;
        
        System.out.println("Enter your name:");
        fullName = scanner.nextLine();
        
        System.out.println("\nEnter your last name:");
        fullName += " ";
        fullName += scanner.nextLine();
        
        // fullName += " " + scanner.nextLine();
        
        System.out.println("\n" + fullName);
        
        // fullName = "Dave Ghidiu"
        //             0123456789t
        
        System.out.println(fullName + " has " + fullName.length() + " characters.");
        System.out.println("The character in \"" + fullName + "\" in the 3rd spot is " + fullName.charAt(2));
        
    }
    
    
    
    public static void stringDemo() {
        
        // System.out.println("TEST");

        // Instantiate a scanner
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user
        System.out.println("What is your first name?");
        
        // Load the input from the user into 'firstName'
        String firstName = scanner.nextLine();
        
        // Prompt the user
        System.out.println("\nWhat is your last name?");
        
        // Load the input from the user into 'lastName'
        String lastName = scanner.nextLine();        
        
        String fullName = firstName + " " + lastName;
        System.out.println();
        System.out.println(fullName);
        
        scanner.close();
        
        
    }
    
}





















