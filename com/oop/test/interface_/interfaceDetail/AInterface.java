package com.oop.test.interface_.interfaceDetail;

/*
* 接口中可以有属性，抽象方法，静态方法，默认方法
* 接口不能实例化
* 接口中所有方法都是public
* 接口中的抽象方法，可以不用abstract修饰
* 抽象类实现接口，可以不实现接口的方法
* */

public interface AInterface {
    public int n1 = 10;

    //在接口中，抽象方法可以不用 abstract 修饰
    public void hi();

    //静态方法
    public static void cry(){
        System.out.println("cry...");
    }

    //默认方法
    default public void run(){
        System.out.println("run...");
    }
}

class Cat implements AInterface{
    @Override
    public void hi() {

    }

    @Override
    public void run() {
        AInterface.super.run();
    }
}

abstract class Dog implements AInterface{

}

