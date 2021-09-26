package com.peyman.innerclass;

import com.peyman.model.Person;

import java.util.Date;

public class StaticInnerClassPerson {

    int id;

    public static class info{
        int age;
        String name;
    }

    public static class Create{
        int age;
        String name;
        Date dob;
    }

    public static class Delete{


    }

    public boolean deletePerson(StaticInnerClassPerson.Delete p){
        //code to delete p
        return true;
    }


}
