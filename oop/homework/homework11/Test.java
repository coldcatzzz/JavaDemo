package oop.homework.homework11;

public class Test {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A{
    public A() {
        System.out.println("我是A类"); //1
    }
}

class B extends A{
    public B() {
        System.out.println("我是B类的无参构造器");
    }

    public B(String name){
        System.out.println(name + "我是B类的有参构造器");//2
    }
}

class C extends B{
    public C() {
        this("hello");
        System.out.println("我是C类的无参构造器");//4
    }

    public C(String name){
        super("haha");
        System.out.println("我是C类的有参构造器");//3
    }
}
