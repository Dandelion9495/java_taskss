import java.util.Scanner;

public class bc1238 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            String str1 = scanner.next();
            String str2 = scanner.next();
            String combined = combineStrings(str1, str2);
            System.out.println(combined);
        }

        scanner.close();
    }
    private static String combineStrings(String str1, String str2) {
        StringBuilder combined = new StringBuilder();
        int length1 = str1.length();
        int length2 = str2.length();
        int maxLength = Math.max(length1, length2);
        for (int i = 0; i < maxLength; i++) {
            if (i < length1) {
                combined.append(str1.charAt(i));
            }
            if (i < length2) {
                combined.append(str2.charAt(i));
            }
        }
        return combined.toString();
    }
}