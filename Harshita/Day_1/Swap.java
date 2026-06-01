package Harshita.Day_1;
import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        //swapping using third variable
        int c=b;
        b=a;
        a=c;
        System.out.println("After swapping:");
        System.out.println("First number:"+a);
        System.out.println("Second number:"+b);

        sc.close();


    }
    
}
