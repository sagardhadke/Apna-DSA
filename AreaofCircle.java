import java.util.*;

public class AreaofCircle {
    public static void main(String args[]){

        //Area of Circle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        double sum = 3.14*radius*radius;
        System.out.println(sum);

    }
}
