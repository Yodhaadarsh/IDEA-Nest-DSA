import java.util.*;

public class Pattern10 {
    public static void main(String[] args) {
        // Taking the size of the hollow diamond from the user
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // os means outer spaces, is means inner spaces between stars
        int os = n / 2;
        int is = -1; // Starting with -1 because row 1 has only 1 star

        // Outer loop to handle all rows from 1 to n
        for (int i = 1; i <= n; i++) {
            
            // Loop 1: Prints the initial outer spaces
            for (int j = 1; j <= os; j++) {
                System.out.print("\t");
            }

            // Printing the first star of the row
            System.out.print("*\t");

            // Loop 2: Prints inner spaces if they exist (not for row 1 and row n)
            if (is > 0) {
                for (int j = 1; j <= is; j++) {
                    System.out.print("\t");
                }
                // Printing the second star only if we are not on top or bottom row
                System.out.print("*\t");
            }

            // Move to the next horizontal line
            System.out.println();

            // Changing space counts based on upper or lower half of diamond
            if (i <= n / 2) {
                // Upper half: outer spaces decrease, inner spaces increase by 2
                os--;
                is += 2;
            } else {
                // Lower half: outer spaces increase, inner spaces decrease by 2
                os++;
                is -= 2;
            }
        }

        scn.close();
    }
}