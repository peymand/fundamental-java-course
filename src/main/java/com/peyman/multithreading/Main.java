package com.peyman.multithreading;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) {
        //Thread --> worker --> Task

        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        JButton button = new JButton("1");
        JButton button2 = new JButton("2");
        button.addActionListener((e) -> {
            new Thread(()->{
                for (int i = 0; i < 1000000000; i++){
                    System.out.println("11111111111111111");
                    System.out.println(Thread.currentThread().getName());
                }
            }).start();
        });

        button2.addActionListener((e) -> {
            new Thread(()-> {
                for (int i = 0; i < 1000000000; i++){
                    System.out.println("2222222222222222222222");
                    System.out.println(Thread.currentThread().getName());
                }
            }).start();
        });
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.add(button);
        frame.add(button2);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //// Runnable or callable

        Callable<String> task3 = () -> "ali" ;

        Runnable task1 = () -> {
            for (int i = 0; i < 1000000000; i++)
                System.out.println("11111111111111111");
            System.out.println(Thread.currentThread().getName());

        };

        Runnable task2 = () -> {
            for (int i = 0; i < 1000000000; i++) {
                System.out.println("2222222222222222222222222");
                System.out.println(Thread.currentThread().getName());


            }
        };
        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.setName("T1");
        t2.setName("T2");
        System.out.println(Thread.currentThread().getName());

//        t1.start();
//        t2.start();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> x = executor.submit(() -> {
            System.out.println("Thread created and run by executor service");
            System.out.println(Thread.currentThread().getName());
            return new Integer(12);
        });
        //Async
        


    }
}
