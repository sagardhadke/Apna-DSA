package Variables_Questions;

import java.util.*;

public class Ques3 {
    public static void main(String[] args) {
    
        /*Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
        an eraser. You have to output the total cost of the items back to the user as their bill.
        (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Pencil Price: ");
        float pencil = sc.nextFloat();

        System.out.print("Enter The Pen Price: ");
        float pen = sc.nextFloat();
        
        System.out.print("Enter The Eraser Price: ");
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
       
        System.out.println("Total Bill is " + total);

        //add 18% GST 
        float gst =  total + (0.18f*total);
        System.out.println("Total Bill With 18% GST " + gst);

    }
}
