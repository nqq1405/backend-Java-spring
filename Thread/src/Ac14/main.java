package Ac14;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        shareddata s = new shareddata();
        Thread1 t1 = new Thread1(s);
        Thread2 t2 = new Thread2(s);
        t1.setName("T1 random");
        t2.setName("T2 ktra");
        t1.start();
        t2.start();
    }
}
