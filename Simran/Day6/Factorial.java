import java.util.*;

public class Factorial {
    // Function calls itself n times -> O(n) Time
    public static int calculate(int n) {
        if (n <= 1) {
            return 1; // Base case
        }
        // Each call stays in memory until result is back -> O(n) Space
        return n * calculate(n - 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("Factorial is: " + calculate(n));
    }
}