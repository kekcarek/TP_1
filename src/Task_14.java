import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input double A");
        double a = in.nextDouble();
        System.out.println("Input integer N");
        int n = in.nextInt();
        double rez = 1;
        boolean fn = false;
        while (n < 0){
            System.out.println("N must be > 0");
            System.out.println("Input N");
            n = in.nextInt();
        }
        for (int x = 0; x < n; x++){
            rez *= a;
            if (rez % 2 != 1 && rez % 2 != 0){//Проверка от обратного, если истина, то число не целое
                fn = true;
            }
            if (fn == false){
                System.out.println("Rezult = " + rez);
                fn = false;
            }
        }
    }
}
