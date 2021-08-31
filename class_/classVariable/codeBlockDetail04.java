package class_.classVariable;

/*
一 ： 进行类的加载
    (1) 先加载父类 (2) 再加载子类
二 ： 创建对象
    (1) 从子类的构造器开始

* 创建子类对象时，他们的静态代码块，静态属性初始化，普通代码块，普通属性初始化，构造器 调用顺序：
* 1. 父类的静态代码块和静态属性（多个按定义顺序执行）
* 2. 子类的静态代码块和静态属性（多个按定义顺序执行）
* 3. 父类的普通代码块和普通属性（多个按定义顺序执行）
* 4. 父类的构造器
* 5. 子类的普通代码块和普通属性（多个按定义顺序执行）
* 6. 子类构造器

*** 静态代码块只能调用静态成员 （静态属性，静态方法）
*** 普通代码块可以任意调用
* */

public class codeBlockDetail04 {
    public static void main(String[] args) {
        new CC();
    }
}

class AA{
    public static int n1 = 100;
    public int n4 = 400;

    static {
        System.out.println("AA的静态代码块");
    }

    {
        System.out.println("AA的普通代码块");
    }

    public AA() {
        System.out.println("AA的构造器");
    }
}

class BB extends AA{
    public static int n3 = 300;
    public int n5 = 500;

    static {
        System.out.println("BB的静态代码块");
    }

    {
        System.out.println("BB的普通代码块");
    }

    public BB() {
        System.out.println("BB的构造器");
    }
}

class CC extends BB{

    private static int n2 = 200;
    private int n6 = 600;

    static {
        System.out.println("CC的静态代码块");
    }

    {
        System.out.println("CC的普通代码块");
    }

    public CC() {
        // 隐藏内容
        // 1. super()
        // 2. 普通代码块，普通属性初始化
        System.out.println("CC的构造器");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);

    }
}
