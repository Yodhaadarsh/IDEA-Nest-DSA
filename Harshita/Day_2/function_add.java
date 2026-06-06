package Harshita.Day_2;

import java.util.*;
public class function_add {
    static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to add:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=add(a,b);
        System.out.println("The sum is: "+result);
        sc.close();

    }
}
