import java.util.*;

public class NumberInverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int inv = 0;        // Variable to accumulate the final inverse number
        int op = 1;         // Original Position tracking (1-based from right-to-left)

        while (n != 0) {
            int od = n % 10; // Extracting the Original Digit from the rightmost end

            // The Core Transformation Principle: Roles Interchanged
            int id = op;     // Inverted Digit takes the value of the Original Position
            int ip = od;     // Inverted Position takes the face value of the Original Digit

            // Math accumulation using base-10 exponent values
            inv = inv + id * (int) Math.pow(10, ip - 1);

            n = n / 10;     // Stripping down the processed digit
            op++;           // Advancing the positional index for the next digit
        }

        System.out.println(inv);
        scn.close();
    }
}