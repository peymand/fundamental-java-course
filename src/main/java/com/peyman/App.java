package com.peyman;

import com.peyman.data.Person;

import java.lang.reflect.Method;

public class App {

    static {
        System.out.println("");
    }

    public static void main(String[] args) {
        System.out.println(Person.MAX_AGE);
        Person.getMaxAge();
        System.out.print("");
        Person p = new Person("","");


        int i = Integer.parseInt("123");

         Character.isDigit('2');


         Class x =  Person.class;  //Reflection


        f("123");
        f(12);

    }


    public static void f(Object s){
        Class c = s.getClass();
        System.out.println(c.getName());
        Method[] methods =  c.getMethods();
        for (Method method:methods) {

        }
    }
}
