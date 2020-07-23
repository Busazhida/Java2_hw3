package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);

        while (true) {
            try {
                System.out.println("На вашем балансе-"+ "" + bankAccount.getAmount());
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                System.out.println(bankAccount.amount - bankAccount.amount);
                break;
            }
        }

    }
}
