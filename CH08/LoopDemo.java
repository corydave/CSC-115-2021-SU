import java.util.Scanner;
import java.util.Random;

public class LoopDemo {

    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers?");
        int limit = scanner.nextInt();
        
        whileLoop(limit);
        forLoop(limit);
        
        System.out.println("GAME OVER MAN!!!");
        
    }

    public static void forLoop(int limit) {
        
        System.out.println("FOR LOOP DEMO");
        
        for (int i = 0; i < limit; i++) {
            System.out.println("Number: " + i);
        }
        
        System.out.println();
        
        int j = 0;
        for (; j < 10; ) {
            System.out.println("Number: " + j);
            j++;
        }
     
        
    }


    public static void whileLoop(int limit) {
        
        System.out.println("WHILE LOOP DEMO");
        
        int counter = 0;
        
        while (counter < limit) {
            System.out.println("Number: " + counter);
            counter++;
        }
        
    }
}





















