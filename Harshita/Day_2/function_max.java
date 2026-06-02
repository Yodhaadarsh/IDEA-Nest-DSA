package Harshita.Day_2;
import java.util.*;
public class function_max {
    static int max_num(int a,int b){
        return (a>b)?a:b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
       int result=max_num(a,b);
       System.out.println("The maximum number is: "+result);
       sc.close();
    }
    
}
