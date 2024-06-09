package lab1;
import java.util.List;

public class task9 {
    public static void main(String[] args) {
        List<Integer> workHours = List.of(8, 8, 8, 0, 8, 8, 8, 8, 0, 0, 8, 8, 8, 8, 8, 0, 8, 8, 8, 0);
        int[] weeklyHours = new int[4];
        int totalDaysWorked = 0;
        int totalHoursWorked = 0;
        for (int i = 0; i < workHours.size(); i++) {
            int week = i / 5;
            weeklyHours[week] += workHours.get(i);
            if (workHours.get(i) > 0) {
                totalDaysWorked++;
                totalHoursWorked += workHours.get(i);
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("неделя " + (i + 1) + ": " + weeklyHours[i]);
        }
        double averageHours = (double) totalHoursWorked / totalDaysWorked;
        System.out.printf("среднее количество часов в день: %.2f%n", averageHours);
    }
}