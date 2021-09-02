package com.oop.test.interface_.interfaceDetail;

/*
* 接口中可以有属性，抽象方法，静态方法，默认方法
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
