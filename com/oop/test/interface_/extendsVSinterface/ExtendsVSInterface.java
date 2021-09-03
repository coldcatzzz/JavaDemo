package com.oop.test.interface_.extendsVSinterface;

/*
* 继承，自动拥有父类的功能
* 如果子类需要扩展，可以通过实现接口的方式
* 可以理解成，实现接口是对java单继承的一种补充
*
*
* 解决的问题不同
* 继承：解决代码的复用性和可维护性 --> is a
* 接口：设计好各种规范（方法），让其他类去实现，更加灵活 --> like a
*
* 实现代码解耦：接口规范性+动态绑定
* */

public class ExtendsVSInterface {
    public static void main(String[] args) {
        LittleMonkey littleMonkey = new LittleMonkey("孙悟空");
        littleMonkey.climbing();
        littleMonkey.fly();
        littleMonkey.swim();
    }
}

class Monkey{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing(){
        System.out.println(name + " 会爬树...");
    }
}

interface BirdToFly{
    void fly();
}

interface FishToSwim{
    void swim();
}

class LittleMonkey extends Monkey implements BirdToFly, FishToSwim {
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " 通过学习会飞了。。。");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " 通过学习会游泳了。。。");
    }
}