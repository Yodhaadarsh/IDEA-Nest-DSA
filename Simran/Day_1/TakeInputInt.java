import java.util.*;

public class TakeInputInt {
    public static void main(String[] args) {
        // Creating a Scanner object linked to standard input stream
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter the limit number (n): ");
        // Taking integer input from the user
        int n = scn.nextInt(); 
        
        // Loop execution scales dynamically based on user input
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
        
        scn.close();
    }
}