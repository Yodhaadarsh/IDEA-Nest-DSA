import java.util.*;

public class BenjaminBulbs {
    public static void main(String[] args) {
        // Initialize scanner to take the number of bulbs
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Loop prints the perfect squares up to n
        // Loop runs in O(sqrt(n)) time efficiency
        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i); // Printing the bulb number that stays ON
        }

        scn.close();
    }
}