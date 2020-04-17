import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input amount of numbers");
        int n = in.nextInt();
        String number;
        int[] num = new int[n];
        System.out.println("Input numbers");
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }
        List<Integer> result = new ArrayList<>();
        for (Integer sourceNumber : num) {
            number = sourceNumber.toString();
            if (number.length() == 4
                    && number.charAt(0) + number.charAt(1) == number.charAt(2)
                    + number.charAt(3)) {
                result.add(sourceNumber);
            }
        }
        System.out.println("Happy numbers: " + result);
    }
}

