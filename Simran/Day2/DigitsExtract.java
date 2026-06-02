import java.util.*;

public class DigitsExtract {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Phase 1: Count total digits using a temporary reference variable
        int nod = 0; // Tracks number of digits
        int temp = n;
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }

        // Phase 2: Compute dynamic high-order base-10 divisor
        // Typecasted to (int) to prevent floating-point precision error
        int div = (int) Math.pow(10, nod - 1);

        // Phase 3: Extraction loop governed strictly by divisor validity
        while (div != 0) {
            int q = n / div;        // Isolate leftmost digital component
            System.out.println(q);  // Print target digit line-by-line

            n = n % div;            // Truncate processed block from actual number
            div = div / 10;         // Reduce place-value scale factor dynamically
        }
        scn.close();
    }
}