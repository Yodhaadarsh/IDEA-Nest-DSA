import java.util.*;

public class Pattern3 {
    public static void main(String[] args) {
        // Initialize scanner to intercept input configuration limits from the user
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Core dynamic counters assignment for the initial structural baseline
        int sp = n - 1; // Row 1 always initiates with (n - 1) blank zones
        int st = 1;     // Row 1 always initiates with exactly 1 star unit

        // Outer loop manages the total vertical line count
        for (int i = 1; i <= n; i++) {
            
            // Inner Loop 1: Executes printing routines for trailing space zones
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t"); // Utilizes horizontal tab space formatting
            }

            // Inner Loop 2: Executes printing routines for star blocks
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t"); // Appends uniform tab space after each star unit
            }

            // Terminates the current row layer and wraps context to the next line
            System.out.println();

            // Mutate layout state structures dynamically to configure the next row matrix
            sp--; // Space allocation drops down by one unit
            st++; // Star allocation scales up by one unit
        }

        scn.close();
    }
}