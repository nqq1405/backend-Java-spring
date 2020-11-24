package Ac11;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Thread> threadList = new ArrayList<>();
         for (int i=0; i<50; i++){
             int finalI = i;
             Thread t = new Thread(){
                @Override
                public void run() {
                    System.out.println("Thread: " + finalI);
                }
            };
             threadList.add(t);
         }
        for (Thread a1: threadList) {
            a1.start();
        }
    }
}
