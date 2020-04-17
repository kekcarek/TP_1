import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input float A");
        double a = in.nextDouble();
        System.out.println("Input integer N");
        int n = in.nextInt();
        double rez = 1;
        while (n < 0){
            System.out.println("N must be > 0");
            System.out.println("Input N");
            n = in.nextInt();
        }
        for (int x = 0; x < n; x++){
            rez *= a;
        }
        System.out.println("Rezult = " + rez);
    }
}
