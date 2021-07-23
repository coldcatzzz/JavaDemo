package VarScope;

/*
* 属性生命周期长，伴随对象创建而创建，伴随对象销毁而销毁
* 局部变量，代码块结束即销毁，即在一次方法调用过程中
* */

public class Scope01 {
    public static void main(String[] args) {
        Person p = new Person();
        p.say();
    }
}

class Person{
    String name = "Jack";  //属性

    public void say(){
//        String name = "Tom";  //局部变量
        System.out.println("Say " + name);
    }
}
