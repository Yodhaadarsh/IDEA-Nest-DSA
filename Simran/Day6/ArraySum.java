import java.util.*;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // Last number of the range
        int total = 0;

        // Loop visits every number once to add it to total -> O(n)
        for (int i = 1; i <= n; i++) {
            total = total + i; 
        }
        System.out.println("The total sum is: " + total);
    }
}
