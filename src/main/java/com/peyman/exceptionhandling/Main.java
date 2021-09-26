package com.peyman.exceptionhandling;

import com.peyman.data.Person;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int[] arr =  {2,31,5};
//        arr[3] = 4;
//        System.out.println("sdsd");
//        Person person = null;
//        person.getAge();
//        int res = Integer.parseInt("s123");
//        String s = new String("java is good");
//        s.substring(2,-7);

//        int year = 0;
//        try {
//            year = getYear("1400/12/12");
//        } catch (CustomException e) {
//            e.printStackTrace();
//        }
//        System.out.println(year);
//        int year2 = getYear2("00/12/12");
//        System.out.println(year2);
//
//
//        System.out.println("this is after catch block");
//
//        Integer.parseInt("a123");

//        System.out.println(f());

    }

    private static int testFinallyBlock(int input) throws Exception{
        if(input ==0 ) throw new Exception("");
        return input * -1;

    }

    // "1400/06/30"  --> 1400
    //risky method
    public static int getYear(String date) throws CustomException {
        try {
//            f();
        } catch (Exception e) {

        }
        if (date.matches("\\d\\d\\d\\d/\\d\\d/\\d\\d")) {
            String year = date.substring(0, 4);
            int result = Integer.parseInt(year);
            return result;
        } else {
            //Throwable
            throw new CustomException("اینجا خطا رخ داده است");
        }
    }

    public static int getYear2(String date) throws RuntimeException {
        if (date.matches("\\d\\d\\d\\d/\\d\\d/\\d\\d")) {
            String year = date.substring(0, 4);
            int result = Integer.parseInt(year);
            return result;
        } else {
            //Throwable
            throw new RuntimeException("خطا در برنامه رخ داده است در فلان متد و در فلان کلاس به این دلیل");
        }
    }


    static void g() throws Exception {
        throw new Exception();
    }


}
