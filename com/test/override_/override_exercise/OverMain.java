package com.test.override_.override_exercise;

public class OverMain {
    public static void main(String[] args) {
        Person jack = new Person("Jack", 22);
        System.out.println(jack.getInfo());
        System.out.println("---------");

        Student tom = new Student("Tom", 33, 123321, 88.5);
        System.out.println(tom.getInfo());
    }
}
