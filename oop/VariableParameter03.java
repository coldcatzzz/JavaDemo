package oop;

/*
* 可变参数可以和普通参数一起使用，需要保证可变参数放在最后
* */

public class VariableParameter03 {
    public static void main(String[] args) {
        MyMethods03 m = new MyMethods03();
        m.sum("Tom", 1,2,3);
    }
}

class MyMethods03{
    public void sum(String name, int... nums){
        System.out.println(nums.length);
        System.out.println("Hello," + name);
    }
}
