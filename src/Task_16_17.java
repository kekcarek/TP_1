import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_16_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input amount of numbers");
        int n = in.nextInt();
        int[] num = new int[n];
        System.out.println("Input numbers");
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }
        List<Integer> x3 = new ArrayList<>();
        List<Integer> x5 = new ArrayList<>();
        List<Integer> x9 = new ArrayList<>();
        List<Integer> x10 = new ArrayList<>();
        for (Integer number : num) {
            if (number % 3 == 0) {
                x3.add(number);
            }
            if (number % 5 == 0) {
                x5.add(number);
            }
            if (number % 9 == 0) {
                x9.add(number);
            }
            if (number % 10 == 0) {
                x10.add(number);
            }
        }
        System.out.println("Numbers divided by 3: " + x3);
        System.out.println("Numbers divided by 5: " + x5);
        System.out.println("Numbers divided by 9: " + x9);
        System.out.println("Numbers divided by 10: " + x10);
    }
}

