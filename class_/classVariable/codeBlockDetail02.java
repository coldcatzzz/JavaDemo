package class_.classVariable;

/*
* 创建一个对象时，在一个类中的调用顺序
* 1. 调用静态代码块和静态属性初始化（有多个按照定义顺序）
* 2. 调用普通代码块和普通属性初始化（有多个按照定义顺序）
* 3. 调用构造器
* */

public class codeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A{

    private int n2 = getVal2();
    private static int n1 = getVal();

    {
        System.out.println("A 普通代码块");
    }

    static {
        System.out.println("A 静态代码块 ");
    }

    public static int getVal(){
        System.out.println("getVal 被调用。。。");
        return 100;
    }

    public int getVal2(){
        System.out.println("getVal2 被调用。。。");
        return 200;
    }

    public A() {
        System.out.println("构造器被调用。。。");
    }
}
