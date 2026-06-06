import java.util.*;

public class Pattern11 {
    public static void main(String[] args) {
        // Taking the size of the triangle from the user
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // val variable will keep track of the number to print next
        int val = 1;

        // Outer loop to control the rows from 1 to n
        for (int i = 1; i <= n; i++) {
            
            // Inner loop runs exactly 'i' times for the current row
            for (int j = 1; j <= i; j++) {
                // Print the current value followed by a tab space
                System.out.print(val + "\t");
                // Increment val so the next number is printed
                val++;
            }

            // Move to the next line after completing the row
            System.out.println();
        }

        scn.close();
    }
}