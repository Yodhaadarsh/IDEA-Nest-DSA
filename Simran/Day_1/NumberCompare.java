public class NumberCompare {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 30;

        // Condition 1: Kya dono barabar h?
        if (n1 == n2) {
            System.out.println(n1 + " is equal to " + n2);
        } 
        // Condition 2: Agar barabar nahi hain, toh kya n1 bada h?
        else if (n1 > n2) {
            System.out.println(n1 + " is greater than " + n2);
        } 
        // Condition 3: Agar upar ki dono baatein galat h, toh automatic yeh chalega
        else {
            System.out.println(n1 + " is smaller than " + n2);
        }
    }
}