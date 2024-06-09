package lab1;
import java.util.*;

public class task1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 2, 3, 3, 1);
        List<Integer> result = removeOddOccurrences(numbers);
        System.out.println("Вывод: " + result);
    }

    public static List<Integer> removeOddOccurrences(List<Integer> numbers) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : numbers) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int num : countMap.keySet()) {
            if (countMap.get(num) % 2 == 0) {
                int occurrences = countMap.get(num);
                for (int i = 0; i < occurrences; i++) {
                    result.add(num);
                }
            }
        }

        return result;
    }
}
