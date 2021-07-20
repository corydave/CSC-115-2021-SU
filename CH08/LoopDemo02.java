import java.util.Scanner;
import java.util.Random;

public class LoopDemo02 {
    
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        
        System.out.println("\"" + word + "\" in uppercase is \"" + wordToUppercase(word) + "\"");
        
        System.out.println("\nGAME OVER MAN!!!");
        
    }
    
    public static String wordToUppercase(String word) {
        
        String uppercaseWord = "";
        
        for (int i = 0; i < word.length(); i++) {
            
            char temp = word.charAt(i);
            
            if (temp >= 97 && temp <= 122) {
            
                temp -= 32;
                uppercaseWord += temp;
            
            } else {
                
                uppercaseWord += temp;
                
            }
            
        }
        
        return uppercaseWord;
        
    }
    
    
    
}





















