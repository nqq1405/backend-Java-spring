package Ac15;

public class BankAccount {
    long amount = 20000000;

    public BankAccount() {
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public  void withdraw(String threadName, long withdrawAmount){
        System.out.println(threadName + " need: " + withdrawAmount);
        if (withdrawAmount < amount){
            System.out.println("withdraw succes!!");
            amount -= withdrawAmount;
            System.out.println(threadName +" see balance: "+ amount);
        }else {
            System.out.println(threadName +" see balance: "+ amount);
            System.err.println("withdraw erro!!");
        }
    }

}
