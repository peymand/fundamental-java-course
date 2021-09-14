package com.peyman;

import com.peyman.model.Person;

import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {
        String str = new String();

        Person p = new Person("ali", "ahmadi"); //instantiation
        p = null;
        //constructor --> initialization
        int i=100;
        while (i>0) {
            System.gc();
            i--;
        }
    }
}
