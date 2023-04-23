package com.test.threadcreation;

public class UsingThreadSuperClass extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(100);
            System.out.println("****Executing Thread : "+ getName());
            System.out.println("Inside thread creation by extending Thread class");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
