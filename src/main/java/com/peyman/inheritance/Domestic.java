package com.peyman.inheritance;

public interface Domestic {

    public abstract int getPrize();
    String tellYourName();

    default void dummy(){
        System.out.println();
    }
    static void dummy2(){

    }



}
