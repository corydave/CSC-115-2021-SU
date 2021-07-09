

import java.util.Scanner;

public class SwitchDemo {
    
    public static void main (String[] args) {
        
        switchItGood();
        
        System.out.println("\nGAME OVER MAN!!!!");
        
    }
    
    public static void switchItGood() {
        
        // System.out.println("DEBUG: switchItGood()");
        
        displayMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        
        switch (choice) {
            
            case 1: System.out.println("Great choice! George RR Martin killed it writing the books the TV show is based on!");
                    System.out.println("Amazing show!");
                    break;
                    
            case 2: System.out.println("Ahhh! Based on the movie from the 70s!");
                    break;
            
            case 3: System.out.println("30+ seasons and doing well!");
                    break;            
                    
            case 4: System.out.println("The Rick and Morty of the MCU!");
                    break;            
                    
            case 5: System.out.println("Stop what you are doing and watch all 4 seasons RIGHT NOW!");
                    break;
                    
            default: System.out.println("You didn't choose 1-5");
        }
        
        
        
    }
    
    public static void displayMenu() {
        
        System.out.println("Please select from the following:");
        System.out.println("\t1. Game of Thrones");
        System.out.println("\t2. Westworld");
        System.out.println("\t3. Simpsons");
        System.out.println("\t4. Loki");
        System.out.println("\t5. Money Heist");
        
    }
    
}




































