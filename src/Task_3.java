import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input coordinates А(х0,у0) and В(х1,у1) \n");
        double x1 = in.nextInt();
        double x2 = in.nextInt();
        double y1 = in.nextInt();
        double y2 = in.nextInt();
        double AO = sqrt(x1 * x1 + x2 * x2);
        double BO = sqrt(y1 * y1 + y2 * y2);
        if (AO > BO)
            System.out.println("A farthest from the origin");
        else if (AO < BO)
            System.out.println("B farthest from the origin");
        else if (AO == BO)
            System.out.println("A and B equidistant");
    }
}
