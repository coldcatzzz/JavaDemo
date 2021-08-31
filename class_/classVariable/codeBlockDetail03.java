package class_.classVariable;

/*
构造器前面隐含了 super() 和 调用普通代码块

* class B{

    public B() {
        super();  // 1. 隐藏的调用父类构造器
                  // 2. 隐藏的调用本类的普通代码块
        System.out.println("ok");
    }
}

* */

public class codeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();
    }
}

class AAA{

    {
        System.out.println("AAA普通代码块");
    }

    public AAA() {
        System.out.println("AAA()构造器被调用");
    }
}

class BBB extends AAA{
    {
        System.out.println("BBB普通代码块");
    }

    public BBB() {
        // 1. super()
        // 2. 调用本类普通代码块
        System.out.println("BBB()构造器被调用");
    }
}
