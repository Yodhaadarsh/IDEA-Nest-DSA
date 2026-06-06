import java.util.*;

public class Pattern12 {
    public static void main(String[] args) {
        // Taking the number of rows from the user
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Initializing the first two terms of Fibonacci series
        int a = 0;
        int b = 1;

        // Outer loop to change the lines from 1 to n
        for (int i = 1; i <= n; i++) {
            
            // Inner loop runs exactly 'i' times for row number 'i'
            for (int j = 1; j <= i; j++) {
                // Always print 'a' which is the current term
                System.out.print(a + "\t");

                // Calculate the next Fibonacci term and update variables
                int c = a + b;
                a = b;
                b = c;
            }

            // Move cursor downward to the next row layout
            System.out.println();
        }

        scn.close();
    }
}