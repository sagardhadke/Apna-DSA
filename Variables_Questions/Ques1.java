package Variables_Questions;

import java.util.*;

public class Ques1 {
    public static void main(String args[]){

        /*In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
        (Hint : Average of N numbers is sum of those numbers divided by N) */

        System.out.print("Enter 1 Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.print("Enter 2 Number: ");
        int b = sc.nextInt();

        System.out.print("Enter 3 Number: ");
        int c = sc.nextInt();

        int sum = (a+b+c)/3;
        System.out.println(sum);
    }
}
