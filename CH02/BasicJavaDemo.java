public class BasicJavaDemo {
    
    public static void main (String[] args) {
        
        variableDemo();
        
        
        System.out.println("GAME OVER MAN!");
        
    }
    
    public static void variableDemo() {
        
        /*
        
        8 Primitive Data Types
        ======================
        
        int [integer]
        double [decimal]
        char [letter 'a', 'T', '7', '&']
        boolen [true or false]
        
        byte
        long
        short
        float
 
         */
         
         // DECLARE a variable before you use it.
         int age;
         
         // ASSIGN a value to 'age'
         age = 42;
         
         // You can DECLARE and ASSIGN all at once:
         int numberOfMountains = 46;
         
         /*
         CONVENTIONS FOR VARIABLE NAMING
         1. ALWAYS start with a lowercase letter
         2. No spaces
         3. Mash words together with camelCaseWriting
         4. DO NOT use special characters
         5. You CAN use numbers, just not as the first character 
              double gpa = 2.89;
              double gpa2 = 3.14;
         */
         
         
         
         // Declare and assign a double
         double gpa = 2.89; //2.89
         double price = 1;  // 1.0
        
         System.out.println("Your GPA is " + gpa);
         System.out.println("The price of a soda is " + price);
         System.out.println();
         
         int numerator = 10;
         int denominator = 3;
         
         System.out.println("10/3 = " + (1.0*numerator/denominator) );
         
         System.out.println();
         
         System.out.println("AGE = " + age);
         // lhs = rhs
         age = age + numberOfMountains;
         System.out.println("😀 AGE = " + age);
         
         // ERRORS
         // Logic error = OOPS! The program runs, but doesn't do what you want it to
         // Runtime error = The program runs but it will quit BADLY
         // Syntax error = The program doesn't even run (;)😀

    }
    
    
}
















