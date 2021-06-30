import java.util.*;

public class IfDemo {
    
    public static void main (String[] args) {
        
        // Call a method named 'ifDemo()'
        ifDemo();
        
        System.out.println("\nGAME OVER MAN!!!");
        
    }
    
    public static void ifDemo() {
        
        // System.out.println("DEBUG: 'ifDemo()'");
        
        /*
        
         == tests for equality in primitive data types
         != not equal
         < less than
         > greater than
         <= less or equal to
         >= greater than or equal to
         
         if ( <CONDITION> ) {
             // put code here to execute if the condition is TRUE
         }
         
         
           int a = 10;
           int b = 20;
           
           if (a == b) {
               
               
           }
         
         .equals for objects
            String firstName = "Dave";
            String otherName = "David";
            
            if (firstName.equals(otherName)) {
                
            }
        
        */
        
        // Create/instantiate a Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for a number and store as 'firstNum'
        System.out.println("Enter a number:");
        int firstNum = scanner.nextInt();
        
        // Prompt user for a second number and store as 'secondNum'
        System.out.println("Enter another number:");
        int secondNum = scanner.nextInt();
        
        // Compare the two. _IF_ they are equal, do something!
        if (firstNum == secondNum) {
            // System.out.println(firstNum + " is greater than " + secondNum);
            System.out.println(firstNum + " is equal to " + secondNum);
            System.out.println("Thanks for playing.");
        }
        
        
        
        
        
        
    }
}
