import java.util.Scanner;

public class bc1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startTime = scanner.nextInt();
        int endTime = scanner.nextInt();
        int duration;
        if (endTime > startTime) {
            duration = endTime - startTime;
        } else {
            duration = 24 - startTime + endTime;
        }
        System.out.println("O JOGO DUROU " + duration + " HORA(S)");
        scanner.close();
    }
}