package com.test.callable;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<CallableTask> tasks = List.of(
                new CallableTask("Task 1"),
                new CallableTask("Task 2"),
                new CallableTask("Task 3"));
        String invokeAny = executorService.invokeAny(tasks);
        System.out.println("invokeAny : "+ invokeAny);
        executorService.shutdown();
    }
}
