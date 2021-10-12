package com.peyman.multithreading;

public class Dummy {

    public static void main(String[] args) {
        UnsyncronizedBuffer buffer = new UnsyncronizedBuffer();
        Consumer c = new Consumer(buffer);
        Thread t = new Thread(c);
        t.start();
    }
}
