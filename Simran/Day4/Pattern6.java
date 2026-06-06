import java.util.*;

public class Pattern6 {
    public static void main(String[] args) {
        // Taking rows count from user (odd number input)
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // st is number of stars on one side, sp is spaces in middle
        int st = n / 2 + 1; 
        int sp = 1;         

        // Outer loop to handle all n rows line by line
        for (int i = 1; i <= n; i++) {
            
            // Loop 1: Prints left side stars
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            // Loop 2: Prints hollow spaces in the middle
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            // Loop 3: Prints right side stars
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            // Move to the next new line
            System.out.println();

            // Checking if we are in the upper part or lower part of diamond
            if (i <= n / 2) {
                // For upper half: stars decrease by 1, spaces increase by 2
                st--;
                sp += 2;
            } else {
                // For lower half: stars increase by 1, spaces decrease by 2
                st++;
                sp -= 2;
            }
        }

        scn.close();
    }
}