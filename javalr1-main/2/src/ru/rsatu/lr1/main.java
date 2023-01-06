package ru.rsatu.lr1;

import ru.rsatu.lr1.HelloWorld;

public class main {
    public static void main(String[] args) {
        HelloWorld.printHello("World");

        HelloWorld hello = new HelloWorld();
        hello.helloDyn("Wrld");
    }
}