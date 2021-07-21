package Recursion;

/*
* 方法重载
* 方法名相同，形参不同
* */

public class Calculator {
    public static void main(String[] args) {
        Test06 t = new Test06();
        t.calculator(1, 3);
        t.calculator(1, 3.5);
        t.calculator(5.5, 6);
        t.calculator(3, 4, 5);
    }
}

class Test06{

    public void calculator(int n1, int n2){
        System.out.println(n1 + n2);
    }

    public void calculator(int n1, double n2){
        System.out.println(n1 + n2);
    }

    public void calculator(double n1, int n2){
        System.out.println(n1 + n2);
    }

    public void calculator(int n1, int n2, int n3){
        System.out.println(n1 + n2 + n3);
    }
}
