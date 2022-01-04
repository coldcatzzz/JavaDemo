package wrapper;

public class WrapperExercise01 {
    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j); //false

        Integer n = 1;
        Integer m = 1;
        System.out.println(n == m);  // -127 ~ 128 之内返回true (源码)

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);  // false  源码: return new Integer(i);
    }
}


