import java.util.*;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.util.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        // Step 1: Count the total number of digits
        int nod = 0;
        int temp = n;
        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }

        // Step 2: Handle Edge Cases (Large k and Negative k values)
        k = k % nod; // Scaling down k if it exceeds total digits length
        if (k < 0) {
            k = k + nod; // Transforming negative rotations to positive mirror equivalent
        }

        // Step 3: Initialize mathematical operators
        int div = 1;
        int mult = 1;

        // Step 4: Construct Divisor and Multiplier dynamically via loop checks
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div = div * 10;   // Builds 10^k
            } else {
                mult = mult * 10; // Builds 10^(nod - k)
            }
        }

        // Step 5: Perform structural split and calculate response
        int q = n / div;
        int r = n % div;

        int rotatedNumber = (r * mult) + q;

        System.out.println(rotatedNumber);
        scn.close();
    }
}