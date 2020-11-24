package Ac12;

public class main {
    public static void main(String[] args) {
        Thread t1 = new MyThread("ABC", 3500);
        t1.setName("ABC");
        Thread t2 = new MyThread("DEF",2500);
        t2.setName("DEF");

        t1.start();
        t2.start();
    }
}
