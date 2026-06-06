import java.util.*;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Outer loop handles the total number of rows
        for (int i = 1; i <= n; i++) {
            
            // Inner loop prints stars equal to the current row number 'i'
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t"); // Prints star followed by a tab space
            }
            
            // Moves the cursor to the next line after completing one row
            System.out.println();
        }

        scn.close();
    }
}
