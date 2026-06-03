import java.util.*;

public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Step 1: Count the total number of digits first
        int temp = n;
        int nod = 0; // nod stands for Number Of Digits
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }

        // Step 2: Create a divisor as 10 raised to the power of (nod - 1)
        int div = (int) Math.pow(10, nod - 1);

        // Step 3: Extract and print digits from left to right
        while (div != 0) {
            int q = n / div; // Extracting the leftmost digit (Quotient)
            System.out.println(q);

            n = n % div; // Updating the number to remove the processed digit (Remainder)
            div = div / 10; // Reducing the divisor for the next iteration
        }

        scn.close();
    }
}