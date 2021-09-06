package com.oop.test.innerclass;

/*
* 局部内部类
* 定义在方法或者代码块中
* */

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println("outer的hashcode:" + outer.hashCode());
        outer.m1();
    }
}

class Outer{
    private int n1 = 100;

    private void m2(){
        System.out.println("Outer m2()...");
    }

    public void m1(){

        //1.局部内部类是定义在外部类的局部变量，通常是在方法中
        //3.不能添加访问修饰符，但是可以用final修饰，阻止被继承
        //4.作用域：只在定义它的方法或代码块中
        final class Inner{
            private int n1 = 200;
            //2.可以直接访问外部类的所有成员，包括私有的
            public void f1(){
                //5.局部内部类可以直接访问外部类的成员，比如n1 m2()
                //6.外部类和局部内部类的成员重名，遵循就近原则
                //  访问外部类的成员，使用 外部类名.this.成员
                System.out.println("内部类n1=" + n1); //200
                //Outer.this 本质就是外部类的对象，即哪个对象调用了m1(),Outer.this就是哪个对象
                System.out.println("外部类n1=" + Outer.this.n1); //100
                System.out.println("Outer.this的hashcode:" + Outer.this.hashCode());
                m2();
            }
        }
        //6. 外部类在方法中，可以创建内部类 Inner对象，然后调用方法
        Inner inner = new Inner();
        inner.f1();
    }
}
