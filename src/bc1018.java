import java.util.Scanner;

public class bc1018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};
        System.out.println(N);
        for (int banknote : banknotes) {
            int count = N / banknote;
            N %= banknote;
            System.out.println(count + " nota(s) de R$ " + banknote + ",00");
        }
    }
}