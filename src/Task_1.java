import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your numbers \n");
        int x = in.nextInt();
        int y = in.nextInt();
        int c = x * x + y * y;
        int d = (x + y) * (x + y);
        if (c > d)
            System.out.println("squared amount: \n" + c +"\n"  + d);
        else
            System.out.println("sum of square: \n" + d +"\n" + c);
        in.close();
    }
}
