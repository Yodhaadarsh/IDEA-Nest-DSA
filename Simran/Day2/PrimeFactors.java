import java.util.*;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Step 1: Run the loop only up to the square root of n
        for (int div = 2; div * div <= n; div++) {
            
            // Step 2: Keep dividing n by 'div' until it's no longer divisible
            while (n % div == 0) {
                n = n / div; // Truncating the number
                System.out.print(div + " "); // Printing factor separated by space
            }
        }

        // Step 3: Critical Edge Case Check
        // If n hasn't reduced to 1, the remaining n is a prime factor itself
        if (n != 1) {
            System.out.print(n);
        }
        
        scn.close();
    }
}