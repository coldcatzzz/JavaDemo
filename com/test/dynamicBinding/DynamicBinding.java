package com.test.dynamicBinding;

/*
* 动态绑定
* 1. 调用对象方法，该方法会和该对象的内存地址/运行类型绑定
* 2. 调用对象属性，没有动态绑定机制，哪里声明哪里使用
*
* */

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }

}

class A{
    public int i = 10;

    public int sum(){
        return getI() + 10;
    }

    public int sum1(){
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B extends A{
    public int i = 20;

//    public int sum(){
//        return i + 20;
//    }

    public int getI(){
        return  i;
    }

//    public int sum1(){
//        return i + 10;
//    }
}
