package com.peyman.inheritance;

public class Teacher extends Person {

    int salary;
    String hobby;

    public Teacher() {
    }

    @Override
    public void talk() {
        super.talk();
        System.out.println("As A Teacher I am Talking");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {

        return String.format("[ %s , %d ]%n",this.getName(), this.getAge());
    }
}
