import java.util.Scanner;

public class Task_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number > 0 and < 9");
        int n = in.nextInt();
        while (n < 0 || n > 9){
                System.out.println("Input number >0 and <9");
                n = in.nextInt();
        }
        String[] numbers = new String[] {"Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь", "Девять"};
        System.out.println(numbers[n-1]);
    }
}

