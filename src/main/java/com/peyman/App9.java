package com.peyman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class App9 {

    public static void main(String[] args) {
        //java 8 collection
        ArrayList<String> list = new ArrayList<>(Arrays.asList(new String[]{"ali", "234","1ali23" , "reza", "sara"}));
        Stream<String> stream =  list.stream();
        Predicate<String> stringsAreNotAlphabet = s -> !s.matches("[a-z]+");
        Predicate<String> stringsAreNumber = item -> item.matches("[1-9]+");

        boolean res =  stringsAreNotAlphabet.test("ali");
        boolean res2 =  stringsAreNotAlphabet.test("234");

        System.out.println(res + " " + res2);

        boolean res3 = stringsAreNumber.test("ali");
        boolean res4 = stringsAreNumber.test("123456");


        System.out.println(res3 + " " + res4);
        Function<String, Integer> getStringReturnInt = item -> convertStringToInteger(item);
        ;
//        Consumer<String> printString = item -> System.out.println(item);

        Integer finalRes =  stream
                .filter(s -> !s.matches("[a-z]+"))
                .map(getStringReturnInt)
                .sorted()
                .reduce((item1, item2) -> item1 + item2).get();

    }

    private static Integer convertStringToInteger(String item) {
        if(item.matches("[0-9]+")) return Integer.parseInt(item);
        else{
            String res = "";
            for (int i = 0; i < item.length() ; i++) {
                if(Character.isDigit(item.charAt(i))){
                    res+= item.charAt(i);
                }
            }
            return Integer.parseInt(res);
        }
    }
}
