package com.peyman;


import com.peyman.generic.GenericClass;
import com.peyman.generic.PersonComparator;
import com.peyman.generic.Stack;
import com.peyman.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class App7 {


    public static void main(String[] args) {

        Integer[] arr = {new Integer(1),20,13,-4,5}; //Boxing
        String[] arr3 = {"reza", new String("ali")}; //string constant pool
        int[] arr2 = {1,2,3,4,5};

        //new Integer[]{1,2,3,4,5}

        Stack<Integer> x = new Stack<Integer>();
//        x.push(3);
        Stack<String > y = new Stack<String>();
//        y.push("salam");
//        System.out.println(y.pop());


        Person p1 = new Person("aliReza","rezaee");
        p1.setAge(20);
        Person p2 = new Person("reza","JAVADI");
        p2.setAge(30);
        Person p3 = new Person("maryam","rajabi");
        p3.setAge(25);
        if(p1.compareTo(p2) > 0 ){

        }

//        System.out.println(GenericClass.max(1,10,2));
//        System.out.println(GenericClass.max("1","ali","reza"));
//        System.out.println(GenericClass.max(p1,p2,p3));

        Person[] people = {p1,p2,p3};

        Arrays.sort(people ,(a,b) -> a.getName().length() - b.getName().length() );


        ArrayList<String> list = new ArrayList<>();
//        list.







//        Comparator<Integer> Comp = (a,b) ->  b - a ;
//        Arrays.sort(arr, Comp);
        for (Integer integer : arr) {
            System.out.println(integer);
        }
        for (Person element : people) {
            System.out.println(element);
        }

    }
}
