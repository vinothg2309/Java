package com.test.callable;

import java.util.concurrent.*;

class CallableTask implements Callable<String>{

    String name;
    public CallableTask(String name){
        this.name = name;
    }
    @Override
    public String call() throws Exception {
        return "Hello from "+ name;
    }
}
public class CallableRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<String> str = executor.submit(new CallableTask("Task 1"));
        System.out.println("str : "+ str.get());

        executor.shutdown();
    }
}
