import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input experience and pay");
        double exp = in.nextInt();
        double pay = in.nextInt();
        double prem = 0;
        if (exp < 2)
            prem = 0;
        else if (2 <= exp && exp < 5)
            prem = 0.02;
        else if (5 <= exp && exp < 10)
            prem = 0.1;
        System.out.println("Premium = \n" + (pay * prem));
        System.out.println("Salary = \n" + (pay + pay * prem));
    }
}
