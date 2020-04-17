import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_19 {
    public static boolean PN(int n) {
        boolean prime = true;
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            if (n <= 1)
                return false;
            if (n == 2)
                return true;
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return (n % 2 != 0 && prime && n > 2) || n == 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input amount of numbers");
        int n = in.nextInt();
        boolean prime = true;
        Integer[] num = new Integer[n];
        System.out.println("Input numbers");
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }
        List<Integer> result = new ArrayList<Integer>();
        for (Integer numbers : num) {
            if (PN(numbers)) {
                result.add(numbers);
            }
        }
        System.out.println("Простые числа: " + result);
    }
}
