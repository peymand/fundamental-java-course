package com.peyman.generic;


import com.peyman.model.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().length() - o2.getName().length();
    }
}
