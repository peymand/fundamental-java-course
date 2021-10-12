package com.peyman.multithreading;

/**
 * Created by Peyman on 12/16/2017.
 */
public interface Buffer {

    void blockingPut(int value) throws InterruptedException;
    int blockingGet() throws InterruptedException;

}
