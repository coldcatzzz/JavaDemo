package com.oop.test.polymorphic;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("汤姆-");
        Dog dog = new Dog("小花狗--");
        Bone bone = new Bone("大排骨--");
        tom.feed(dog,bone);
        System.out.println("----------");

        Cat cat = new Cat("小花猫--");
        Fish fish = new Fish("黄花鱼--");
        tom.feed(cat, fish);

        System.out.println("----------");
        Rice rice = new Rice("大米饭--");
        Pig pig = new Pig("大白猪--");
        tom.feed(pig, rice);

    }
}
