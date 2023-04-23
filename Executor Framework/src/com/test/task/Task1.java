package com.test.task;

public class Task1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Task1 started :");
        for (int i = 0; i < 50; i++) {
            System.out.print(i+" ");
        }
        System.out.println("\nTask1 Ended");
    }
}
