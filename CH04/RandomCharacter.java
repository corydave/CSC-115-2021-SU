import java.util.*;

public class RandomCharacter {
    public static void main (String[] args) {
        
        // Create (instantiate) an object called 'rand' of the 'Random' class
        Random rand = new Random();
        
        // Output a character that has the decimal value between 65 and 90
        System.out.println(  (char)(rand.nextInt(26) + 65)  );
        
        // Output a character that has the decimal value between 65 and 90
        System.out.println(  (char)(rand.nextInt(26) + 'A')  );
        
        
        
        System.out.println("\nGAME OVER MAN!!!");
        
    }
}
