package com.test.executor;

import com.test.task.Task1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Task1());
        executorService.execute(new Thread(() -> {
            System.out.println("\nTask2 started :");
            for (int i = 50; i < 100; i++) {
                System.out.print(i+" ");
            }
            System.out.println("\nTask2 Ended");
        }));

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("\nTask3 Ended");
            }
        });

        executorService.execute(() -> System.out.println("\nTask4 Ended"));

        Executors.newFixedThreadPool(10);
        Executors.newScheduledThreadPool(10);

        Future future = executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("\nTask3 Ended");
            }
        });

        if(future.isDone()){
            System.out.println("Task completed successfully!!");
        }

        executorService.shutdown();
    }
}