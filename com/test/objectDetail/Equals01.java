package com.test.objectDetail;

/*
* == 既可以判断基本类型，也可以判断引用类型
* == 如果判断基本类型，判断的是值相等
* == 如果判断引用类型，判断的是地址相等
*
 */

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        System.out.println(a.equals(b));
    }
}

class A{}
