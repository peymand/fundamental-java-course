package com.peyman.innerclass;

import java.security.PublicKey;

//outer class
public class Student {

    private String name;

    public static void f2(){

    }

    //nested class or innerclass --recommended to be private
    public class StudentCard{

        private String serial;

        public void f(){
            System.out.println(this.serial);
            System.out.println(Student.this.name);
        }


    }

    //static nested class or static inner class -- recommended to be public
    public static class Info{
        public void f(){

        }
    }


    public void enterUniversity(){
        StudentCard stc = new StudentCard();
        Info info = new Info();
        class Dummy{

        }
        Dummy dummy = new Dummy();
    }

}
