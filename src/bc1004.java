import java.io.IOException;
import java.util.Scanner;

public class bc1004{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("PROD = "+ a*b);
    }
}