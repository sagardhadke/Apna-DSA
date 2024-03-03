package Project;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        //Project 1 Calculator Pro

        System.out.println("Welcome To Sagar Calculator Pro");
        
        //get input form user
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        System.out.print("Enter First Number: ");

        int second = sc.nextInt();
        System.out.print("Enter Second Number: ");

        String select = sc.nextLine();
        System.out.print("Select Function: ");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        System.out.println("%");

       

    }   
}
