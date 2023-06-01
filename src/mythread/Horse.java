package mythread;

public class Horse implements Runnable{
    
    private int id;

    public Horse(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long) (Math.random() * 5 * 1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(id + "번 말 도착");
    }
}
