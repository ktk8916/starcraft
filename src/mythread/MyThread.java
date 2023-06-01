package mythread;

import dto.Person;

public class MyThread extends Thread{
    private int time;
    private int id;
    private Person person;
    public static int count;
    public MyThread(int time, int id, Person person) {
        count++;
        this.time = time;
        this.id = id;
        this.person = person;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            person.setName("name" + id);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace( );
            }
            System.out.println(id);
            System.out.println(person.getName());;
        }
        count--;
        System.out.println("count = " + count);
    }
}
