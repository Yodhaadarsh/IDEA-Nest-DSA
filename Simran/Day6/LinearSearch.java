import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // Total numbers to check
        int target = 7; // The number we want to find

        // Loop checks every number from 1 to n one by one -> O(n)
        for (int i = 1; i <= n; i++) {
            if (i == target) {
                System.out.println("Target number found!");
                break; // Stop loop once found
            }
        }
    }
}