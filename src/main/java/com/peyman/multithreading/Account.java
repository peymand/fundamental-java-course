package com.peyman.multithreading;

public class Account {

    private int balance;


    public Account(int balance) {
        this.balance = balance;
    }

    public  void deposit(int amount) throws InterruptedException {
        wait();
        this.balance+=amount;
    }

    public synchronized void withdraw(int amount){
        notify();
        this.balance-=amount;
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
