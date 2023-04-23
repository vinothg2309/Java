package com.test.threadcreation;

public class UsingRunnableInterface implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(100);
            System.out.println("Created thread using Runnable interface");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
