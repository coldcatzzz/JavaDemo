package com.test.extend_.extendsDetails;

public class Test {
    public static void main(String[] args) {
        Son son = new Son();
        son.name = "小明";
        son.age = 18;
        son.getInfo();

        Son son1 = new Son("小白",33,99);
        son1.getInfo();
        System.out.println(son1.getScore());

        Father father = new Father();
        System.out.println(father.name);
        System.out.println(father.age);

        son.so();
    }
}
