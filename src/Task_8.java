import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input N");
        int n = in.nextInt();
        for (int x = 0; x <= n; x++){
            if (x % 5 == 0){
                System.out.println(x);
            }
        }
    }
}
