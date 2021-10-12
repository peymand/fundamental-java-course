package com.peyman.multithreading;

import java.security.SecureRandom;

/**
 * Created by Peyman on 12/16/2017.
 */
public class Consumer implements Runnable {
    private static final SecureRandom generator = new SecureRandom();
    private final Buffer sharedLocation;
    public Consumer(Buffer buffer) {
        this.sharedLocation = buffer;
    }
    @Override
    public void run() {
        int sum=0;
        for (int i = 1; i <=10 ; i++) {
            try {
                Thread.sleep(generator.nextInt(3000));
                sum+= this.sharedLocation.blockingGet();
                System.out.printf("\t\t\t%2d%n",sum);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.printf("%n%s %d%n%s%n","Consumer read value totaling",sum,"Terminating consumption");
    }
}
