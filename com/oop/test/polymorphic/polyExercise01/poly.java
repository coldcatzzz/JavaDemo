package com.oop.test.polymorphic.polyExercise01;

/*
* 重载与重写 实现多态
* */

public class poly {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.sum(1, 2));
        System.out.println(a.sum(3, 4, 6));

        B b = new B();
        b.say();
        a.say();

    }
}

class B{
    public void say(){
        System.out.println("B say() 方法被调用...");
    }
}

class A extends B{
    public int sum(int n1, int n2){
        return n1 + n2;
    }

    public int sum(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public void say(){
        System.out.println("A say() 方法被调用...");
    }
}
