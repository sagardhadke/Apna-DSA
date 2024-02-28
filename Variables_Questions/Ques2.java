package Variables_Questions;

import java.util.*;

public class Ques2 {
    public static void main(String args[]){

        /*In a program, input the side of a square. You have to output the area of the square.
        (Hint : area of a square is (side x side)) */

        System.out.print("Enter Side: ");
        Scanner sc = new Scanner(System.in);
        int side =  sc.nextInt();
        int sum = side*side;
        System.out.println(sum);

    }
}
