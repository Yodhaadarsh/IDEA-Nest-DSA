import java.util.*;

public class Pattern2 {
    public static void main(String[] args) {
        // Initialize scanner to accept the size constraint from the user
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Outer loop manages the rows but runs in REVERSE order (from n down to 1)
        // This dynamically controls the declining count of stars per line
        for (int i = n; i >= 1; i--) {
            
            // Inner loop acts as the worker, printing stars up to the current value of i
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t"); // Prints star accompanied by a tab space
            }
            
            // Forces a line break to push the cursor to the next line
            System.out.println();
        }

        scn.close();
    }
}