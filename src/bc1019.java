import java.io.IOException;
import java.util.Scanner;

public class bc1019{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int hour = num / 3600;
        int minute = (num % 3600) / 60;
        int second = (num % 3600) % 60;
        System.out.printf("%d:%d:%d\n", hour, minute, second);
    }
}