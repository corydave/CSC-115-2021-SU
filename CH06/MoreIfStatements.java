import java.util.Scanner;
import java.util.Random;

public class MoreIfStatements {
    public static void main (String[] args) {
        
        // moreIfs61();
        moreIfs62();
        System.out.println("\nGAME OVER MAN!!!");
        
    }
    
    public static void moreIfs62() {
        
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter your age:");
        // int age = scanner.nextInt();
        
        // if (age != 42) {
        //     System.out.println("BORING AGE!");
        // } else {
        //     System.out.println("COOL AGE");
        // }
        
        boolean isDoorOpen = false;
        boolean isAlarmSet = false;
        
        // AND statements require BOTH PARTS to be true
        // OR  statements require ONLY ONE part to be true (but both CAN be true)
        if ( ((isDoorOpen == true) && (isAlarmSet == true)) || panicButtonPressed == true) {
            // code to sound alarm
        }
        
        // isDoorOpen = !isDoorOpen;
        
    }
    
    public static void moreIfs61() {
        
        // System.out.println("DEBUG: moreIfs()");
        
        int grade = 95;
        String letterGrade = "";
        
        if (grade >= 90) {
            letterGrade = "A";
        } else if (grade >= 80) {
            letterGrade = "B";
        } else if (grade >= 70) {
            letterGrade = "C";
        } else if (grade >= 65) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        
        
        //  if (grade >= 65) {
        //     letterGrade = "D";
        // } else if (grade >= 70) {
        //     letterGrade = "C";
        // } else if (grade >= 80) {
        //     letterGrade = "B";
        // } else if (grade >= 90) {
        //     letterGrade = "A";
        // } else {
        //     letterGrade = "F";
        // }
        
        System.out.println("Your grade is: " + letterGrade);
        
    }
}



























