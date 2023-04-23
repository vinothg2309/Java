package com.test;

class Calculator extends Thread{

    long sum;
    @Override
    public void run() {
        synchronized (this){
            for (int i = 0; i < 10; i++) {
                sum+=i;
            }
            notify();
        }
    }
}
public class WaitNotifyTest {

    public static void main(String[] args) throws InterruptedException {
        Calculator thread = new Calculator();
        thread.start();
        synchronized (thread){
            thread.wait();
        }
        System.out.println("Sum : "+ thread.sum);
    }
}
