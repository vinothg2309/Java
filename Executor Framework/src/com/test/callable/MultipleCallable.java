package com.test.callable;

import java.util.List;
import java.util.concurrent.*;

public class MultipleCallable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        List<CallableTask> tasks = List.of(new CallableTask("Task 1"), new CallableTask("Task 2")
                , new CallableTask("Task 3"));
        List<Future<String>> invokeAll = executorService.invokeAll(tasks);
        for (Future<String> future: invokeAll) {
            System.out.println(future.get());
        }

        executorService.shutdown();
    }
}
