package oop;

/*
 * 引用类型，地址传递
 * */

public class MethodParameter01 {
    public static void main(String[] args) {
        MethodParameter methodParameter = new MethodParameter();
        int[] arr = {1,2,3};
        methodParameter.changeMyArr(arr);
        System.out.println("main方法");
        for (int each:arr
             ) {
            System.out.println(each);
        }
    }
}

class MethodParameter{
    public void changeMyArr(int[] arr){
        arr[0] = 100;
        System.out.println("类方法");
        for (int each:arr
             ) {
            System.out.println(each);
        }
    }
}
