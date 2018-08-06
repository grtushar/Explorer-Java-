package com.prime;

/**
 * Created by Golam Rahman Tushar on 1/8/2018.
 */

class ThreadDemo implements Runnable {
    private String name = "notAssigned";

    ThreadDemo(String name) {
        this.name = name;
    }

    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(name + " " + i);
        }
    }
}
public class ThreadPrac {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadDemo("thread1"),"thread1");
        Thread t2 = new Thread(new ThreadDemo("thread2"),"thread2");

        t1.start();
        t2.start();

        t2.setPriority(10);
        t1.setPriority(1);
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
