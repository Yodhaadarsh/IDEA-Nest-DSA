import java.util.*;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        // Initialize the standard input scanner stream
        Scanner scn = new Scanner(System.in);
        
        // Accept the three side lengths of the triangle
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        // Phase 1: Determine the absolute maximum side (Potential Hypotenuse)
        int max = a; // Assume 'a' is the largest initially
        
        if (b >= max) {
            max = b; // Update max if 'b' is greater or equal
        }
        if (c >= max) {
            max = c; // Update max if 'c' is greater or equal
        }

        // Phase 2: Conditional Evaluation based on the identified maximum side
        boolean isTriplet = false; // Flag to store the evaluation status

        if (max == a) {
            // If 'a' is the hypotenuse, verify if b^2 + c^2 equals a^2
            isTriplet = ((b * b + c * c) == (a * a));
        } else if (max == b) {
            // If 'b' is the hypotenuse, verify if a^2 + c^2 equals b^2
            isTriplet = ((a * a + c * c) == (b * b));
        } else {
            // If 'c' is the hypotenuse, verify if a^2 + b^2 equals c^2
            isTriplet = ((a * a + b * b) == (c * c));
        }

        // Phase 3: Display the definitive boolean conclusion
        System.out.println(isTriplet);
        
        // Close the scanner resource to prevent memory leaks
        scn.close();
    }
}