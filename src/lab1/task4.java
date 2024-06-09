package lab1;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество минут: ");
        int minutes = scanner.nextInt();
        System.out.print("Количество сообщений: ");
        int messages = scanner.nextInt();
        double baseCost = 15.00;
        int minuteLimit = 50;
        int messageLimit = 50;
        double extraMinuteCost = 0.25;
        double extraMessageCost = 0.15;
        double supportFee = 0.44;
        double extraMinuteCharge = 0.0;
        double extraMessageCharge = 0.0;

        if (minutes > minuteLimit) {
            int extraMinutes = minutes - minuteLimit;
            extraMinuteCharge = extraMinutes * extraMinuteCost;
        }

        if (messages > messageLimit) {
            int extraMessages = messages - messageLimit;
            extraMessageCharge = extraMessages * extraMessageCost;
        }

        double totalCost = baseCost + extraMinuteCharge + extraMessageCharge + supportFee;
        double tax = totalCost * 0.05;
        double finalAmount = totalCost + tax;

        System.out.printf("Базовая стоимость: $%.2f\n", baseCost);
        if (extraMinuteCharge > 0) {
            System.out.printf("Дополнительные минуты: $%.2f (%d минут)\n", extraMinuteCharge, minutes - minuteLimit);
        }
        if (extraMessageCharge > 0) {
            System.out.printf("Дополнительные сообщения: $%.2f (%d сообщений)\n", extraMessageCharge, messages - messageLimit);
        }
        System.out.printf("Сбор за 911: $%.2f\n", supportFee);
        System.out.printf("Налог: $%.2f (5%% от общей суммы $%.2f)\n", tax, totalCost);
        System.out.printf("Итоговая сумма: $%.2f\n", finalAmount);
    }
}
