import java.util.Scanner;

public class Taxk_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        int x = in.nextInt();
        boolean rez = true;
        while (rez && x > 1) {
            if (x % 2 == 1)
                rez = false;
            else
                x /= 2;
        }
        if (rez)
            System.out.println("The number is a power of two");
        else
            System.out.println("The number is not a power of two");
    }
}
