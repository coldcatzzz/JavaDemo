package com.oop.test.innerclass;

/*
* 匿名内部类  1.本质是类 2.内部类 3.该类没有名字 4.同时还是一个对象
*
* */

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.method();
    }
}

class Outer01{
    private int n1 = 10;
    public void method(){
        //1.基于接口的匿名内部类
        //2.需求：使用IA接口，并创建对象
        //3.传统方式，写一个类，实现该接口，创建对象
        //4.需求是Tiger类只使用一次，后面不再使用
        //5.可以使用匿名内部类来简化开发
        //6.tiger的编译类型是 IA
        //7.tiger的运行类型是 匿名内部类 Outer01$1(由系统分配)

        /* 底层代码 分配类名，实现接口方法
        * class Outer01$1 implements IA{
        *   @Override
            public void cry() {
                System.out.println("老虎叫...");
            }
        * }
        * */

        //8.jdk底层在创建匿名内部类 Outer01$1 ，然后创建了 Outer01$1 的实例，并且把地址返回给tiger
        //9. 匿名内部类使用一次，就不能再使用 tiger对象可以无限使用
        IA tiger = new IA(){
            @Override
            public void cry() {
                System.out.println("老虎叫...");
            }
        };
        tiger.cry();
        tiger.cry();
        tiger.cry();
        System.out.println("tiger的运行类型:" + tiger.getClass()); //class com.oop.test.innerclass.Outer01$1

        //基于类的匿名内部类  注意有  {};
        //1.father的编译类型是Father
        //2.father的运行类型是Outer01$2
        //3.底层会创建匿名内部类

        /*
        * class Outer01$2 extends Father{}
        * */

        //同时也返回了匿名内部类 Outer01$2 的对象
        //("Jack") 参数列表会传递给构造器
        Father father = new Father("Jack",18){
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        father.test();
        System.out.println("father的运行类型:" + father.getClass()); //class com.oop.test.innerclass.Outer01$2

        //基于抽象类的匿名内部类
        //需要实现抽象类中的抽象方法
        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("动物吃东西。。。");
            }
        };
        animal.eat();

    }
}

interface IA{
    void cry();
}

class Father{
    public Father(String name, int age) {
        System.out.println("接收到的name:" + name);  //Jack
        System.out.println("接收到的age:" + age);    //18
    }

    public void test(){

    }
}

abstract class Animal{
    abstract void eat();
}
