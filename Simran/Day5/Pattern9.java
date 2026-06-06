import java.util.*;

public class Pattern9 {
    public static void main(String[] args) {
        // Taking the size of the cross pattern from the user
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Outer loop to control the rows from 1 to n
        for (int i = 1; i <= n; i++) {
            
            // Inner loop to control the columns from 1 to n
            for (int j = 1; j <= n; j++) {
                
                // If we are on the main diagonal OR the anti-diagonal, print a star
                if (i == j || i + j == n + 1) {
                    System.out.print("*\t");
                } else {
                    // Otherwise, just leave a blank tab space
                    System.out.print("\t");
                }
            }

            // Move the cursor to the next line after completing a row
            System.out.println();
        }

        scn.close();
    }
}
