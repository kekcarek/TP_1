import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input amount of numbers");
        int n = in.nextInt();
        int[] num = new int[n];
        System.out.println("Input numbers");
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }
        List<Integer> evens = new ArrayList<Integer>();
        List<Integer> odds = new ArrayList<Integer>();
        for (Integer number : num) {
            if (number % 2 == 0) {
                evens.add(number);
            } else {
                odds.add(number);
            }
        }
        System.out.println("Evens numbers: " + evens);
        System.out.println("Odds numbers: " + odds);
    }
}
