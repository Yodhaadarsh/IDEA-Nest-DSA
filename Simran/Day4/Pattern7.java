import java.util.*;

public class Pattern7 {
    public static void main(String[] args) {
        // Taking matrix size input from user
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Outer loop to handle row changes from 1 to n
        for (int i = 1; i <= n; i++) {
            
            // Inner loop to handle column changes from 1 to n
            for (int j = 1; j <= n; j++) {
                
                // If row index matches column index, print a star
                if (i == j) {
                    System.out.print("*\t");
                } else {
                    // Otherwise, just leave it blank with a tab space
                    System.out.print("\t");
                }
            }
            
            // Move to the next horizontal line
            System.out.println();
        }

        scn.close();
    }
}