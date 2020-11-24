package Ac14;

import java.util.HashMap;
import java.util.Map;

public class Thread2 extends Thread{
    shareddata s;
    Map<String,String> map_en;

    public Thread2(shareddata s) {
        this.s = s;
        map_en = new HashMap<>();
        map_en.put("Monday","Thứ 2");
        map_en.put("Tuseday","Thứ 3");
        map_en.put("Wednesday","Thứ 4");
        map_en.put("Thursday","Thứ 5");
        map_en.put("Friday","Thứ 6");
        map_en.put("Saturday","Thứ 7");
        map_en.put("Sunday","Chủ nhật");
    }

    @Override
    public void run() {
        while (true){
            synchronized (s){
                if (s.getName() != null){
                    System.out.println("Thread 2 vietnamese: " + map_en.get(s.getName()));
                }else System.out.println("khoong tim thay @!@!");
                try {
                    s.notifyAll();
                    s.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                System.out.println("t2 s");
            }
        }
    }
}
