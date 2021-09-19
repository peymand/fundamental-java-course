package com.peyman;

import com.peyman.inheritance.Person;
import com.peyman.inheritance.Teacher;

public class App2 {
    public static void main(String[] args) {

        Teacher t = new Teacher();
        t.setAge(30);
        t.setName("ali");
        Teacher t2 = new Teacher();
        t2.setAge(30);
        t2.setName("ali");

        String s = new String("ali");
        String s2 = new String("ali");

        boolean f = s.equals(s2);

        if (t.equals(t2)) {

        }

        System.out.println(t);

        Teacher t3;//= ---> from console
        Teacher x; //--> from DB



        Integer integer =3;
        Integer in =3;


        System.out.println(t.getAge());



        System.out.println(t);


        int age = 23;
        float salary = 12.56232323f;

        String name = "ali";


        System.out.println(name + "'s age is " + age + " and the salary is " + salary);
        System.out.printf("%s's age is %04d and the salary is %.2f%n", name, age, salary);
    }
}
