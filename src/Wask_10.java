import java.util.Scanner;

public class Wask_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input N to search all Fibanachi numbers");
        int n = in.nextInt();
        int x1 = 1;
        int x2 = 1;
        int x3;
        System.out.println("n0=0" + "\n" + "n1=" + x1 + "\n" + "n2=" + x2);
        for (int x = 3; x <= n; x++){
            x3 = x1 + x2;
            x1 = x2;
            x2 = x3;
            System.out.println("n" + x + "=" + x3);
        }
    }
}
