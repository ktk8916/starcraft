package mythread;

import java.time.LocalDateTime;

public class MyRunnable implements Runnable {

    private int param;

    public MyRunnable(int param) {
        this.param = param;
    }

    @Override
    public void run() {
            try {
                Thread.sleep(param * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(LocalDateTime.now());
            System.out.println(param + " 스레드 일어남");
        
    }
}
