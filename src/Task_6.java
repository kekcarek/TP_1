import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of month");
        int month = in.nextInt();
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Incorrect number of month";
        }
        System.out.println(season);
    }
}
