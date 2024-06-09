import java.util.HashSet;
import java.util.Scanner;

public class bc1551 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            String sentence = scanner.nextLine();
            HashSet<Character> uniqueLetters = new HashSet<>();
            for (char ch : sentence.toCharArray()) {
                if (Character.isLetter(ch)) {
                    uniqueLetters.add(ch);
                }
            }
            int uniqueCount = uniqueLetters.size();
            if (uniqueCount == 26) {
                System.out.println("frase completa");
            } else if (uniqueCount >= 13) {
                System.out.println("frase quase completa");
            } else {
                System.out.println("frase mal elaborada");
            }
        }
        scanner.close();
    }
}