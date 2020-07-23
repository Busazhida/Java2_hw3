package com.company;

public class BankAccount  {
    double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum) {
        amount = amount + sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Недостаточно средств на счете", sum);
        }
        amount = amount - sum;
        System.out.println("Снимаем со счета-" + " " + sum);
    }
}

