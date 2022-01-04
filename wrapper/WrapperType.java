package wrapper;

/*

包装类
装箱:基本类型 -> 包装类型
拆箱:包装类型 -> 基本类型  JDK5以后自动 装箱拆箱


* boolean -> Boolean
* char -> Character
* byte -> Byte
* short -> Short
* int -> Integer
* long -> Long
* float -> Float
* double -> Double
*
* */

public class WrapperType {
    public static void main(String[] args) {
        //演示 int <-> Integer 装箱 拆箱
        //jdk5 以前
        //手动装箱 int -> Integer
        int n1 = 100;
        Integer integer1 = Integer.valueOf(n1);
        Integer integer2 = new Integer(n1);

        //手动拆箱 Integer -> int
        int n2 = integer1.intValue();

        //jdk5 以后 自动
        int n3 = 200;
        //自动装箱 int -> Integer
        Integer integer3 = n3;  //底层使用的是Integer.valueOf()

        //自动拆箱 Integer -> int
        int n4 = integer3;      //底层使用的是intValue()

        //test
        Object obj1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(obj1);  //1.0 因为三元运算符是一个整体，按照最高进度double算
    }
}
