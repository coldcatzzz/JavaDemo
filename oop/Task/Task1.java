package oop.Task;

/*
* 安全方法
* 内存当中该方法仅存一份
* 节省资源
* */

public class Task1 {
    public static void main(String[] args) {
        double[] arr = {1.1,3.3};
        Double result = A01.getMax(arr);
        if (result != null){
            System.out.println(result);
        }else {
            System.out.println("请不要传空数组");
        }
    }
}

class A01{
    static Double getMax(double[] arr){
        if (arr != null &&arr.length > 0){
            double max = 0.0;
            for (double v : arr) {
                if (v > max) {
                    max = v;
                }
            }
            return max;
        }else {
            return null;
        }
    }
}
