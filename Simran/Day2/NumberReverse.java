import java.util.*;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Taking the original input integer from user
        int n = scn.nextInt();

        // Loop continuous until the number value reduces down to 0
        while (n > 0) {
            int dig = n % 10;          // Isolate the last digit using modulo
            System.out.println(dig);   // Print the isolated digit immediately line-by-line
            
            n = n / 10;                // Truncate the processed digit from the number
        }
        scn.close();
    }
}