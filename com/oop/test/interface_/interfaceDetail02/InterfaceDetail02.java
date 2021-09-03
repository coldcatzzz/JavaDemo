package com.oop.test.interface_.interfaceDetail02;

/*
* 2021年9月3日16:18:19
* 属性访问形式  接口名.属性名 Animal1.n1
* 接口的修饰符只能是public或默认，和类一样
* */

public class InterfaceDetail02 {
    public static void main(String[] args) {
        System.out.println(Animal1.n1);  // 说明 属性 n1 是static
//        Animal1.n1 = 200;  //报错  说明属性n1是final
    }
}

interface Animal1{

    //接口中的属性，只能是final，而且是 public static final修饰符
    //属性必须初始化
    int n1 = 100;
    public static final int n2 = 200; // Modifier 'public' is redundant for interface fields

//    private int n3 = 300;  //报错  说明修饰符只能是 public

    void cry();
}

interface Animal2{
    void run();
}

//接口不能继承其他的类，但是可以继承多个别的接口
interface Pet extends Animal1, Animal2{

}

//一个类可以实现多个接口
class Cat implements Animal1, Animal2{

    @Override
    public void cry() {

    }

    @Override
    public void run() {

    }
}