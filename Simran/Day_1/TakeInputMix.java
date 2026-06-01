import java.util.*;

public class TakeInputMix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter your roll number: ");
        /* Using nextLine() to read input, then parsing it to an integer 
           to avoid skipping the next input prompt.
        */
        int rollNo = Integer.parseInt(scn.nextLine()); 
        
        System.out.print("Enter your full name: ");
        // Safely reading the complete string line input
        String name = scn.nextLine(); 
        
        // Printing the combination layout
        System.out.println("Dear " + name + ", your Roll Number is: " + rollNo);
        
        scn.close();
    }
}