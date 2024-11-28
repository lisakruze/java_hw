package org.example.hw2;

//deposit(double amount): пополнение счета.
//withdraw(double amount): снятие денег с проверкой на достаточность средств.
//getBalance(): возвращает текущий баланс.
public class BankAccount {
    private Integer accountNumber;
    private Double balance;

    BankAccount(Integer accountNumber, Double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Balance must be positive");
        } else {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    public void withdraw(Double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance = balance - amount;
            } else {
                System.out.println("Current balance < withdraw amount");
            }
        } else {
            System.out.println("Withdraw amount must be > 0 ");
        }
    }
}
