package Ac13;

import java.util.Random;

public class main {
    static Integer a = null;
    public static void main(String[] args) {
        shareDt shareDt = new shareDt();
        Random rd = new Random();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int j = 0; j<10 ; j++){
                    /*synchronized (shareDt){
                    }*/
                    a = rd.nextInt(1020) + 1000;
                    System.out.println("Thread 1 random năm (1000-2020): " + a);
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int j = 0; j<10 ; j++){
                    /*synchronized (shareDt){
                    }*/
                    if(a % 4 == 0){
                        System.out.println("Thread 2 ktra " +a + " Là năm nhuận");
                    }else System.out.println("Thread 2 ktra " +a + " năm không nhuận");
                    try {
                        Thread.sleep(2200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                a = null;
            }
        };
        t1.start();
        t2.start();
    }

}
