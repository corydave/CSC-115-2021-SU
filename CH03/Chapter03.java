public class Chapter03 {
    public static void main (String[] args) {
        
        // roundingErrors();
        // constants();
        casting();
        
        System.out.println("\nGAME OVER MAN!!!");
        
    }
    
    public static void roundingErrors() {
        
        System.out.println(0.7 + 0.1); // 0.8
        
    }
    
    public static void constants() {
        
        
        
        /*
        
        WHOLE NUMBERS - INTEGERS
        int [short long byte]
        
        DECIMALS
        double [float]
        
        */
        
        // CONSTANTS
        
        final double TAX_RATE = 0.07;
        
        double priceOfReeses = 1.99;
        int amount = 3;
        
        System.out.println("AMT OF REESES = " + amount);
        System.out.println("PRICE         = " + priceOfReeses);
        System.out.println("---------------------------");
        System.out.println("TAX           = " + (priceOfReeses * amount * TAX_RATE));
        System.out.println("TOTAL         = " + (priceOfReeses * amount * (1.0 + TAX_RATE)));
        
        
    }
    
    public static void casting() {
        
        double number = 34.934346245;
        
        System.out.println(number);
        System.out.println( (int)number );
        
        int anotherNumber = 3;
        
        // System.out.println(  ((int)number) / anotherNumber  );
        
        double dollarValue = ((int)(number/anotherNumber * 100) / 100.0);
        
        System.out.println("\nDollars " + dollarValue);
        
        
        
        
    }
}




















