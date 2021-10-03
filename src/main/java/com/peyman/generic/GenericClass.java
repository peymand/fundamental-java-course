package com.peyman.generic;

import com.peyman.inheritance.Animal;
import com.peyman.inheritance.Domestic;

import java.awt.event.ActionListener;

public class GenericClass {


    //<> Type Definition Section
    public static <T extends Animal & Domestic , E extends Number> T print(T[] arr, T t, E e){

        for (T element : arr) {
            System.out.println(element.toString());
        }

        return arr[0];
    }

    public static <T extends Comparable<? extends T>> T max(T t1, T t2, T t3){
        T max = t1;
        if(t2.compareTo(max) > 0){
            max = t2;
        }
        if(t3.compareTo(max)>0)
            max = t3;
        return max;
    }

    //comparable & comparator
    //Arrays
    //wildcard in generic




}
