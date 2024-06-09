package lab2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        do {
            try {
                System.out.print("введите целое число: ");
                int number = input.nextInt();
                System.out.println("введенное число: " + number);
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("попробуйте еще раз. (Некорректный ввод: требуется целое число)");
                input.nextLine();
            }
        } while (continueInput);
    }
}