package com.peyman.model;

//encapsulation

import com.peyman.inheritance.Domestic;
import com.peyman.innerclass.Student;

public class Person implements Comparable<Person>  {


    private boolean sportStatus;
    private String name;
    private String family;
    private int age;



    public Person(String name, String family){
        this.name = name;
        this.family = family;
    }

    public Person(boolean sportStatus, String name, String family, int age) {
        this(name,family);
        this.sportStatus = sportStatus;
        this.age = age;
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name);
    }

    public boolean isSportStatus() {
        return sportStatus;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        int age = 10;
        age++;

        family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        notify();
        this.age = age;
    }

    public void setSportStatus(boolean status){
        this.sportStatus = status;
    }


    public void setName(String name){
        this.notifyAll();
        this.name = name;
    }
    public synchronized String getName() throws InterruptedException {
        this.wait();
        return this.name;
    }


    @Override
    public int compareTo(Person o) {
//        if(this.age > o.age) return 10;
//        else if(this.age < o.age) return  -15;
//        else return 0;
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return String.format("[ %s %s]", name, family);
    }
}
