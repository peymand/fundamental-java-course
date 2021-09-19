package com.peyman.inheritance;

public class Person{
    private int age;
    private String name;

    public Person() {
    }


    protected void talk(){
        System.out.println("As a Person I am talking!!!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
