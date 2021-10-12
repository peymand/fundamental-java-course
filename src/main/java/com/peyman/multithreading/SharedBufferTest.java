package com.peyman.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Peyman on 12/16/2017.
 */
public class SharedBufferTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        Buffer sharedLocation = new SyncronizedBuffer();

        System.out.println(
                "Action\t\tValue\tsum of Produces\tSum of Consumed");
        System.out.printf(
                "------\t\t-----\t---------------\t---------------%n%n");
        Producer producer = new Producer(sharedLocation);
        Consumer consumer = new Consumer(sharedLocation);

        executorService.execute(producer);
        executorService.execute(consumer);


        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);


    }
}
