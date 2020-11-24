package Ac14;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Thread1 extends Thread{
    shareddata s;
    Map<String,String> map_en;
    Random a;

    public Thread1(shareddata s) {
        this.s = s;
        a = new Random();
        map_en = new HashMap<>();
        map_en.put("2","Monday");
        map_en.put("3","Tuseday");
        map_en.put("4","Wednesday");
        map_en.put("5","Thursday");
        map_en.put("6","Friday");
        map_en.put("7","Saturday");
        map_en.put("8","Sunday");
    }

    @Override
    public void run() {
        while (true){
            synchronized (s){
                int ab = a.nextInt(7)+ 2;
                s.setName( map_en.get(""+ ab));
                System.out.println("\nThread 1 random " +s.getName());
                try {
                    Thread.sleep(3000);
                    s.notifyAll();
                    s.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                System.out.println("t1 s");
            }
        }
    }
}
