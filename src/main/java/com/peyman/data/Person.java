package com.peyman.data;

//encapsulation

public class Person {


    boolean sportStatus;
    private String name;
    private String family;
    private int age;

    public final static int MAX_AGE;
    public static Book book;


    static {

        MAX_AGE = 120;
    }

    {
        this.age = 20;
    }

    public static int getMaxAge(){

        return MAX_AGE;
    }

    public Person() {
    }

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

    String getFamily() {
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
