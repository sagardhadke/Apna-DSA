import java.util.*;
public class InputBasics {
    public static void main(String[] args) {
        //Input In Java

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        System.out.println(name);
        System.out.println(age);

        //All Inputs 

        System.out.println(sc.next());  // show only first letter like "Sagar Dhadke"  Output => "Sagar"
        System.out.println(sc.nextLine()); // show all String values
        System.out.println(sc.nextInt()); // show all integer values
        System.out.println(sc.nextByte());  // show all byte values
        System.out.println(sc.nextFloat()); // show all float values
        System.out.println(sc.nextDouble()); // show all Double values
        System.out.println(sc.nextBoolean()); // show all Boolean 
        System.out.println(sc.nextShort()); // show all Short
        System.out.println(sc.nextLong()); // show all Long

    }
}
