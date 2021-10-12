package com.peyman.multithreading;

/**
 * Created by Peyman on 12/16/2017.
 */
public class CircularBuffer implements Buffer {

    private final int[] buffer = {-1,-1,-1};
    private int occupiedCells = 0;
    private int writeIndex = 0;
    private int readIndex = 0;



    @Override
    public synchronized void blockingPut(int value) throws InterruptedException {
        while (occupiedCells==buffer.length){
            System.out.println("Buffer is Full and Producer has to wait. %n");
            wait();
        }
        buffer[writeIndex] = value;
        writeIndex = (writeIndex+1) %buffer.length;
        ++occupiedCells;
        displayState("Producer writes " + value);
        notifyAll();
    }

    @Override
    public synchronized int blockingGet() throws InterruptedException {
        while (occupiedCells==0){
            System.out.println("Buffer is Empty and consumer has to wait. %n");
            wait();
        }
        int value = buffer[readIndex];
        readIndex = (readIndex+ 1) %buffer.length;
        --occupiedCells;
        displayState("Consumer reads " + value);
        notifyAll();
        return value;
    }

    private synchronized void displayState(String operation) {
        System.out.printf("(%s%s%d)%n%s",operation,
                "  (buffer cells occupied: ",occupiedCells,"buffer cells:   ");
        for (int i : buffer) {
            System.out.printf(" %2d  ",i);
        }
        System.out.printf("%n               ");
        for (int i = 0; i <buffer.length ; i++) {
            System.out.print("---- ");
        }
        System.out.printf("%n               ");
        for (int i = 0; i < buffer.length; i++) {
            if(i==writeIndex && i==readIndex)
                System.out.print(" WR  ");
            else if(i==writeIndex)
                System.out.print(" W   ");
            else if(i==readIndex)
                System.out.print(" R   ");
            else
                System.out.print("     ");
        }
    }
}
