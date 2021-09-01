package com.oop.test.final_;

/*
* final 可以修饰类，属性，方法，局部变量
* 1. 类不被继承
* 2. 父类的方法不被子类重写
* 3. 类的某个属性值被修改
* 4. 局部变量被修改
* */

public class Final01 {
    public static void main(String[] args) {
        A a = new A();
//        a.n1 = 200;
    }
}


class A{
    public final int n1 = 100;
}
