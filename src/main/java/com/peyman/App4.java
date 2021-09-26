package com.peyman;

import com.peyman.inheritance.IAnimal;
import com.peyman.inheritance.Operation;
import com.peyman.innerclass.StaticInnerClassPerson;
import com.peyman.innerclass.Student;

public class App4 {


    public static void main(String[] args) {
        Student student = new Student();
        Student.StudentCard studentCard = new Student().new StudentCard();
        studentCard.f();

        Student.Info info = new Student.Info();
        StaticInnerClassPerson person = new StaticInnerClassPerson();



        //functional interface
        IAnimal animal = () -> System.out.println("Some dummy voice");
        animal.voice();
        Operation sum1 =(left, right) -> left + right ;
        Operation sumPlus100 =(left, right) -> (left + right) + 100  ;
        Operation operation = new Operation() {
            @Override
            public int sum(int a, int b) {
                return a + b + 100;
            }
        };

        int res = sum1.sum(12,34);
        int res2 = sumPlus100.sum(12,34);
        int res3 = operation.sum(12,34);

    }
}
