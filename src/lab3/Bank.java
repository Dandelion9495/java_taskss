package lab3;
import lab3.Account;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Добавлен новый счет: " + account.getAccountNumber());
    }

    public void removeAccount(String accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber().equals(accountNumber)) {
                accounts.remove(i);
                System.out.println("Счет " + accountNumber + " удален");
                return;
            }
        }
        System.out.println("Счет " + accountNumber + " не найден");
    }

    public static void main(String[] args) {
        lab3.Bank bank = new lab3.Bank();

        Account account1 = new Account("123456", 1000.0);
        Account account2 = new Account("789012", 2000.0);
        bank.addAccount(account1);
        bank.addAccount(account2);

        account1.deposit(500.0);
        account2.withdraw(1000.0);

        System.out.println("Баланс счета 1: " + account1.getBalance());
        System.out.println("Баланс счета 2: " + account2.getBalance());

        bank.removeAccount("123456");
    }
}
