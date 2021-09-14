package com.peyman;

import com.peyman.model.Person;

public class App3 {


    public static void main(String[] args) {
        int[] arr = new int[4];
        String[] arr2 = new String[3];

        Person[] people = new Person[4];
        people[0] = new Person("ali","javadi");
        for (int i = 0; i < people.length ; i++) {
            System.out.println(people[i].getName());
        }
    }
}
