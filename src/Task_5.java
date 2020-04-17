import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input three numbers");
        double a = in.nextInt();
        double b = in.nextInt();
        double c = in.nextInt();
        if (a > 0)
            a = a * a;
        if (b > 0)
            b = b * b;
        if (c > 0)
            c = c * c;
        System.out.println("a=" + a + "; b=" + b + "; c=" + c + ";");
    }
}
