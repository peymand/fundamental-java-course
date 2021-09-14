package com.peyman;

import com.peyman.model.Person;
import com.peyman.util.algorithm.CalcData;

import java.io.PrintWriter;
import java.lang.Integer;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        //TODO: check later

//        String str = "hi this is dummy55 and 1st thing is last thing5";

        //variable
        int data = 3;
        double data2 = 4.5;


        //wrapper types
        //

        String str = new String("ali");
        String str2 = new String("ali");


        int i = 5; //AutoBoxing --> only on wrapper types



        Integer i2 = 5;

        //


        Float data3 = 3.5f;
        i++; //autoboxing

        if(i>10){

        }

        String str3 = str + str2;


        char c = str.charAt(2);



        Scanner scan = new Scanner(System.in);
        int input =  scan.nextInt(); // "\n"
        System.out.println(scan.nextLine());

//        Person p = new Person();
//        p.name = new String("ali");
//        p.age = 12;
//        p.setSportStatus(true);
//        System.out.println(p.sportStatus);



    }
}
