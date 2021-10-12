package com.peyman.reflection;

import com.peyman.data.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void f(Object obj){

        Class clazz = obj.getClass();

        System.out.println(clazz.getSimpleName());
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if(method.getName().equals("getAge")){
                try {
                    method.invoke(obj);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    public static void f2(Object o1, Object o2){

    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(30);
        f("p");
    }
}
