import java.util.Scanner;

public class Average {

    public static int averageNum(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = averageNum(a, b, c);
        System.out.println("Average = " + result);
    }
}
