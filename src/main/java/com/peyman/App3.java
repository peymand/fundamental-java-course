package com.peyman;

import com.peyman.inheritance.*;

import javax.swing.*;
import java.awt.*;

public class App3 {


    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.voice();
//        Animal cat = new Cat();
//        cat.voice();
//
//        Animal[] animals = new Animal[2];
//        animals[0] = dog;
//        animals[1] = cat;
//
//        for (Animal animal : animals) {
//            animal.voice();
//        }


        Cat cat = new Cat();
        IAnimal animal = cat;
        Domestic domestic = cat;
        Object o = cat;


        //f(dog);

        JFrame frame = new JFrame("My Form");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JButton btn = new JButton("OK");
        btn.addActionListener(new MyActionListener());
        frame.ad;






    }

    public static void f(Domestic domestic){
        domestic.getPrize();
    }
}
