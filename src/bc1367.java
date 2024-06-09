import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bc1367 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break;
            Map<Character, Integer> solveTimeMap = new HashMap<>();
            Map<Character, Integer> incorrectAttemptsMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                char problemId = scanner.next().charAt(0);
                int time = scanner.nextInt();
                String judgement = scanner.next();

                if (judgement.equals("correct")) {
                    if (!solveTimeMap.containsKey(problemId)) {
                        solveTimeMap.put(problemId, time);
                    }
                } else if (judgement.equals("incorrect")) {
                    incorrectAttemptsMap.put(problemId, incorrectAttemptsMap.getOrDefault(problemId, 0) + 1);
                }
            }
            int totalSolved = 0;
            int totalTime = 0;
            for (Map.Entry<Character, Integer> entry : solveTimeMap.entrySet()) {
                char problemId = entry.getKey();
                int solveTime = entry.getValue();
                int incorrectAttempts = incorrectAttemptsMap.getOrDefault(problemId, 0);
                totalSolved++;
                totalTime += solveTime + 20 * incorrectAttempts;
            }
            System.out.println(totalSolved + " " + totalTime);
        }
        scanner.close();
    }
}