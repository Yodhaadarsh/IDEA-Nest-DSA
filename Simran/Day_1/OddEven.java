public class OddEven {
    public static void main(String[] args) {
        // Variable banaya aur value di 11
        int x = 11; 

        // Agar x ko 2 se divide karne par remainder (v3) 0 aata h
        if (x % 2 == 0) { 
            System.out.println(x + " is even.");
        } 
        // Agar condition false hoti hai, toh automatic else chalega
        else { 
            System.out.println(x + " is odd.");
        }

        // Yeh line hamesha chalegi kyunki yeh if-else ke bahar h
        System.out.println("Hardwork is better than smart work"); 
    }
}