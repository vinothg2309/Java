package com.test.threadcreation;

public class ThreadTest {

    public static void main(String[] args) {
        Thread thread1 = new UsingThreadSuperClass();
        thread1.start();

        Thread thread2 = new Thread(new UsingRunnableInterface());
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread2.start();


    }
}
