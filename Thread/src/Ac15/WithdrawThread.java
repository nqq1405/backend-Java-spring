package Ac15;

import java.util.Scanner;

public class WithdrawThread implements Runnable{
    String name;
    BankAccount b;
    long withdrawAmount;

    public WithdrawThread(String name, BankAccount b, long withdrawAmount) {
        this.name = name;
        this.b = b;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        b.withdraw(name,withdrawAmount);
//        try {
//            b.wait();
//            b.notifyAll();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
