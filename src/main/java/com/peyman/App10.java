package com.peyman;

import com.peyman.model.Person;

public class App10 {

    public static void main(String[] args) {
        Person p  = new Person("","");
        Person p2  = new Person("","");
        p2.setName("");
       new Thread(()-> {p.getName();}).start();
       new Thread(()-> {p.getName();}).start();
       new Thread(()-> {p2.getName();}).start();




    }
}
