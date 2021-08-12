package com.oop.test.polymorphic.polyOOP;

public class Cat01 extends Animal01{
    @Override
    public void eat() {
        System.out.println("Cao01 eat...");
    }

    public void catchMouse(){
        System.out.println("Cat01 catchMouse...");
    }
}
