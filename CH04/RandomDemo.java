import java.util.Random;

public class RandomDemo {
    public static void main (String[] args) {
        
        // Instantiate (create) a Random object called 'fluffy'. Normally in production I wouldn't
        // name a variable 'fluffy', but it works well for this demonstration.
        Random fluffy = new Random();
      
        // Output three different random numbers
        System.out.println(fluffy.nextInt(100));
        System.out.println(fluffy.nextInt(100));
        System.out.println(fluffy.nextInt(100));
        
        System.out.println("\nGAME OVER MAN!!!!");
        
    }
}
