import java.util.Scanner;
import java.util.Random;

public class ArrayDemo {
    
    public static void main (String[] args) {
        
        
        arrayDemo01();
        arrayDemo02();
        arrayDemo03();
        
        System.out.println("\nGAME OVER MAN!!!");
        
    }
    
    public static void arrayDemo03() {
        
     int[]   numbers = new int[10];
     Scanner scanner = new Scanner(System.in);
     
     for (int i = 0; i < numbers.length; i++) {
        System.out.println("Enter a number:");
        numbers[i] = scanner.nextInt();
        System.out.println();
     }
     
     printArray(numbers);
     printArrayBackwards(numbers);
     System.out.println("The biggest value is " + findMax(numbers));
     
     
        
    }
    
    
    public static void arrayDemo02() {
        
        int[] temps = {91, 88, 67, 81, 99};
        System.out.println(temps);
        System.out.println("--------------");
        
        System.out.println();
        printArray(temps);
        System.out.println("The biggest value is " + findMax(temps));
        
        
    }
    
    public static void arrayDemo01() {
        
        // System.out.println("DEBUG: 'arrayDemo()'");
        
        int[] grades = new int[15];
        
        grades[0] = 100;
        grades[1] = 90;
        grades[2] = 55;
        grades[3] = 83;
        grades[4] = 38;
        grades[5] = 0;
        grades[6] = 34;
        grades[7] = 101;
        grades[8] = 100;
        grades[9] = 93;
        grades[10] = 76;
        grades[11] = 99;
        grades[12] = 66;
        grades[13] = 76;
        grades[14] = 77;
        // grades[15] = 88;
        
        System.out.println("Your grades are: " + grades);
        System.out.println();
        
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Grade " + i + ": " + grades[i]);
        }
        
        System.out.println("--------------");
        
        printArray(grades);
        System.out.println("The biggest value is " + findMax(grades));
        
    }
    
    public static void printArray(int[] arr) {
        
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + ", ");
        }
        
        System.out.println(arr[arr.length-1]);        
        
    }
    
    public static void printArrayBackwards(int[] arr) {
        
        for (int i = arr.length-1; i > 0; i--) {
            System.out.print(arr[i] + ", ");
        }
        
        System.out.println(arr[0]);        
        
    }
    
    public static int findMax(int[] arr) {
        
        int max = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            
            if (max < arr[i]) {
                max = arr[i];
            }
            
        }
        
        return max;
        
    }
    
    
    
}
















