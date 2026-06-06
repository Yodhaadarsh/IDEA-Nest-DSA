import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Taking the input number from the user
        int n = scn.nextInt();
        
        // Initializing a variable to store the count of digits
        int digits = 0;
        
        // Loop runs until the number reduces to 0
        while (n != 0) {
            // Dividing the number by 10 to remove the last digit
            n = n / 10;
            
            // Incrementing the digit counter by 1
            digits++;
        }
        
        // Printing the final total count of digits
        System.out.println(digits);
        
        scn.close();
    }
}