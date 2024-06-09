import java.util.Scanner;

public class bc1017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int km = input.nextInt();
        double dist = km * h;
        double res = dist / 12.0;
        System.out.printf("%.3f%n", res);
    }
}