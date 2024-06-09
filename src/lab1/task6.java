package lab1;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите вес на Земле в кг: ");
        double weightOnEarth = scanner.nextDouble();
        double weightOnMoon = weightOnEarth * 0.165;

        System.out.println("Результаты:");
        for (int year = 1; year <= 15; year++) {
            weightOnEarth *= 1.032;

            weightOnMoon = weightOnEarth * 0.165;

            System.out.printf("%d год: %.3f кг\n", year, weightOnMoon);
        }
    }
}
