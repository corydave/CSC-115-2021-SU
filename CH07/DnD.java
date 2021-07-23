import java.util.Scanner;
import java.util.Random;

public class DnD {
    
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    
    public static void main (String[] args) {
        
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        
        System.out.println("Roll for strength.");
        int strength = diceRoll(20);
        System.out.println("DEBUG: 'strength' = " + strength);
        
        System.out.println("Roll for armor.");
        int armor = diceRoll();
        System.out.println("DEBUG: 'armor' = " + armor);
        
        System.out.println("Roll for speed.");
        int speed = diceRoll(2, 20);
        System.out.println("DEBUG: 'speed' = " + speed);
        
    }
    
    public static int diceRoll(int numOfDice, int sides) {
        
        int total = 0;
        
        for (int i = 0; i < numOfDice; i++) {
            
            total += random.nextInt(sides) + 1;
            
        }
        
        return total;
        
    }
    
    public static int diceRoll() {
        
        return random.nextInt(6) + 1;
        
    }
    
    public static int diceRoll(int sides) {
        
        return random.nextInt(sides) + 1;
        
    }
    
    
    
}






















