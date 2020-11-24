package Ac15;

public class main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        // Người chồng rút 15 triệu
        WithdrawThread husbandThread = new WithdrawThread("Husband", bankAccount, 15000000);
        husbandThread.run();

        // Người vợ rút hết tiền (20 triệu)
        WithdrawThread wifeThread = new WithdrawThread("Wife", bankAccount, 20000000);
        wifeThread.run();
    }
}
