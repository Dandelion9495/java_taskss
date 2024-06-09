import java.util.Scanner;

public class bc1003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double gradeA = input.nextDouble();
        double gradeB = input.nextDouble();

        double weightA = 3.5;
        double weightB = 7.5;

        double average = (gradeA * weightA + gradeB * weightB) / (weightA + weightB);

        System.out.printf("MEDIA = %.5f%n", average);
    }
}