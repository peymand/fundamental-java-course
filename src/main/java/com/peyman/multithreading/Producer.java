package com.peyman.multithreading;

import java.security.SecureRandom;

/**
 * Created by Peyman on 12/16/2017.
 */
public class Producer implements Runnable {
    private static final SecureRandom generator = new SecureRandom();
    private final Buffer sharedLocation;
    public Producer(Buffer buffer) {
        this.sharedLocation = buffer;
    }
    @Override
    public void run() {

        int sum=0;
        for (int i = 1; i <=10 ; i++) {
            try {
                Thread.sleep(generator.nextInt(3000));
                sharedLocation.blockingPut(i);
                sum+=i;
                System.out.printf("\t%2d%n",sum);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.printf("Producer done producing%nTerminating Producer%n");
    }
}
