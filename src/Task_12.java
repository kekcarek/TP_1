import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input A");
        int a = in.nextInt();
        System.out.println("Input B");
        int b = in.nextInt();
        int c = 0;
        while (a > b){
            System.out.println("A must be < B");
            System.out.println("Input A");
            a = in.nextInt();
            System.out.println("Input B");
            b = in.nextInt();
        }
        for (int x = b - 1; x > a; x--){
            System.out.println(x);
            c++;
        }
        System.out.println("Amount of numbers" + c);
    }
}
