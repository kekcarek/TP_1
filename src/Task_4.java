import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input values of triangle");
        double a = in.nextInt();
        double b = in.nextInt();
        double c = in.nextInt();
        if (b == sqrt( c * c - a * a))
            System.out.println("right triangle");
        else
            System.out.println("not right triangle");
    }
}
