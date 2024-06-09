import java.util.Scanner;

public class bc1257 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            int L = scanner.nextInt();
            scanner.nextLine();
            int hashValue = 0;
            for (int elementIndex = 0; elementIndex < L; elementIndex++) {
                String line = scanner.nextLine();
                for (int positionIndex = 0; positionIndex < line.length(); positionIndex++) {
                    char ch = line.charAt(positionIndex);
                    int alphabetPosition = ch - 'A';  // Calculate the alphabet position
                    int value = alphabetPosition + elementIndex + positionIndex;
                    hashValue += value;
                }
            }
            System.out.println(hashValue);
        }
        scanner.close();
    }
}