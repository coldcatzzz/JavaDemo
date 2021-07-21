package oop;

/*
* 基本数据类型，值传递
* */

public class MethodParameter02 {
    public static void main(String[] args) {
        Parameter parameter = new Parameter();
        int num = 1;
        parameter.changeNum(num);
        System.out.println("main方法");
        System.out.println(num);
    }
}

class Parameter{
    public void changeNum(int num){
        num = 3;
        System.out.println("类方法");
        System.out.println(num);
    }
}
