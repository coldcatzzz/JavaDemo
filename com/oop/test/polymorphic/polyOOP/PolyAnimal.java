package com.oop.test.polymorphic.polyOOP;

public class PolyAnimal {
    public static void main(String[] args) {
        //向上转型
        Animal01 animal01 = new Cat01();
        animal01.run();

        //向下转型
        Cat01 cat01 = (Cat01) animal01;
        cat01.catchMouse();

        //error
//        Dog01 dog01 = (Dog01) animal01;
    }
}
