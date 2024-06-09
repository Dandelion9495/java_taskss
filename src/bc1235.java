import java.util.Scanner;

public class bc1235 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            int length = line.length();
            int mid = length / 2;
            String left = new StringBuilder(line.substring(0, mid)).reverse().toString();
            String right = new StringBuilder(line.substring(mid)).reverse().toString();
            String original = left + right;
            System.out.println(original);
        }
        scanner.close();
    }
}