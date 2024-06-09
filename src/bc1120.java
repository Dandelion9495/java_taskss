import java.util.Scanner;

public class bc1120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int D = scanner.nextInt();
            String N = scanner.next();
            if (D == 0 && N.equals("0")) {
                break;
            }
            char faultyDigit = Character.forDigit(D, 10);
            StringBuilder result = new StringBuilder();
            for (char ch : N.toCharArray()) {
                if (ch != faultyDigit) {
                    result.append(ch);
                }
            }
            String finalResult = result.toString().replaceFirst("^0+(?!$)", "");
            System.out.println(finalResult.isEmpty() ? "0" : finalResult);
        }
        scanner.close();
    }
}