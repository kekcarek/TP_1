import java.util.Scanner;

public class Task_18 {
    private static long GCD(long a, long b) {
        while (b > 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static long LCM(long a, long b) {
        return a * (b / GCD(a, b));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input amount of numbers");
        int n = in.nextInt();
        Integer[] num = new Integer[n];
        System.out.println("Input numbers");
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }
        long resultfcd = num[0];
        long resultlcm = num[0];
        for (int i = 1; i < num.length; i++) {
            resultfcd = GCD(resultfcd, num[i]);
        }
        for (int i = 1; i < num.length; i++) {
            if ((num[i] == 0 || num[0] == 0)
                    || (num[i] < 0 || num[0] < 0)) {
                break;
            }
            resultlcm = LCM(resultlcm, num[i]);
        }
        System.out.println("Greatest common divisor: " + resultfcd);
        System.out.println("Least Common Multiple: " + resultlcm);
    }
}
