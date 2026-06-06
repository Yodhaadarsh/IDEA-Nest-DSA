import java.util.*;

public class Pattern4 {
    public static void main(String[] args) {
        // Initialize scanner to read the size of the matrix pattern from the user
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Establishing variables for the initial row state (Row 1 configuration)
        int sp = 0; // Row 1 starts with exactly 0 layout spaces
        int st = n; // Row 1 starts with maximum stars equal to n

        // Outer loop manages the total vertical rows from line 1 to n
        for (int i = 1; i <= n; i++) {
            
            // Inner Loop 1: Prints out the trailing layout spaces for alignment
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t"); 
            }

            // Inner Loop 2: Prints out the corresponding star elements block
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            // Shifts the terminal cursor down to start the next horizontal line
            System.out.println();

            // Sumeet Sir's Step Modification: Prepare state counters for the upcoming row
            sp++; // Space count increases by 1 for the next row layout
            st--; // Star count decreases by 1 for the next row layout
        }

        scn.close();
    }
}
