package com.peyman.collections;

public class Book { //POJO plain old java object

    private String title;
    private int price;
    private int hash;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;

        if(! (obj instanceof Book))
            return false;
        Book arg = (Book)obj;
        if(this.title.equals(arg.title))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return String.format(" Book %s ", this.title);
    }

    @Override
    public int hashCode() {
//        this.hash = this.title.hashCode() + price;
        return hash;
    }
}
