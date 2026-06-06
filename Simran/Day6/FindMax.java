import java.util.*;

public class FindMax {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // How many numbers user will enter
        int max = -1; // Starting with a very small number

        // Loop runs n times to compare every input -> O(n)
        for (int i = 1; i <= n; i++) {
            int current = scn.nextInt();
            if (current > max) {
                max = current; // Update max if new number is bigger
            }
        }
        System.out.println("The maximum number is: " + max);
    }
}