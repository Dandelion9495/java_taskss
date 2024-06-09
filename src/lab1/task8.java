package lab1;
import java.util.List;

public class task8 {
    public static void main(String[] args) {
        List<String> correctAnswers = List.of("A", "C", "B", "D", "A", "B", "C", "D", "A", "C", "B", "D", "A", "B", "C", "D", "A", "C", "B", "D");
        List<String> studentAnswers = List.of("A", "D", "B", "C", "A", "B", "D", "C", "A", "C", "B", "D", "A", "B", "C", "D", "A", "B", "C", "D");
        long correctCount = 0;
        long incorrectCount = 0;
        for (int i = 0; i < correctAnswers.size(); i++) {
            if (correctAnswers.get(i).equals(studentAnswers.get(i))) {
                correctCount++;
            } else {
                incorrectCount++;
            }
        }
        System.out.println("правильные ответы: " + correctCount);
        System.out.println("неправильные ответы: " + incorrectCount);
    }
}