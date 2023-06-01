package mythread;

import dto.Person;

public class Main {

    public static void main(String[] args) {

//        MyRunnable myRunnable1 = new MyRunnable(4);
//        MyRunnable myRunnable2 = new MyRunnable(6);
//        MyRunnable myRunnable3 = new MyRunnable(8);
//
//        Thread thread1 = new Thread(myRunnable1);
//        Thread thread2 = new Thread(myRunnable2);
//        Thread thread3 = new Thread(myRunnable3);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();

//        MyThread myThread1 = new MyThread(1000, 1);
//        MyThread myThread2 = new MyThread(2000, 2);
//        myThread1.start();
//        myThread2.start();

//        for (int i = 1; i <= 5; i++) {
//            Horse horse = new Horse(i);
//            Thread thread = new Thread(horse);
//            thread.start();
//        }

        Person person = new Person();
        for (int i = 0; i < 5; i++) {
            MyThread myThread = new MyThread(1000, i, person);
            myThread.start();
        }
    }
}
