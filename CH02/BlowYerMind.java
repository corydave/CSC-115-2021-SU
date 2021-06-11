// Dave Ghidiu
// 2020-06-11
// Demonstrate different outputting issues (CONCATENATION, TRUNCATING)

public class BlowYerMind {
    
    public static void main (String[] args) {
        
        System.out.print("Hi Dave---");
        System.out.println("Hi Dave");
        
        System.out.println();
        System.out.println("");
        
        System.out.println(2);
        System.out.println("2");
        System.out.println('2');
        System.out.println(2.0);
        
        System.out.println();
        
        System.out.println(2 + 3);   // 5
        System.out.println(5 - 2);   // 3
        
        System.out.println();
        
        System.out.println(2 + 3 + " Dave");
        System.out.println("Dave " + 2 + 3);
        System.out.println(2 + 3 + " Dave " + 2 + 3);
        System.out.println(2 + 3 + " Dave " + (2 + 3));
        
        System.out.println();
        
        System.out.println(5/2);
        
        int num = 5;
        int denom = 2;
        
        System.out.println(1.0*num/denom);
        
        System.out.println();
        
        System.out.println("I want sharks with frickin' laser beams.");
        System.out.println("I want sharks with frickin' \"laser beams\"");
        
        
        /*
        
        ESCAPE CHARACTERS
        
        \
        
        \" = how you output a double quote
        \n = new line
        \t = a tab
        
        */
        
        
        System.out.println("\nGAME OVER MAN!\n");
        
    }
    
}















