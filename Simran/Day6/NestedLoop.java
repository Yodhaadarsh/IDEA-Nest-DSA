import java.util.*;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // Grid size

        // Outer loop runs n times
        for (int i = 1; i <= n; i++) {
            // Inner loop also runs n times for every outer step -> n * n = O(n^2)
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to next line
        }
    }
}