package Ac12;

public class MyThread extends Thread{
    String name;
    int sleep;

    public MyThread(String name, int sleep) {
        this.name = name;
        this.sleep = sleep;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Name: " + name);
            try {
                Thread.sleep(Long.parseLong(String.valueOf(sleep)));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
