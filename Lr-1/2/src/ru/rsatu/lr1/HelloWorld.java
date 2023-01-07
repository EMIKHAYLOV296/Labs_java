package ru.rsatu.lr1;

public class HelloWorld {
    static String HELLO = "Hello ";
    public static void printHello(String name) {
        System.out.println(HELLO+name+"!");
    }

    public void helloDyn(String name) {
        System.out.println("Dynamic Hello "+name+"!");
    }
}