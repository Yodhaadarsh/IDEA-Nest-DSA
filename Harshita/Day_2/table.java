package Harshita.Day_2;
import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number whose table you want to print:");
    int n=sc.nextInt();
    int i=1;
    while(i<=10){
        System.out.println(n+"x"+i+"="+i*n);
        i++;

    }
    sc.close();    
    }
    

}
