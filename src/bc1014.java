import java.io.IOException;
import java.util.Scanner;

public class bc1014{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        float y = input.nextFloat();
        float total = x / y;
        System.out.printf("%.3f km/l\n", total);
    }
}