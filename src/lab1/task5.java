package lab1;

public class task5 {
    public static void main(String[] args) {
        String[] transactions = {
                "пополнение через банкомат ~ +1000",
                "оплата интернета ~ -500",
                "кафе ~ -300",
                "зарплата ~ +15000",
                "штраф за парковку ~ -2500",
                "подарок ~ +2000"
        };
        int balance = 0;
        for (String transaction : transactions) {
            String[] parts = transaction.split("~");
            balance += Integer.parseInt(parts[1].trim());
        }
        System.out.println("итоговая сумма на счету составляет " + balance);
    }
}