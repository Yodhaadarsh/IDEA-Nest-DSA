import java.util.*;

public class Pattern13 {
    public static void main(String[] args) {
        // Taking the number of rows from the user
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Outer loop to control rows from 0 to n-1 (helps in combination math)
        for (int i = 0; i < n; i++) {
            
            // icj will hold the value of current cell (starts with iC0 which is always 1)
            int icj = 1; 

            // Inner loop to control columns from 0 to i
            for (int j = 0; j <= i; j++) {
                
                // Printing the current combination value with a tab space
                System.out.print(icj + "\t");

                // Formula to calculate the next combination value (iCj+1) from current iCj
                int icjp1 = icj * (i - j) / (j + 1);
                
                // Updating our variable for the next loop run
                icj = icjp1;
            }

            // Move to the next line after finishing the row
            System.out.println();
        }

        scn.close();
    }
}