package com.peyman.inheritance;

public class Teacher extends Person {

    int salary;
    String hobby;

    public Teacher() {
    }

    public Teacher(int age,String name, int salary, String hobby){
        super(age,name);
        this.salary = salary;
        this.hobby = hobby;
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

    // t1.equals(t2)


    public boolean equals(Object obj) {
        Teacher caller =  this;
        if(!(obj instanceof Teacher)){
            return false;
        }
        Teacher arg = (Teacher) obj;
        if(caller.getAge() == arg.getAge() && caller.getName().equals(arg.getName())){
            return true;
        }else{
            return false;
        }
    }

}
