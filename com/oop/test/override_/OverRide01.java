package com.oop.test.override_;

/*
    重写
*   1.方法名，参数一致
*   2.子类的返回类型需要和父类的返回类型一致，或者是其子类
*   3.子类不能缩小父类的访问权限 public > protected > 默认 > private
* */

public class OverRide01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.cry();
    }
}
