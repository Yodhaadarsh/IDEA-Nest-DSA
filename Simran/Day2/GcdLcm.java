import java.util.*;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Input two integers to evaluate GCD and LCM
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        // Storing original values since n1 and n2 will be mutated in the loop
        int originalN1 = n1;
        int originalN2 = n2;

        // Euclidean Algorithm: Iterative division until remainder hits zero
        while (n1 % n2 != 0) {
            int rem = n1 % n2; // Capture remainder dynamically
            
            // Shifting references: Dividend takes Divisor, Divisor takes Remainder
            n1 = n2;
            n2 = rem;
        }

        // The final non-zero divisor is stored in n2, which is our GCD
        int gcd = n2;

        // Calculating LCM using the standard mathematical formula
        int lcm = (originalN1 * originalN2) / gcd;

        // Printing results line-by-line as per output specs
        System.out.println(gcd);
        System.out.println(lcm);

        scn.close();
    }
}