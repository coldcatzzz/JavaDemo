package com.oop.test.finalDetail01;

public class FinalDetail01 {
    public static void main(String[] args) {
        new CC();
        new EE().call();
        System.out.println(GG.n1);
    }
}

class AA{
    /*
      final修饰的属性又叫常量， 一般用 TAX_RATE 命名
      在定义时就必须赋值，在以下三个位置皆可
    * 1. 定义时
    * 2. 在构造器
    * 3. 在代码块
    * */

    public final double TAX_RATE1 = 0.88;
    public final double TAX_RATE2;
    public final double TAX_RATE3;

    public AA() {
        TAX_RATE2 = 3.3;
    }

    {
        TAX_RATE3 = 5.5;
    }
}

class BB{
    /*
    * final 修饰的属性是静态的，贼初始化的位置只能是
    * 1. 定义时
    * 2. 静态代码块
    * （不能在构造器，因为静态属性是类加载的时候就加载，而构造器在创建对象的时候才加载）
    * */

    public static final double TAX_RATE1 = 5.5;
    public static final double TAX_RATE2;

    static {
        TAX_RATE2 = 6.6;
    }
}

//final 类可以实例化，但是不能被继承
final class CC{

}

//class DD extends CC{
//
//}

// 非final 类，含有final方法，则该方法不能被重写，但是该方法可以被继承
class DD{
    public final void call(){
        System.out.println("Hi,how are you");
    }
}

class EE extends DD{

}

//类用final修饰了，类的方法就不需要再用final了
final class FF{
    public void cry(){}
}

//final 和 static 往往搭配使用，效率更高，不会导致类加载，底层编译器做了优化处理
class GG{
    public final static int n1 = 100;
    static {
        System.out.println("GG类的静态代码块");
    }
}
