package com.peyman;

import com.peyman.inheritance.Person;
import com.peyman.inheritance.Teacher;

import java.math.BigInteger;

public class App2 {
    public static void main(String[] args) {

       Person p = new Teacher();
        Teacher t = (Teacher) p; // downcasting
        Teacher t1 = new Teacher();
        t1.setAge(30);
        t1.setName("ali");

        Teacher t2 = new Teacher();
        t2.setAge(30);
        t2.setName("ali");
        System.out.println(t1.toString());
        Object x = t1;
        System.out.println(x.toString());

        if (t1.equals(t2)) {
            System.out.println(true);
        }



        String s = new String("ali");
        String s2 = new String("ali");

        boolean f = s.equals(s2);

//        if (t.equals(t2)) {
//
//        }
//
//        System.out.println(t);
//
//        Teacher t3;//= ---> from console
//        Teacher x; //--> from DB
//
//

        Integer integer =3;
        Integer in =3;


//        System.out.println(t.getAge());
//
//
//
//        System.out.println(t);


        int age = 23;
        float salary = 12.56232323f;

        String name = "ali";


        System.out.println(name + "'s age is " + age + " and the salary is " + salary);
        System.out.printf("%s's age is %04d and the salary is %.2f%n", name, age, salary);

        BigInteger bigInteger = new BigInteger("12121212");
        BigInteger bigInteger2 = new BigInteger("12121212");
        bigInteger.equals(bigInteger);
        t1.equals(t1);
    }

    public static void f(Person p){

    }
}
