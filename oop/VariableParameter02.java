package oop;

/*
* 可变参数的实参，可以是数组
* */

public class VariableParameter02 {
    public static void main(String[] args) {
        MyMethods02 m = new MyMethods02();
        int[] arr = {1,2,3};
        m.sum(arr);
    }
}

class MyMethods02{
    public int sum(int... nums){
        System.out.println(nums.length);
        return 0;
    }
}
