import java.util.*;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Taking the total number of test cases from user
        int t = scn.nextInt(); 
        
        // Loop to process each test case step-by-step
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt(); 
            
            // Initializing a counter to track divisions
            int count = 0; 
            
            // Optimized loop: running only until the square root of n (div * div <= n)
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++; // Factor found
                    break;   // Optimization: break immediately if a factor is found
                }
            }
            
            // If no factors were found up to square root, it is prime
            if (count == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
        scn.close();
    }
}
