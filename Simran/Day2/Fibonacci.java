import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Taking input for how many Fibonacci numbers to print
        int n = scn.nextInt();
        
        // Initializing the first two numbers of the Fibonacci series
        int a = 0;
        int b = 1;
        
        // Loop runs 'n' times to print exactly 'n' numbers
        for (int i = 0; i < n; i++) {
            // Step 1: Print the current term (starts with 'a')
            System.out.println(a);
            
            // Step 2: Calculate the next term in the sequence
            int c = a + b;
            
            // Step 3: Shift/Swap values forward for the next iteration
            a = b; // 'a' moves to the next position
            b = c; // 'b' takes the newly calculated value
        }
        
        scn.close();
    }
}