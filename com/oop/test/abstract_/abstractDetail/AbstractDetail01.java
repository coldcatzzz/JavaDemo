package com.oop.test.abstract_.abstractDetail;

/*
* 1. 抽象类不能被实例化
* 2. 抽象类可以没有抽象方法
* 3. 一旦类包含抽象方法，则这个类必须声明为抽象类
* 4. abstract 只能修饰 类 和 方法
* 5. 抽象类可以有任意成员（抽象类也是类）， 如非抽象方法，构造器，静态属性等
* 6. (一个类继承了抽象类，则必须实现抽象类的所有‘抽象’方法，除非它自己也被声明成抽象类)
* 7. 抽象方法不能使用 private final static 修饰，因为与重写冲突
* */

public class AbstractDetail01 {
    public static void main(String[] args) {
        new C().hi();
    }
}

abstract class A{

    //普通方法
    public void hi(){
        System.out.println("hi");
    }

    //普通代码块
    {
        System.out.println("普通代码块");
    }

    //静态代码块
    static {
        System.out.println("静态代码块");
    }

    //构造器
    public A() {
    }

    //静态属性
    private static int n1 = 100;

    //静态方法
    public static void cry(){
        System.out.println("静态方法...");
    }
}

abstract class B{
    public abstract void hi();
}

class C extends B{
    @Override
    public void hi() {
        System.out.println("你好，李焕英");
    }
}

abstract class Test{
    private static double n1 = 100;
    public abstract void run();

    //抽象方法不能用static修饰，因为static方法有方法体，与abstract方法相悖
//    public static abstract void run2();

    public static void walk(){
        System.out.println("walk...");
    }
}

class TestSon extends Test{
    @Override
    public void run() {
        System.out.println("hi");
    }

}
