import java.util.*;

public class PrintPrimes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Taking the lower bound and upper bound of the range
        int low = scn.nextInt();
        int high = scn.nextInt();

        // Outer loop: Iterating through every number in the given range
        for (int n = low; n <= high; n++) {
            int count = 0;

            // Inner loop: Checking if the current number 'n' is prime using square root optimization
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break; // Factor found, no need to check further for this number
                }
            }

            // If count remains 0, the number has no factors other than 1 and itself
            if (count == 0) {
                System.out.println(n);
            }
        }
        scn.close();
    }
}