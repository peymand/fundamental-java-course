package com.peyman.model;

//encapsulation

public class Person {


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
        this.age = age;
    }

    public void setSportStatus(boolean status){
        this.sportStatus = status;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }



}
