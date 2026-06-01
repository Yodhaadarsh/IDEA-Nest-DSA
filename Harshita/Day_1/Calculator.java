package Harshita.Day_1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Harshita's calculator");
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Press 1 for addition\nPress 2 for subtraction\nPress 3 for multiplication\nPress 4 for division");
        int choice=sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);   
                break;
            case 4:
                if(b==0){
                    System.out.println("Division by 0 not possible");
                }
                else{
                    System.out.println(a/b);
                }
                break;        
        
            default:
                System.out.println("Wrong Choice!");
                break;
        }
        sc.close();
}
}