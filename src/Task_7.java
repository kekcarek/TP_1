public class Task_7 {
    public static void main(String[] args) {
        int n = 100000;
        int s = 0;
        int z = 0;
        for (int x = 0; x < n; x++){
            if (x % 3 == 0 && x % 5 != 0) {
                z = x;
                while (z != 0){
                    s += z % 10;
                    z /= 10;
                }
                if (s % 3 == 0 && s % 5 != 0) {
                    System.out.println(s);
                }
                s = 0;
                z = 0;
            }
        }

    }
}
