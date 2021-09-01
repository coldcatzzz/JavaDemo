package com.oop.test.abstract_;

public class Abstract01 {
}

/*
* 抽象方法没有方法体
* 类中存在抽象方法，则类也需要声明为抽象类
* 一般抽象类被继承，子类实现抽象方法
* */

abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
}

