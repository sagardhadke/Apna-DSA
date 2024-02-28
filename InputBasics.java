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

    }
}
