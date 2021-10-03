package com.peyman.generic;

import java.util.EmptyStackException;

public class Stack<T> {


    private int size;
    private int index;
    T[] arr;

    public Stack() {
        size = 10;
        index = -1;
        arr = (T[])new Object[size];
    }

    public T pop() throws EmptyStackException{
        if(index == -1)
            throw new EmptyStackException();
        else{
            //post decrimental operator
            return arr[index--];
        }

    }

    public void push(T element) throws StackIsFullException{
        if(index + 1 == size)
            throw new StackIsFullException();
        else{
            arr[++index] = element;
            System.out.printf("%d is add to stack%n", element);
        }

    }

}
