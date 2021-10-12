package com.peyman.inheritance;

public class Cat implements IAnimal , Domestic{
    @Override
    public void voice() {
        System.out.println("Mio Mio");
    }

    @Override
    public int getPrize() {
        return 100;
    }

    @Override
    public String tellYourName() {
        return null;
    }


}
