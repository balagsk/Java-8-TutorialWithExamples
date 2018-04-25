package com.example.java;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


/*

Lambda expression is a new and important feature of Java 8.
It provides a clear and concise way to represent one method interface using an expression.
It is very useful in collection library.
It helps to iterate, filter and extract data from collection.

Lambda expression provides implementation of functional interface. An interface which has only one abstract method is called functional interface.
Java provides an anotation @FunctionalInterface, which is used to declare an interface as functional interface.


Java Lambda Expression Syntax:
(argument-list) -> {body}
 */

public class LamdaExpression {

    public static void main(String[] args) {

        // Multiple parameters in lambda expression
        Addable ad1 = (a, b) -> (a + b);
        System.out.println("Multiple parameters in lambda expression : "+ad1.add(10,20));

        // Multiple parameters with data type in lambda expression
        Addable ad2 = (int a, int b) -> (a + b);
        System.out.println("Multiple parameters with data type in lambda expression : " +ad2.add(100, 200));

        // Lambda expression with return keyword.
        Addable ad3=(int a,int b)->{  return (a+b);  };
        System.out.println("Lambda expression with return keyword : " +ad2.add(100,200));

        //ForEach with lambda expression
        List<String> list= new ArrayList<>();
        list.add("b");
        list.add("c");
        list.add("a");
        Collections.sort(list);
        list.forEach(
                (n)-> {System.out.println("ForEach with lambda expression : "+n);}
        );

    }
}


@FunctionalInterface //optional
interface Addable {
    int add(int a, int b);
}
