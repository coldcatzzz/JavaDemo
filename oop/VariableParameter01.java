package oop;

/*
* 可变参数
* */

public class VariableParameter01 {
    public static void main(String[] args) {
        MyMethod01 m = new MyMethod01();
        int result_sum = m.sum(1,3,4,6,55,44,33);
        System.out.println(result_sum);
    }
}

class MyMethod01{
    public int sum(int... nums){ // nums 看成数组
        System.out.println(nums.length);
        int res = 0;
        for (int i = 0; i<nums.length; i++){
            res += nums[i];
        }
        return res;
    }
}