package com.test.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(() -> System.out.println("Task 1 started"));
        executorService.execute(() -> System.out.println("Task 2 started"));
        executorService.execute(() -> System.out.println("Task 3 started"));
        executorService.execute(() -> System.out.println("Task 4 started"));
        executorService.execute(() -> System.out.println("Task 5 started"));

       /*  System.out.println("Task 6 started");

       // Task 3
        for (int i = 0; i < 200; i++) {
            System.out.print(i+" ");
        }

        System.out.println("\nTask 3 Done");*/
        System.out.println("Main Done");

        executorService.shutdown();
    }
}
