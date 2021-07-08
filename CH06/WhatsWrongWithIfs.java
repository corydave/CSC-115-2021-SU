import java.util.Scanner;

public class WhatsWrongWithIfs {

    public static void main (String[] args) {
        
        ifsAreLit();
        
        System.out.println("\nGAME OVER MAN!!!");
        
    }

    public static void ifsAreLit() {
        
        // System.out.println("DEBUG: ifsAreLit()");
        
            int num = 9;
            String remainder = "";
            
            if (num % 2 == 0) {
              remainder = "even";
            } else {
              remainder = "odd";
            }
            
            System.out.println("The number is " + remainder);        
        
    }
    
}




























