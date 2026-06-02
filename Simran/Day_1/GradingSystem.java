import java.util.*;

public class GradingSystem {
    public static void main(String[] args) {
        // Input lene ke liye Scanner ka setup
        Scanner scn = new Scanner(System.in);
        System.out.print("Student ke marks enter karo: ");
        int marks = scn.nextInt();

        // 1. Pehli Condition: 90 se bada
        if (marks > 90) {
            System.out.println("excellent");
        } 
        // 2. Doosri Condition: Agar 90 se kam h par 80 se bada h
        else if (marks > 80) {
            System.out.println("good");
        } 
        // 3. Teesri Condition: 70 se bada
        else if (marks > 70) {
            System.out.println("fair");
        } 
        // 4. Fourth Condition: 60 se bada
        else if (marks > 60) {
            System.out.println("meets expectations");
        } 
        // 5. Default Case: Agar marks 60 ya usse kam h
        else {
            System.out.println("below par");
        }
        
        scn.close(); // Scanner close karna 
    }
}