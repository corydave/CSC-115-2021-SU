import java.util.Scanner;

public class WhatsWrongWithLoops {

    public static void main (String[] args) {
        
        loopsAreLit();
        
        System.out.println("\nGAME OVER MAN!!!");
        
    }

    public static void loopsAreLit() {
        
        // System.out.println("DEBUG: loopsAreLit()");
        
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




























