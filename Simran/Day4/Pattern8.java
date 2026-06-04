import java.util.*;

public class Pattern8 {
    public static void main(String[] args) {
        // Input size for the matrix from the user
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Outer loop for managing rows from 1 to n
        for (int i = 1; i <= n; i++) {
            
            // Inner loop for managing columns from 1 to n
            for (int j = 1; j <= n; j++) {
                
                // If the sum of row and column equals n + 1, print a star
                if (i + j == n + 1) {
                    System.out.print("*\t");
                } else {
                    // Otherwise, just leave a tab space for formatting
                    System.out.print("\t");
                }
            }

            // Jump to the next new line after completing the row
            System.out.println();
        }

        scn.close();
    }
}