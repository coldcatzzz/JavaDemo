package com.test.polymorphic.objectPoly_;

/*
* 属性没有重写之说，属性的值看编译类型
* */

public class PolyTest01 {
    public static void main(String[] args) {
        Base base = new Sub();
        System.out.println(base.n1);  // 10
    }

}

class Base{
    int n1 = 10;
}

class Sub extends Base{
    int n1 = 20;
}
