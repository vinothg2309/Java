package com.test.threadcreation;

public class ThreadJoinTest {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> System.out.println("Thread 1 executing"), "Thread 1");
        Thread thread2 = new Thread(() -> System.out.println("Thread 2 executing"),"Thread 2");
        Thread thread3 = new Thread(() -> System.out.println("Thread 3 executing"),"Thread 3");


        thread3.start();
        thread2.start();
        thread2.join();
        thread1.start();
        thread2.join(1000);

    }
}
