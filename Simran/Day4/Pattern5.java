import java.util.*;

public class Pattern5 {
    public static void main(String[] args) {
        // Taking input for pattern size (always odd numbers)
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // sp is for spaces in the beginning, st is for stars
        int sp = n / 2; 
        int st = 1;     

        // Main loop to change lines from 1 to n
        for (int i = 1; i <= n; i++) {
            
            // This loop prints spaces for the current line
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t"); 
            }

            // This loop prints stars for the current line
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            // Move to the next line
            System.out.println();

            // Checking if we crossed the middle of the diamond
            if (i <= n / 2) {
                // If we are in the upper part, spaces decrease and stars increase by 2
                sp--;
                st += 2;
            } else {
                // If we are in the lower part, spaces increase and stars decrease by 2
                sp++;
                st -= 2;
            }
        }

        scn.close();
    }
}